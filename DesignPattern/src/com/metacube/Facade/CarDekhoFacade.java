package com.metacube.Facade;

import com.metacube.DAO.CarDAOConcrete;
import com.metacube.VO.CarVO;

public class CarDekhoFacade {
	
	public void addCar(CarVO carVOObject) {
  
		CarDAOConcrete carDAOConcrete=new CarDAOConcrete();
		carDAOConcrete.addCar(carVOObject);
	}
	
	public void updateCar(CarVO carVOObject) {
		CarDAOConcrete carDAOConcrete=new CarDAOConcrete();
		carDAOConcrete.updateCar(carVOObject);
	}

}
