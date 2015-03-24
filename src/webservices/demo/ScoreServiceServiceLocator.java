/**
 * ScoreServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices.demo;

public class ScoreServiceServiceLocator extends org.apache.axis.client.Service implements webservices.demo.ScoreServiceService {

    public ScoreServiceServiceLocator() {
    }


    public ScoreServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ScoreServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ScoreService
    private java.lang.String ScoreService_address = "http://localhost:8080/WebServiceProject/services/ScoreService";

    public java.lang.String getScoreServiceAddress() {
        return ScoreService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ScoreServiceWSDDServiceName = "ScoreService";

    public java.lang.String getScoreServiceWSDDServiceName() {
        return ScoreServiceWSDDServiceName;
    }

    public void setScoreServiceWSDDServiceName(java.lang.String name) {
        ScoreServiceWSDDServiceName = name;
    }

    public webservices.demo.ScoreService getScoreService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ScoreService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getScoreService(endpoint);
    }

    public webservices.demo.ScoreService getScoreService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webservices.demo.ScoreServiceSoapBindingStub _stub = new webservices.demo.ScoreServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getScoreServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setScoreServiceEndpointAddress(java.lang.String address) {
        ScoreService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webservices.demo.ScoreService.class.isAssignableFrom(serviceEndpointInterface)) {
                webservices.demo.ScoreServiceSoapBindingStub _stub = new webservices.demo.ScoreServiceSoapBindingStub(new java.net.URL(ScoreService_address), this);
                _stub.setPortName(getScoreServiceWSDDServiceName());
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
        if ("ScoreService".equals(inputPortName)) {
            return getScoreService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://demo.webservices", "ScoreServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://demo.webservices", "ScoreService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ScoreService".equals(portName)) {
            setScoreServiceEndpointAddress(address);
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
