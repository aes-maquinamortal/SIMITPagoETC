package com.pagoetc.pagoetc.wsdl;

public class EnvioNotificacionProxy implements com.pagoetc.pagoetc.wsdl.EnvioNotificacion {
  private String _endpoint = null;
  private com.pagoetc.pagoetc.wsdl.EnvioNotificacion envioNotificacion = null;
  
  public EnvioNotificacionProxy() {
    _initEnvioNotificacionProxy();
  }
  
  public EnvioNotificacionProxy(String endpoint) {
    _endpoint = endpoint;
    _initEnvioNotificacionProxy();
  }
  
  private void _initEnvioNotificacionProxy() {
    try {
      envioNotificacion = (new com.pagoetc.pagoetc.wsdl.EnvioNotificacionServiceLocator()).getEnvioNotificacionPort();
      if (envioNotificacion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)envioNotificacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)envioNotificacion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (envioNotificacion != null)
      ((javax.xml.rpc.Stub)envioNotificacion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pagoetc.pagoetc.wsdl.EnvioNotificacion getEnvioNotificacion() {
    if (envioNotificacion == null)
      _initEnvioNotificacionProxy();
    return envioNotificacion;
  }
  
  public void envioNotificacionUtilidad(com.pagoetc.pagoetc.wsdl.Etc arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (envioNotificacion == null)
      _initEnvioNotificacionProxy();
    envioNotificacion.envioNotificacionUtilidad(arg0, arg1, arg2);
  }
  
  
}