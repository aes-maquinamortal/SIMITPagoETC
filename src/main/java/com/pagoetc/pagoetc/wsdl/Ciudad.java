/**
 * Ciudad.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pagoetc.pagoetc.wsdl;

public class Ciudad  implements java.io.Serializable {
    private java.lang.String departamento;

    private java.lang.String indicativo;

    private java.lang.String nombre;

    private boolean rural;

    public Ciudad() {
    }

    public Ciudad(
           java.lang.String departamento,
           java.lang.String indicativo,
           java.lang.String nombre,
           boolean rural) {
           this.departamento = departamento;
           this.indicativo = indicativo;
           this.nombre = nombre;
           this.rural = rural;
    }


    /**
     * Gets the departamento value for this Ciudad.
     * 
     * @return departamento
     */
    public java.lang.String getDepartamento() {
        return departamento;
    }


    /**
     * Sets the departamento value for this Ciudad.
     * 
     * @param departamento
     */
    public void setDepartamento(java.lang.String departamento) {
        this.departamento = departamento;
    }


    /**
     * Gets the indicativo value for this Ciudad.
     * 
     * @return indicativo
     */
    public java.lang.String getIndicativo() {
        return indicativo;
    }


    /**
     * Sets the indicativo value for this Ciudad.
     * 
     * @param indicativo
     */
    public void setIndicativo(java.lang.String indicativo) {
        this.indicativo = indicativo;
    }


    /**
     * Gets the nombre value for this Ciudad.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this Ciudad.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the rural value for this Ciudad.
     * 
     * @return rural
     */
    public boolean isRural() {
        return rural;
    }


    /**
     * Sets the rural value for this Ciudad.
     * 
     * @param rural
     */
    public void setRural(boolean rural) {
        this.rural = rural;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ciudad)) return false;
        Ciudad other = (Ciudad) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departamento==null && other.getDepartamento()==null) || 
             (this.departamento!=null &&
              this.departamento.equals(other.getDepartamento()))) &&
            ((this.indicativo==null && other.getIndicativo()==null) || 
             (this.indicativo!=null &&
              this.indicativo.equals(other.getIndicativo()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            this.rural == other.isRural();
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
        if (getDepartamento() != null) {
            _hashCode += getDepartamento().hashCode();
        }
        if (getIndicativo() != null) {
            _hashCode += getIndicativo().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        _hashCode += (isRural() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ciudad.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://notificacion.notificacion.simit.com/", "ciudad"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departamento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departamento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicativo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indicativo"));
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
        elemField.setFieldName("rural");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rural"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
