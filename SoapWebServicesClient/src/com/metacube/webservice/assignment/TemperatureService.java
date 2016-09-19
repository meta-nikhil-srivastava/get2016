/**
 * TemperatureService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.metacube.webservice.assignment;

public interface TemperatureService extends javax.xml.rpc.Service {
    public java.lang.String getTemperatureAddress();

    public com.metacube.webservice.assignment.Temperature getTemperature() throws javax.xml.rpc.ServiceException;

    public com.metacube.webservice.assignment.Temperature getTemperature(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
