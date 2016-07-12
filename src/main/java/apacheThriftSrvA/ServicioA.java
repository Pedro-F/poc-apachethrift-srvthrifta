package apacheThriftSrvA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class ServicioA {

	ThriftService.Client client = null;
	@RequestMapping(value = "/servicioA", method = RequestMethod.POST)
	public @ResponseBody PeticionSalida servicioAThrift(@RequestBody PeticionEntrada peticionEntrada,
											@RequestParam(value="param1", defaultValue="1") String size) {

		PeticionSalida responseMessage = new PeticionSalida();
		long iniTime = 0;
		long finTime = 0;
		long mediaTime = 0;
		int tamanio;
		
		try{
			tamanio = Integer.parseInt(size);
		}
		catch(Exception e){
			tamanio = 1;
		}

		try {

			init();

	        Map<String,String> cabecera = new HashMap<String,String>();
	        cabecera.put("Usuario", "000001");
	        cabecera.put("Cadena", "Zara");
	        cabecera.put("UID", UUID.randomUUID().toString());
	        System.out.println("Petición con UID: " + cabecera.get("UID"));
	        Map<String,String> cuerpo = new HashMap<String,String>();
	        cuerpo.put("TipoPrenda", peticionEntrada.getTipoPrenda().toUpperCase());
	        cuerpo.put("Color", peticionEntrada.getColor().toUpperCase());

	        MensajeInServicio mensajeIn = new MensajeInServicio(cabecera, cuerpo);
	        MensajeOutServicio respuestaThrift = null;
	        
	        iniTime = System.currentTimeMillis();
	        
			for(int i = 0;i<tamanio;i++){
				respuestaThrift = client.recuperaPrendas(mensajeIn);
			}
			finTime = System.currentTimeMillis();
			
			// Tratamos la salida del servicioB para construir la la salida del
			// servicioA
			responseMessage = convertMensajeOutServicioNoThrift_TO_PeticionSalida(respuestaThrift);

		} catch (Exception e) {

			e.printStackTrace();

		}
		
		if ((finTime > iniTime) && (tamanio > 0)){
			mediaTime = (finTime - iniTime)/tamanio;
			System.out.println(".   FIN ServicioA.  Se han lanzado " + tamanio + " Peticiones" +
			"En un tiempo de " + (finTime - iniTime) + "Milisegundos. La media es " + mediaTime);
		}
		else{
			System.out.println(".   FIN ServicioA. Numero de ejecuciones = " + tamanio +
					"Tiempo inicial = " + iniTime + ", Tiempo final = " + finTime + ".");
		}
		
		
		return responseMessage;
	}

	private void init() throws Exception {

		if (client == null) {
//			TTransport transport = new THttpClient("http://localhost:8081/servicioB/");
//
//			TProtocol protocol = new TCompactProtocol(transport);
//
//			client = new ThriftService.Client(protocol);
//	        transport.open();
	        
	        TTransport transport = new TFramedTransport(new TSocket("thrift-srvb", 9094)); 
	        TProtocol protocol = new TJSONProtocol(transport); 
//	        ThriftService.Client client = new ThriftService.Client(protocol); 
	        client = new ThriftService.Client(protocol);
	        transport.open();
		}
	}

	/**
	 * 
	 * @param outServicioB
	 * @return
	 */
	public PeticionSalida convertMensajeOutServicioNoThrift_TO_PeticionSalida(MensajeOutServicio outServicioB) {

		// instanciamos una lista de prendas
		List<Prenda> prendas = new ArrayList<Prenda>();
		Prenda prenda = null;

		// instanciamos la una lista de PrendaNoThrift para extraer los datos de
		// la llamada al servicioB
		List<PrendaThrift> prendasThrift = outServicioB.getCuerpo().get("Prendas");

		// Si tiene contenido extraemos las prendas y las ponemos en la lista
		if (prendasThrift != null) {
			for (PrendaThrift prendaThrift : prendasThrift) {
				prenda = new Prenda();
				prenda.setColor(prendaThrift.getColor());
				prenda.setDescripcion(prendaThrift.getDescripcion());
				prenda.setNombre(prendaThrift.getNombre());
				prenda.setTalla(prendaThrift.getTalla());
				prenda.setTipo(Tipo.findByValue(prendaThrift.getTipo().getValue()));
				prenda.setStock(prendaThrift.getStock());
				prendas.add(prenda);
			}
		}

		// lo ponemos en un map para el cuerpo del mensaje PeticionSalida
		// (servicioA)
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
