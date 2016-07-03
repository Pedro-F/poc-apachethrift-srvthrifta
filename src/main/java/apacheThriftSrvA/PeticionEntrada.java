package apacheThriftSrvA;

public class PeticionEntrada{

	private String tipoPrenda;
	private String color;
	
//	{"tipoPrenda":"PANTALON","color":"AZUL"}
	
	public String getTipoPrenda() {
		return tipoPrenda;
	}

	public void setTipoPrenda(String tipoPrenda) {
		this.tipoPrenda = tipoPrenda;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder("PeticionEntrada(");
	    boolean first = true;
	    sb.append("TipoPrenda:");
	    if (this.tipoPrenda == null) {
	      sb.append("null");
	    } else {
	      sb.append(this.tipoPrenda);
	    }
	    first = false;
	    if (!first) sb.append(", ");
	    sb.append("Color:");
	    if (this.color == null) {
	      sb.append("null");
	    } else {
	      sb.append(this.color);
	    }
	    first = false;
	    sb.append(")");
	    return sb.toString();
	}
}
