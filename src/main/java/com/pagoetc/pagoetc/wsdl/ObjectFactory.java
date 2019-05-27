//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2019.05.26 a las 09:40:43 PM COT 
//


package com.pagoetc.pagoetc.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pagoetc.pagoetc.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EnvioNotificacionUtilidad_QNAME = new QName("http://notificacion.notificacion.simit.com/", "envioNotificacionUtilidad");
    private final static QName _EnvioNotificacionUtilidadResponse_QNAME = new QName("http://notificacion.notificacion.simit.com/", "envioNotificacionUtilidadResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pagoetc.pagoetc.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EnvioNotificacionUtilidad }
     * 
     */
    public EnvioNotificacionUtilidad createEnvioNotificacionUtilidad() {
        return new EnvioNotificacionUtilidad();
    }

    /**
     * Create an instance of {@link EnvioNotificacionUtilidadResponse }
     * 
     */
    public EnvioNotificacionUtilidadResponse createEnvioNotificacionUtilidadResponse() {
        return new EnvioNotificacionUtilidadResponse();
    }

    /**
     * Create an instance of {@link Etc }
     * 
     */
    public Etc createEtc() {
        return new Etc();
    }

    /**
     * Create an instance of {@link Ciudad }
     * 
     */
    public Ciudad createCiudad() {
        return new Ciudad();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvioNotificacionUtilidad }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notificacion.notificacion.simit.com/", name = "envioNotificacionUtilidad")
    public JAXBElement<EnvioNotificacionUtilidad> createEnvioNotificacionUtilidad(EnvioNotificacionUtilidad value) {
        return new JAXBElement<EnvioNotificacionUtilidad>(_EnvioNotificacionUtilidad_QNAME, EnvioNotificacionUtilidad.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnvioNotificacionUtilidadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://notificacion.notificacion.simit.com/", name = "envioNotificacionUtilidadResponse")
    public JAXBElement<EnvioNotificacionUtilidadResponse> createEnvioNotificacionUtilidadResponse(EnvioNotificacionUtilidadResponse value) {
        return new JAXBElement<EnvioNotificacionUtilidadResponse>(_EnvioNotificacionUtilidadResponse_QNAME, EnvioNotificacionUtilidadResponse.class, null, value);
    }

}
