package com.metacube.webservice.assignment;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Temperature {

	@WebMethod
	public double convertFahrenheitToCelsius(double fahrenheit){
		double celsius=0;
		try {
			celsius = (fahrenheit-32)*5/9;
			
		} catch (Exception e) {
			System.out.println("Wrong Input");
		}
		return celsius;	
	}

}
