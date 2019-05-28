/**
 * EnvioNotificacionServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pagoetc.pagoetc.wsdl;

public class EnvioNotificacionServiceLocator extends org.apache.axis.client.Service implements com.pagoetc.pagoetc.wsdl.EnvioNotificacionService {

    public EnvioNotificacionServiceLocator() {
    }


    public EnvioNotificacionServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public EnvioNotificacionServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for EnvioNotificacionPort
    private java.lang.String EnvioNotificacionPort_address = "http://lb-notifications:8081/services/simit";

    public java.lang.String getEnvioNotificacionPortAddress() {
        return EnvioNotificacionPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String EnvioNotificacionPortWSDDServiceName = "EnvioNotificacionPort";

    public java.lang.String getEnvioNotificacionPortWSDDServiceName() {
        return EnvioNotificacionPortWSDDServiceName;
    }

    public void setEnvioNotificacionPortWSDDServiceName(java.lang.String name) {
        EnvioNotificacionPortWSDDServiceName = name;
    }

    public com.pagoetc.pagoetc.wsdl.EnvioNotificacion getEnvioNotificacionPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(EnvioNotificacionPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getEnvioNotificacionPort(endpoint);
    }

    public com.pagoetc.pagoetc.wsdl.EnvioNotificacion getEnvioNotificacionPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
        	com.pagoetc.pagoetc.wsdl.EnvioNotificacionServiceSoapBindingStub _stub = new com.pagoetc.pagoetc.wsdl.EnvioNotificacionServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getEnvioNotificacionPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setEnvioNotificacionPortEndpointAddress(java.lang.String address) {
        EnvioNotificacionPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pagoetc.pagoetc.wsdl.EnvioNotificacion.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pagoetc.pagoetc.wsdl.EnvioNotificacionServiceSoapBindingStub _stub = new com.pagoetc.pagoetc.wsdl.EnvioNotificacionServiceSoapBindingStub(new java.net.URL(EnvioNotificacionPort_address), this);
                _stub.setPortName(getEnvioNotificacionPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("EnvioNotificacionPort".equals(inputPortName)) {
            return getEnvioNotificacionPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://notificacion.notificacion.simit.com/", "EnvioNotificacionService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://notificacion.notificacion.simit.com/", "EnvioNotificacionPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("EnvioNotificacionPort".equals(portName)) {
            setEnvioNotificacionPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
