/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package apacheThriftSrvA;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-06-17")
public class PrendaThrift implements org.apache.thrift.TBase<PrendaThrift, PrendaThrift._Fields>, java.io.Serializable, Cloneable, Comparable<PrendaThrift> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PrendaThrift");

  private static final org.apache.thrift.protocol.TField NOMBRE_FIELD_DESC = new org.apache.thrift.protocol.TField("nombre", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TIPO_FIELD_DESC = new org.apache.thrift.protocol.TField("tipo", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField TALLA_FIELD_DESC = new org.apache.thrift.protocol.TField("talla", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField COLOR_FIELD_DESC = new org.apache.thrift.protocol.TField("color", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField DESCRIPCION_FIELD_DESC = new org.apache.thrift.protocol.TField("descripcion", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("stock", org.apache.thrift.protocol.TType.STRING, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PrendaThriftStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PrendaThriftTupleSchemeFactory());
  }

  public String nombre; // required
  /**
   * 
   * @see TipoThrift
   */
  public TipoThrift tipo; // required
  public String talla; // required
  public String color; // required
  public String descripcion; // required
  public String stock; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NOMBRE((short)1, "nombre"),
    /**
     * 
     * @see TipoThrift
     */
    TIPO((short)2, "tipo"),
    TALLA((short)3, "talla"),
    COLOR((short)4, "color"),
    DESCRIPCION((short)5, "descripcion"),
    STOCK((short)6, "stock");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NOMBRE
          return NOMBRE;
        case 2: // TIPO
          return TIPO;
        case 3: // TALLA
          return TALLA;
        case 4: // COLOR
          return COLOR;
        case 5: // DESCRIPCION
          return DESCRIPCION;
        case 6: // STOCK
          return STOCK;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NOMBRE, new org.apache.thrift.meta_data.FieldMetaData("nombre", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TIPO, new org.apache.thrift.meta_data.FieldMetaData("tipo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TipoThrift.class)));
    tmpMap.put(_Fields.TALLA, new org.apache.thrift.meta_data.FieldMetaData("talla", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COLOR, new org.apache.thrift.meta_data.FieldMetaData("color", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DESCRIPCION, new org.apache.thrift.meta_data.FieldMetaData("descripcion", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STOCK, new org.apache.thrift.meta_data.FieldMetaData("stock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PrendaThrift.class, metaDataMap);
  }

  public PrendaThrift() {
  }

  public PrendaThrift(
    String nombre,
    TipoThrift tipo,
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

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PrendaThrift(PrendaThrift other) {
    if (other.isSetNombre()) {
      this.nombre = other.nombre;
    }
    if (other.isSetTipo()) {
      this.tipo = other.tipo;
    }
    if (other.isSetTalla()) {
      this.talla = other.talla;
    }
    if (other.isSetColor()) {
      this.color = other.color;
    }
    if (other.isSetDescripcion()) {
      this.descripcion = other.descripcion;
    }
    if (other.isSetStock()) {
      this.stock = other.stock;
    }
  }

  public PrendaThrift deepCopy() {
    return new PrendaThrift(this);
  }

  @Override
  public void clear() {
    this.nombre = null;
    this.tipo = null;
    this.talla = null;
    this.color = null;
    this.descripcion = null;
    this.stock = null;
  }

  public String getNombre() {
    return this.nombre;
  }

  public PrendaThrift setNombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  public void unsetNombre() {
    this.nombre = null;
  }

  /** Returns true if field nombre is set (has been assigned a value) and false otherwise */
  public boolean isSetNombre() {
    return this.nombre != null;
  }

  public void setNombreIsSet(boolean value) {
    if (!value) {
      this.nombre = null;
    }
  }

  /**
   * 
   * @see TipoThrift
   */
  public TipoThrift getTipo() {
    return this.tipo;
  }

  /**
   * 
   * @see TipoThrift
   */
  public PrendaThrift setTipo(TipoThrift tipo) {
    this.tipo = tipo;
    return this;
  }

  public void unsetTipo() {
    this.tipo = null;
  }

  /** Returns true if field tipo is set (has been assigned a value) and false otherwise */
  public boolean isSetTipo() {
    return this.tipo != null;
  }

  public void setTipoIsSet(boolean value) {
    if (!value) {
      this.tipo = null;
    }
  }

  public String getTalla() {
    return this.talla;
  }

  public PrendaThrift setTalla(String talla) {
    this.talla = talla;
    return this;
  }

  public void unsetTalla() {
    this.talla = null;
  }

  /** Returns true if field talla is set (has been assigned a value) and false otherwise */
  public boolean isSetTalla() {
    return this.talla != null;
  }

  public void setTallaIsSet(boolean value) {
    if (!value) {
      this.talla = null;
    }
  }

  public String getColor() {
    return this.color;
  }

  public PrendaThrift setColor(String color) {
    this.color = color;
    return this;
  }

  public void unsetColor() {
    this.color = null;
  }

  /** Returns true if field color is set (has been assigned a value) and false otherwise */
  public boolean isSetColor() {
    return this.color != null;
  }

  public void setColorIsSet(boolean value) {
    if (!value) {
      this.color = null;
    }
  }

  public String getDescripcion() {
    return this.descripcion;
  }

  public PrendaThrift setDescripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  public void unsetDescripcion() {
    this.descripcion = null;
  }

  /** Returns true if field descripcion is set (has been assigned a value) and false otherwise */
  public boolean isSetDescripcion() {
    return this.descripcion != null;
  }

  public void setDescripcionIsSet(boolean value) {
    if (!value) {
      this.descripcion = null;
    }
  }

  public String getStock() {
    return this.stock;
  }

  public PrendaThrift setStock(String stock) {
    this.stock = stock;
    return this;
  }

  public void unsetStock() {
    this.stock = null;
  }

  /** Returns true if field stock is set (has been assigned a value) and false otherwise */
  public boolean isSetStock() {
    return this.stock != null;
  }

  public void setStockIsSet(boolean value) {
    if (!value) {
      this.stock = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NOMBRE:
      if (value == null) {
        unsetNombre();
      } else {
        setNombre((String)value);
      }
      break;

    case TIPO:
      if (value == null) {
        unsetTipo();
      } else {
        setTipo((TipoThrift)value);
      }
      break;

    case TALLA:
      if (value == null) {
        unsetTalla();
      } else {
        setTalla((String)value);
      }
      break;

    case COLOR:
      if (value == null) {
        unsetColor();
      } else {
        setColor((String)value);
      }
      break;

    case DESCRIPCION:
      if (value == null) {
        unsetDescripcion();
      } else {
        setDescripcion((String)value);
      }
      break;

    case STOCK:
      if (value == null) {
        unsetStock();
      } else {
        setStock((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NOMBRE:
      return getNombre();

    case TIPO:
      return getTipo();

    case TALLA:
      return getTalla();

    case COLOR:
      return getColor();

    case DESCRIPCION:
      return getDescripcion();

    case STOCK:
      return getStock();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NOMBRE:
      return isSetNombre();
    case TIPO:
      return isSetTipo();
    case TALLA:
      return isSetTalla();
    case COLOR:
      return isSetColor();
    case DESCRIPCION:
      return isSetDescripcion();
    case STOCK:
      return isSetStock();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PrendaThrift)
      return this.equals((PrendaThrift)that);
    return false;
  }

  public boolean equals(PrendaThrift that) {
    if (that == null)
      return false;

    boolean this_present_nombre = true && this.isSetNombre();
    boolean that_present_nombre = true && that.isSetNombre();
    if (this_present_nombre || that_present_nombre) {
      if (!(this_present_nombre && that_present_nombre))
        return false;
      if (!this.nombre.equals(that.nombre))
        return false;
    }

    boolean this_present_tipo = true && this.isSetTipo();
    boolean that_present_tipo = true && that.isSetTipo();
    if (this_present_tipo || that_present_tipo) {
      if (!(this_present_tipo && that_present_tipo))
        return false;
      if (!this.tipo.equals(that.tipo))
        return false;
    }

    boolean this_present_talla = true && this.isSetTalla();
    boolean that_present_talla = true && that.isSetTalla();
    if (this_present_talla || that_present_talla) {
      if (!(this_present_talla && that_present_talla))
        return false;
      if (!this.talla.equals(that.talla))
        return false;
    }

    boolean this_present_color = true && this.isSetColor();
    boolean that_present_color = true && that.isSetColor();
    if (this_present_color || that_present_color) {
      if (!(this_present_color && that_present_color))
        return false;
      if (!this.color.equals(that.color))
        return false;
    }

    boolean this_present_descripcion = true && this.isSetDescripcion();
    boolean that_present_descripcion = true && that.isSetDescripcion();
    if (this_present_descripcion || that_present_descripcion) {
      if (!(this_present_descripcion && that_present_descripcion))
        return false;
      if (!this.descripcion.equals(that.descripcion))
        return false;
    }

    boolean this_present_stock = true && this.isSetStock();
    boolean that_present_stock = true && that.isSetStock();
    if (this_present_stock || that_present_stock) {
      if (!(this_present_stock && that_present_stock))
        return false;
      if (!this.stock.equals(that.stock))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_nombre = true && (isSetNombre());
    list.add(present_nombre);
    if (present_nombre)
      list.add(nombre);

    boolean present_tipo = true && (isSetTipo());
    list.add(present_tipo);
    if (present_tipo)
      list.add(tipo.getValue());

    boolean present_talla = true && (isSetTalla());
    list.add(present_talla);
    if (present_talla)
      list.add(talla);

    boolean present_color = true && (isSetColor());
    list.add(present_color);
    if (present_color)
      list.add(color);

    boolean present_descripcion = true && (isSetDescripcion());
    list.add(present_descripcion);
    if (present_descripcion)
      list.add(descripcion);

    boolean present_stock = true && (isSetStock());
    list.add(present_stock);
    if (present_stock)
      list.add(stock);

    return list.hashCode();
  }

  @Override
  public int compareTo(PrendaThrift other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetNombre()).compareTo(other.isSetNombre());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNombre()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nombre, other.nombre);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTipo()).compareTo(other.isSetTipo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTipo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.tipo, other.tipo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTalla()).compareTo(other.isSetTalla());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTalla()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.talla, other.talla);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColor()).compareTo(other.isSetColor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.color, other.color);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDescripcion()).compareTo(other.isSetDescripcion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescripcion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.descripcion, other.descripcion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStock()).compareTo(other.isSetStock());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStock()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stock, other.stock);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("PrendaThrift(");
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
    if (this.stock == null) {
      sb.append("null");
    } else {
      sb.append(this.stock);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PrendaThriftStandardSchemeFactory implements SchemeFactory {
    public PrendaThriftStandardScheme getScheme() {
      return new PrendaThriftStandardScheme();
    }
  }

  private static class PrendaThriftStandardScheme extends StandardScheme<PrendaThrift> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PrendaThrift struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NOMBRE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.nombre = iprot.readString();
              struct.setNombreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TIPO
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.tipo = apacheThriftSrvA.TipoThrift.findByValue(iprot.readI32());
              struct.setTipoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TALLA
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.talla = iprot.readString();
              struct.setTallaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLOR
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.color = iprot.readString();
              struct.setColorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DESCRIPCION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.descripcion = iprot.readString();
              struct.setDescripcionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // STOCK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.stock = iprot.readString();
              struct.setStockIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, PrendaThrift struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.nombre != null) {
        oprot.writeFieldBegin(NOMBRE_FIELD_DESC);
        oprot.writeString(struct.nombre);
        oprot.writeFieldEnd();
      }
      if (struct.tipo != null) {
        oprot.writeFieldBegin(TIPO_FIELD_DESC);
        oprot.writeI32(struct.tipo.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.talla != null) {
        oprot.writeFieldBegin(TALLA_FIELD_DESC);
        oprot.writeString(struct.talla);
        oprot.writeFieldEnd();
      }
      if (struct.color != null) {
        oprot.writeFieldBegin(COLOR_FIELD_DESC);
        oprot.writeString(struct.color);
        oprot.writeFieldEnd();
      }
      if (struct.descripcion != null) {
        oprot.writeFieldBegin(DESCRIPCION_FIELD_DESC);
        oprot.writeString(struct.descripcion);
        oprot.writeFieldEnd();
      }
      if (struct.stock != null) {
        oprot.writeFieldBegin(STOCK_FIELD_DESC);
        oprot.writeString(struct.stock);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PrendaThriftTupleSchemeFactory implements SchemeFactory {
    public PrendaThriftTupleScheme getScheme() {
      return new PrendaThriftTupleScheme();
    }
  }

  private static class PrendaThriftTupleScheme extends TupleScheme<PrendaThrift> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PrendaThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetNombre()) {
        optionals.set(0);
      }
      if (struct.isSetTipo()) {
        optionals.set(1);
      }
      if (struct.isSetTalla()) {
        optionals.set(2);
      }
      if (struct.isSetColor()) {
        optionals.set(3);
      }
      if (struct.isSetDescripcion()) {
        optionals.set(4);
      }
      if (struct.isSetStock()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetNombre()) {
        oprot.writeString(struct.nombre);
      }
      if (struct.isSetTipo()) {
        oprot.writeI32(struct.tipo.getValue());
      }
      if (struct.isSetTalla()) {
        oprot.writeString(struct.talla);
      }
      if (struct.isSetColor()) {
        oprot.writeString(struct.color);
      }
      if (struct.isSetDescripcion()) {
        oprot.writeString(struct.descripcion);
      }
      if (struct.isSetStock()) {
        oprot.writeString(struct.stock);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PrendaThrift struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.nombre = iprot.readString();
        struct.setNombreIsSet(true);
      }
      if (incoming.get(1)) {
        struct.tipo = apacheThriftSrvA.TipoThrift.findByValue(iprot.readI32());
        struct.setTipoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.talla = iprot.readString();
        struct.setTallaIsSet(true);
      }
      if (incoming.get(3)) {
        struct.color = iprot.readString();
        struct.setColorIsSet(true);
      }
      if (incoming.get(4)) {
        struct.descripcion = iprot.readString();
        struct.setDescripcionIsSet(true);
      }
      if (incoming.get(5)) {
        struct.stock = iprot.readString();
        struct.setStockIsSet(true);
      }
    }
  }

}

