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
public class MensajeOutServicio implements org.apache.thrift.TBase<MensajeOutServicio, MensajeOutServicio._Fields>, java.io.Serializable, Cloneable, Comparable<MensajeOutServicio> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("MensajeOutServicio");

  private static final org.apache.thrift.protocol.TField CABECERA_FIELD_DESC = new org.apache.thrift.protocol.TField("cabecera", org.apache.thrift.protocol.TType.MAP, (short)1);
  private static final org.apache.thrift.protocol.TField CUERPO_FIELD_DESC = new org.apache.thrift.protocol.TField("cuerpo", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField AVISO_FIELD_DESC = new org.apache.thrift.protocol.TField("aviso", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new MensajeOutServicioStandardSchemeFactory());
    schemes.put(TupleScheme.class, new MensajeOutServicioTupleSchemeFactory());
  }

  public Map<String,String> cabecera; // required
  public Map<String,List<PrendaThrift>> cuerpo; // required
  public String aviso; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CABECERA((short)1, "cabecera"),
    CUERPO((short)2, "cuerpo"),
    AVISO((short)3, "aviso");

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
        case 1: // CABECERA
          return CABECERA;
        case 2: // CUERPO
          return CUERPO;
        case 3: // AVISO
          return AVISO;
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
    tmpMap.put(_Fields.CABECERA, new org.apache.thrift.meta_data.FieldMetaData("cabecera", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.MAP        , "TipoCabeceraOut")));
    tmpMap.put(_Fields.CUERPO, new org.apache.thrift.meta_data.FieldMetaData("cuerpo", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.MAP        , "TipoCuerpoOut")));
    tmpMap.put(_Fields.AVISO, new org.apache.thrift.meta_data.FieldMetaData("aviso", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(MensajeOutServicio.class, metaDataMap);
  }

  public MensajeOutServicio() {
  }

  public MensajeOutServicio(
    Map<String,String> cabecera,
    Map<String,List<PrendaThrift>> cuerpo,
    String aviso)
  {
    this();
    this.cabecera = cabecera;
    this.cuerpo = cuerpo;
    this.aviso = aviso;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MensajeOutServicio(MensajeOutServicio other) {
    if (other.isSetCabecera()) {
      this.cabecera = other.cabecera;
    }
    if (other.isSetCuerpo()) {
      this.cuerpo = other.cuerpo;
    }
    if (other.isSetAviso()) {
      this.aviso = other.aviso;
    }
  }

  public MensajeOutServicio deepCopy() {
    return new MensajeOutServicio(this);
  }

  @Override
  public void clear() {
    this.cabecera = null;
    this.cuerpo = null;
    this.aviso = null;
  }

  public int getCabeceraSize() {
    return (this.cabecera == null) ? 0 : this.cabecera.size();
  }

  public void putToCabecera(String key, String val) {
    if (this.cabecera == null) {
      this.cabecera = new HashMap<String,String>();
    }
    this.cabecera.put(key, val);
  }

  public Map<String,String> getCabecera() {
    return this.cabecera;
  }

  public MensajeOutServicio setCabecera(Map<String,String> cabecera) {
    this.cabecera = cabecera;
    return this;
  }

  public void unsetCabecera() {
    this.cabecera = null;
  }

  /** Returns true if field cabecera is set (has been assigned a value) and false otherwise */
  public boolean isSetCabecera() {
    return this.cabecera != null;
  }

  public void setCabeceraIsSet(boolean value) {
    if (!value) {
      this.cabecera = null;
    }
  }

  public int getCuerpoSize() {
    return (this.cuerpo == null) ? 0 : this.cuerpo.size();
  }

  public void putToCuerpo(String key, List<PrendaThrift> val) {
    if (this.cuerpo == null) {
      this.cuerpo = new HashMap<String,List<PrendaThrift>>();
    }
    this.cuerpo.put(key, val);
  }

  public Map<String,List<PrendaThrift>> getCuerpo() {
    return this.cuerpo;
  }

  public MensajeOutServicio setCuerpo(Map<String,List<PrendaThrift>> cuerpo) {
    this.cuerpo = cuerpo;
    return this;
  }

  public void unsetCuerpo() {
    this.cuerpo = null;
  }

  /** Returns true if field cuerpo is set (has been assigned a value) and false otherwise */
  public boolean isSetCuerpo() {
    return this.cuerpo != null;
  }

  public void setCuerpoIsSet(boolean value) {
    if (!value) {
      this.cuerpo = null;
    }
  }

  public String getAviso() {
    return this.aviso;
  }

  public MensajeOutServicio setAviso(String aviso) {
    this.aviso = aviso;
    return this;
  }

  public void unsetAviso() {
    this.aviso = null;
  }

  /** Returns true if field aviso is set (has been assigned a value) and false otherwise */
  public boolean isSetAviso() {
    return this.aviso != null;
  }

  public void setAvisoIsSet(boolean value) {
    if (!value) {
      this.aviso = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CABECERA:
      if (value == null) {
        unsetCabecera();
      } else {
        setCabecera((Map<String,String>)value);
      }
      break;

    case CUERPO:
      if (value == null) {
        unsetCuerpo();
      } else {
        setCuerpo((Map<String,List<PrendaThrift>>)value);
      }
      break;

    case AVISO:
      if (value == null) {
        unsetAviso();
      } else {
        setAviso((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CABECERA:
      return getCabecera();

    case CUERPO:
      return getCuerpo();

    case AVISO:
      return getAviso();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CABECERA:
      return isSetCabecera();
    case CUERPO:
      return isSetCuerpo();
    case AVISO:
      return isSetAviso();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof MensajeOutServicio)
      return this.equals((MensajeOutServicio)that);
    return false;
  }

  public boolean equals(MensajeOutServicio that) {
    if (that == null)
      return false;

    boolean this_present_cabecera = true && this.isSetCabecera();
    boolean that_present_cabecera = true && that.isSetCabecera();
    if (this_present_cabecera || that_present_cabecera) {
      if (!(this_present_cabecera && that_present_cabecera))
        return false;
      if (!this.cabecera.equals(that.cabecera))
        return false;
    }

    boolean this_present_cuerpo = true && this.isSetCuerpo();
    boolean that_present_cuerpo = true && that.isSetCuerpo();
    if (this_present_cuerpo || that_present_cuerpo) {
      if (!(this_present_cuerpo && that_present_cuerpo))
        return false;
      if (!this.cuerpo.equals(that.cuerpo))
        return false;
    }

    boolean this_present_aviso = true && this.isSetAviso();
    boolean that_present_aviso = true && that.isSetAviso();
    if (this_present_aviso || that_present_aviso) {
      if (!(this_present_aviso && that_present_aviso))
        return false;
      if (!this.aviso.equals(that.aviso))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cabecera = true && (isSetCabecera());
    list.add(present_cabecera);
    if (present_cabecera)
      list.add(cabecera);

    boolean present_cuerpo = true && (isSetCuerpo());
    list.add(present_cuerpo);
    if (present_cuerpo)
      list.add(cuerpo);

    boolean present_aviso = true && (isSetAviso());
    list.add(present_aviso);
    if (present_aviso)
      list.add(aviso);

    return list.hashCode();
  }

  @Override
  public int compareTo(MensajeOutServicio other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCabecera()).compareTo(other.isSetCabecera());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCabecera()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cabecera, other.cabecera);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCuerpo()).compareTo(other.isSetCuerpo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCuerpo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cuerpo, other.cuerpo);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAviso()).compareTo(other.isSetAviso());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAviso()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.aviso, other.aviso);
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
    StringBuilder sb = new StringBuilder("MensajeOutServicio(");
    boolean first = true;

    sb.append("cabecera:");
    if (this.cabecera == null) {
      sb.append("null");
    } else {
      sb.append(this.cabecera);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cuerpo:");
    if (this.cuerpo == null) {
      sb.append("null");
    } else {
      sb.append(this.cuerpo);
    }
    first = false;
    if (!first) sb.append(", ");
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

  private static class MensajeOutServicioStandardSchemeFactory implements SchemeFactory {
    public MensajeOutServicioStandardScheme getScheme() {
      return new MensajeOutServicioStandardScheme();
    }
  }

  private static class MensajeOutServicioStandardScheme extends StandardScheme<MensajeOutServicio> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, MensajeOutServicio struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CABECERA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map20 = iprot.readMapBegin();
                struct.cabecera = new HashMap<String,String>(2*_map20.size);
                String _key21;
                String _val22;
                for (int _i23 = 0; _i23 < _map20.size; ++_i23)
                {
                  _key21 = iprot.readString();
                  _val22 = iprot.readString();
                  struct.cabecera.put(_key21, _val22);
                }
                iprot.readMapEnd();
              }
              struct.setCabeceraIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CUERPO
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map24 = iprot.readMapBegin();
                struct.cuerpo = new HashMap<String,List<PrendaThrift>>(2*_map24.size);
                String _key25;
                List<PrendaThrift> _val26;
                for (int _i27 = 0; _i27 < _map24.size; ++_i27)
                {
                  _key25 = iprot.readString();
                  {
                    org.apache.thrift.protocol.TList _list28 = iprot.readListBegin();
                    _val26 = new ArrayList<PrendaThrift>(_list28.size);
                    PrendaThrift _elem29;
                    for (int _i30 = 0; _i30 < _list28.size; ++_i30)
                    {
                      _elem29 = new PrendaThrift();
                      _elem29.read(iprot);
                      _val26.add(_elem29);
                    }
                    iprot.readListEnd();
                  }
                  struct.cuerpo.put(_key25, _val26);
                }
                iprot.readMapEnd();
              }
              struct.setCuerpoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // AVISO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.aviso = iprot.readString();
              struct.setAvisoIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, MensajeOutServicio struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cabecera != null) {
        oprot.writeFieldBegin(CABECERA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.cabecera.size()));
          for (Map.Entry<String, String> _iter31 : struct.cabecera.entrySet())
          {
            oprot.writeString(_iter31.getKey());
            oprot.writeString(_iter31.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.cuerpo != null) {
        oprot.writeFieldBegin(CUERPO_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, struct.cuerpo.size()));
          for (Map.Entry<String, List<PrendaThrift>> _iter32 : struct.cuerpo.entrySet())
          {
            oprot.writeString(_iter32.getKey());
            {
              oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, _iter32.getValue().size()));
              for (PrendaThrift _iter33 : _iter32.getValue())
              {
                _iter33.write(oprot);
              }
              oprot.writeListEnd();
            }
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.aviso != null) {
        oprot.writeFieldBegin(AVISO_FIELD_DESC);
        oprot.writeString(struct.aviso);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class MensajeOutServicioTupleSchemeFactory implements SchemeFactory {
    public MensajeOutServicioTupleScheme getScheme() {
      return new MensajeOutServicioTupleScheme();
    }
  }

  private static class MensajeOutServicioTupleScheme extends TupleScheme<MensajeOutServicio> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, MensajeOutServicio struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCabecera()) {
        optionals.set(0);
      }
      if (struct.isSetCuerpo()) {
        optionals.set(1);
      }
      if (struct.isSetAviso()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetCabecera()) {
        {
          oprot.writeI32(struct.cabecera.size());
          for (Map.Entry<String, String> _iter34 : struct.cabecera.entrySet())
          {
            oprot.writeString(_iter34.getKey());
            oprot.writeString(_iter34.getValue());
          }
        }
      }
      if (struct.isSetCuerpo()) {
        {
          oprot.writeI32(struct.cuerpo.size());
          for (Map.Entry<String, List<PrendaThrift>> _iter35 : struct.cuerpo.entrySet())
          {
            oprot.writeString(_iter35.getKey());
            {
              oprot.writeI32(_iter35.getValue().size());
              for (PrendaThrift _iter36 : _iter35.getValue())
              {
                _iter36.write(oprot);
              }
            }
          }
        }
      }
      if (struct.isSetAviso()) {
        oprot.writeString(struct.aviso);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, MensajeOutServicio struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map37 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.cabecera = new HashMap<String,String>(2*_map37.size);
          String _key38;
          String _val39;
          for (int _i40 = 0; _i40 < _map37.size; ++_i40)
          {
            _key38 = iprot.readString();
            _val39 = iprot.readString();
            struct.cabecera.put(_key38, _val39);
          }
        }
        struct.setCabeceraIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TMap _map41 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.LIST, iprot.readI32());
          struct.cuerpo = new HashMap<String,List<PrendaThrift>>(2*_map41.size);
          String _key42;
          List<PrendaThrift> _val43;
          for (int _i44 = 0; _i44 < _map41.size; ++_i44)
          {
            _key42 = iprot.readString();
            {
              org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
              _val43 = new ArrayList<PrendaThrift>(_list45.size);
              PrendaThrift _elem46;
              for (int _i47 = 0; _i47 < _list45.size; ++_i47)
              {
                _elem46 = new PrendaThrift();
                _elem46.read(iprot);
                _val43.add(_elem46);
              }
            }
            struct.cuerpo.put(_key42, _val43);
          }
        }
        struct.setCuerpoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.aviso = iprot.readString();
        struct.setAvisoIsSet(true);
      }
    }
  }

}

