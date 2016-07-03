package apacheThriftSrvA;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeticionSalida {

	public Map<String, String> cabecera; // required
	public Map<String, List<Prenda>> cuerpo; // required
	public String aviso; // required

	public PeticionSalida() {
	}

	public PeticionSalida(Map<String, String> cabecera, Map<String, List<Prenda>> cuerpo, String aviso) {
		this();
		this.cabecera = cabecera;
		this.cuerpo = cuerpo;
		this.aviso = aviso;
	}

	public void putToCabecera(String key, String val) {
		if (this.cabecera == null) {
			this.cabecera = new HashMap<String, String>();
		}
		this.cabecera.put(key, val);
	}

	public Map<String, String> getCabecera() {
		return this.cabecera;
	}

	public PeticionSalida setCabecera(Map<String, String> cabecera) {
		this.cabecera = cabecera;
		return this;
	}

	public void putToCuerpo(String key, List<Prenda> val) {
		if (this.cuerpo == null) {
			this.cuerpo = new HashMap<String, List<Prenda>>();
		}
		this.cuerpo.put(key, val);
	}

	public Map<String, List<Prenda>> getCuerpo() {
		return this.cuerpo;
	}

	public PeticionSalida setCuerpo(Map<String, List<Prenda>> cuerpo) {
		this.cuerpo = cuerpo;
		return this;
	}

	public String getAviso() {
		return this.aviso;
	}

	public PeticionSalida setAviso(String aviso) {
		this.aviso = aviso;
		return this;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("MensajeOutServicio(");
		boolean first = true;

		sb.append("cabecera:");
		if (this.cabecera == null) {
			sb.append("null");
		} else {
			sb.append(this.cabecera);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("cuerpo:");
		if (this.cuerpo == null) {
			sb.append("null");
		} else {
			sb.append(this.cuerpo);
		}
		first = false;
		if (!first)
			sb.append(", ");
		sb.append("aviso:");
		if (this.aviso == null) {
			sb.append("null");
		} else {
			sb.append(this.aviso);
		}
		first = false;
		sb.append(")");
		return sb.toString();
	}
}
