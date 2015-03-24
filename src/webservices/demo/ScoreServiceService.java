/**
 * ScoreServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webservices.demo;

public interface ScoreServiceService extends javax.xml.rpc.Service {
    public java.lang.String getScoreServiceAddress();

    public webservices.demo.ScoreService getScoreService() throws javax.xml.rpc.ServiceException;

    public webservices.demo.ScoreService getScoreService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
