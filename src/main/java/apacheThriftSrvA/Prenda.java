/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package apacheThriftSrvA;

public class Prenda {
 
public String nombre; // required
  public Tipo tipo; // required
  public String talla; // required
  public String color; // required
  public String descripcion; // required
  public String stock; // required

  public Prenda() {
  }

  public Prenda(
    String nombre,
    Tipo tipo,
    String talla,
    String color,
    String descripcion,
    String stock)
  {
    this();
    this.nombre = nombre;
    this.tipo = tipo;
    this.talla = talla;
    this.color = color;
    this.descripcion = descripcion;
    this.stock = stock;
  }

  public String getNombre() {
    return this.nombre;
  }

  public Prenda setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

 
  public Tipo getTipo() {
    return this.tipo;
  }

  public Prenda setTipo(Tipo tipo) {
    this.tipo = tipo;
    return this;
  }

  public String getTalla() {
    return this.talla;
  }

  public Prenda setTalla(String talla) {
    this.talla = talla;
    return this;
  }

  public String getColor() {
    return this.color;
  }

  public Prenda setColor(String color) {
    this.color = color;
    return this;
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public Prenda setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  public String getStock() {
    return this.stock;
  }

  public Prenda setStock(String stock) {
    this.stock = stock;
    return this;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Prenda(");
    boolean first = true;

    sb.append("nombre:");
    if (this.nombre == null) {
      sb.append("null");
    } else {
      sb.append(this.nombre);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("tipo:");
    if (this.tipo == null) {
      sb.append("null");
    } else {
      sb.append(this.tipo);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("talla:");
    if (this.talla == null) {
      sb.append("null");
    } else {
      sb.append(this.talla);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("color:");
    if (this.color == null) {
      sb.append("null");
    } else {
      sb.append(this.color);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("descripcion:");
    if (this.descripcion == null) {
      sb.append("null");
    } else {
      sb.append(this.descripcion);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("stock:");
    sb.append(this.stock);
    first = false;
    sb.append(")");
    return sb.toString();
  }

}
