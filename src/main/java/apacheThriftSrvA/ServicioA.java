package apacheThriftSrvA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration
public class ServicioA {

	@RequestMapping(value = "/servicioA", method = RequestMethod.POST)
	public @ResponseBody PeticionSalida servicioAThrift(@RequestBody PeticionEntrada peticionEntrada) {

		PeticionSalida responseMessage = new PeticionSalida();
		long iniTime = System.currentTimeMillis();
		
		try {

			// instanciamos el bean de llamada al servicio B con los datos de llamada al servicioA
			MensajeInServicioNoThrift inServicioB = new MensajeInServicioNoThrift(peticionEntrada);

			// invocamos al  microservicio servicioB, enviandos el bean formateado en rest
			RestTemplate restTemplate = new RestTemplate();
			MensajeOutServicioNoThrift outServicioB = restTemplate.postForObject("no-thrift-srvb:8080/servicioB",
																				 inServicioB, 
																				 MensajeOutServicioNoThrift.class);

			// Tratamos la salida del servicioB para construir la la salida del servicioA
			responseMessage = convertMensajeOutServicioNoThrift_TO_PeticionSalida(outServicioB);

		} catch (Exception e) {

			e.printStackTrace();

		}
		System.out.println(".   FIN ServicioA.  ts = {" + (System.currentTimeMillis() - iniTime) + "}");
		return responseMessage;
	}
	
	/**
	 * metodo que transforma el bean
	 * @param outServicioB
	 * @return
	 */
	public PeticionSalida convertMensajeOutServicioNoThrift_TO_PeticionSalida(MensajeOutServicioNoThrift outServicioB){
		
		// instanciamos una lista de prendas 
		List<Prenda> prendas = new ArrayList<Prenda>();
		Prenda prenda = null;
		
		//instanciamos la una lista de PrendaNoThrift para extraer los datos de la llamada al servicioB
		List<PrendaNoThrift> prendasNoThrift = outServicioB.getCuerpo().get("Prendas");
		
		// Si tiene contenido extraemos las prendas y las ponemos en la lista
		if (prendasNoThrift != null) {
			for (PrendaNoThrift prendaNoThrift : prendasNoThrift) {
				prenda = new Prenda();
				prenda.setColor(prendaNoThrift.getColor());
				prenda.setDescripcion(prendaNoThrift.getDescripcion());
				prenda.setNombre(prendaNoThrift.getNombre());
				prenda.setTalla(prendaNoThrift.getTalla());
				prenda.setTipo(Tipo.findByValue(prendaNoThrift.getTipo().getValue()));
				prenda.setStock(prendaNoThrift.getStock());
				prendas.add(prenda);
			}
		}

		// lo ponemos en un map para el cuerpo del mensaje PeticionSalida (servicioA)
		Map<String, List<Prenda>> cuerpoSalida = new HashMap<String, List<Prenda>>();
		cuerpoSalida.put("Prendas", prendas);
		
		// Retornamos una PeticionSalida con header, body y aviso
		return new PeticionSalida(outServicioB.getCabecera(), cuerpoSalida, outServicioB.getAviso());
	}
	

	/*******************************************
	 * MAIN *
	 * 
	 * @param args
	 *            *
	 * @throws Exception
	 *             *
	 ******************************************/
	public static void main(String[] args) throws Exception {
		SpringApplication.run(ServicioA.class, args);
	}
}
