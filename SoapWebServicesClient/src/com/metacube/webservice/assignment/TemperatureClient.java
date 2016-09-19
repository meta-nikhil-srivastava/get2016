package com.metacube.webservice.assignment;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class TemperatureClient {

	public static void main(String[] args) {
		TemperatureServiceLocator temperatureServiceLocator =new TemperatureServiceLocator();
		temperatureServiceLocator.setTemperatureEndpointAddress("http://localhost:8080/SoapWebServices/services/Temperature");
		try {
			Temperature temperature = temperatureServiceLocator.getTemperature();
			System.out.println(temperature.convertFahrenheitToCelsius(1000));
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
