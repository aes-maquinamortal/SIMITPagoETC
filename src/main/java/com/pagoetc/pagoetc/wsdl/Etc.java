/**
 * Etc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pagoetc.pagoetc.wsdl;

public class Etc  implements java.io.Serializable {
    private com.pagoetc.pagoetc.wsdl.Ciudad ciudad;

    private java.lang.String correo;

    private java.lang.String cuentaBancaria;

    private java.lang.String nombre;

    private java.lang.String numeroDocumento;

    private java.lang.String tipoDocumento;

    public Etc() {
    }

    public Etc(
           com.pagoetc.pagoetc.wsdl.Ciudad ciudad,
           java.lang.String correo,
           java.lang.String cuentaBancaria,
           java.lang.String nombre,
           java.lang.String numeroDocumento,
           java.lang.String tipoDocumento) {
           this.ciudad = ciudad;
           this.correo = correo;
           this.cuentaBancaria = cuentaBancaria;
           this.nombre = nombre;
           this.numeroDocumento = numeroDocumento;
           this.tipoDocumento = tipoDocumento;
    }


    /**
     * Gets the ciudad value for this Etc.
     * 
     * @return ciudad
     */
    public com.pagoetc.pagoetc.wsdl.Ciudad getCiudad() {
        return ciudad;
    }


    /**
     * Sets the ciudad value for this Etc.
     * 
     * @param ciudad
     */
    public void setCiudad(com.pagoetc.pagoetc.wsdl.Ciudad ciudad) {
        this.ciudad = ciudad;
    }


    /**
     * Gets the correo value for this Etc.
     * 
     * @return correo
     */
    public java.lang.String getCorreo() {
        return correo;
    }


    /**
     * Sets the correo value for this Etc.
     * 
     * @param correo
     */
    public void setCorreo(java.lang.String correo) {
        this.correo = correo;
    }


    /**
     * Gets the cuentaBancaria value for this Etc.
     * 
     * @return cuentaBancaria
     */
    public java.lang.String getCuentaBancaria() {
        return cuentaBancaria;
    }


    /**
     * Sets the cuentaBancaria value for this Etc.
     * 
     * @param cuentaBancaria
     */
    public void setCuentaBancaria(java.lang.String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }


    /**
     * Gets the nombre value for this Etc.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Etc.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the numeroDocumento value for this Etc.
     * 
     * @return numeroDocumento
     */
    public java.lang.String getNumeroDocumento() {
        return numeroDocumento;
    }


    /**
     * Sets the numeroDocumento value for this Etc.
     * 
     * @param numeroDocumento
     */
    public void setNumeroDocumento(java.lang.String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }


    /**
     * Gets the tipoDocumento value for this Etc.
     * 
     * @return tipoDocumento
     */
    public java.lang.String getTipoDocumento() {
        return tipoDocumento;
    }


    /**
     * Sets the tipoDocumento value for this Etc.
     * 
     * @param tipoDocumento
     */
    public void setTipoDocumento(java.lang.String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Etc)) return false;
        Etc other = (Etc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ciudad==null && other.getCiudad()==null) || 
             (this.ciudad!=null &&
              this.ciudad.equals(other.getCiudad()))) &&
            ((this.correo==null && other.getCorreo()==null) || 
             (this.correo!=null &&
              this.correo.equals(other.getCorreo()))) &&
            ((this.cuentaBancaria==null && other.getCuentaBancaria()==null) || 
             (this.cuentaBancaria!=null &&
              this.cuentaBancaria.equals(other.getCuentaBancaria()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.numeroDocumento==null && other.getNumeroDocumento()==null) || 
             (this.numeroDocumento!=null &&
              this.numeroDocumento.equals(other.getNumeroDocumento()))) &&
            ((this.tipoDocumento==null && other.getTipoDocumento()==null) || 
             (this.tipoDocumento!=null &&
              this.tipoDocumento.equals(other.getTipoDocumento())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCiudad() != null) {
            _hashCode += getCiudad().hashCode();
        }
        if (getCorreo() != null) {
            _hashCode += getCorreo().hashCode();
        }
        if (getCuentaBancaria() != null) {
            _hashCode += getCuentaBancaria().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getNumeroDocumento() != null) {
            _hashCode += getNumeroDocumento().hashCode();
        }
        if (getTipoDocumento() != null) {
            _hashCode += getTipoDocumento().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Etc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://notificacion.notificacion.simit.com/", "etc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciudad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciudad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://notificacion.notificacion.simit.com/", "ciudad"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cuentaBancaria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cuentaBancaria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDocumento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoDocumento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
