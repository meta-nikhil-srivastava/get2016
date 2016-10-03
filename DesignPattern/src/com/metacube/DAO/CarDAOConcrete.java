package com.metacube.DAO;

import java.util.List;

import com.metacube.VO.CarVO;
import com.metacube.utility.DBHelper;
/**
 * 
 * @author Nikhil
 * implements the functioning of the CarDAO
 *
 */
public class CarDAOConcrete implements CarDAO {

	@Override
	/**
	 * creates a new car
	 */
	public void addCar(CarVO carVOObject) {
		new DBHelper().addCar(carVOObject);

	}

	@Override
	/**
	 * updates an existing car
	 */
	public void updateCar(CarVO carVOObject) {
	new DBHelper().updateCar(carVOObject);
	}
	
	@Override
	/**
	 * calculates the on road price of the car based on the price of the car
	 */
	public int calculateOnRoadPrice(CarVO carVO) {
		return carVO.getRoadTax()+carVO.getPrice();
	
	}

	@Override
	/**
	 * returns list of car based on various parameters
	 */
	public List<CarVO> searchCar(String filter, String parameter) {
		
		return new DBHelper().searchCar(filter, parameter);
	}

	@Override
	/**
	 * returns list of car based on various parameters
	 */
	public List<CarVO> searchCar(String filter, float minValue, float maxValue) {
		return new DBHelper().searchCar(filter, minValue, maxValue);
	}

	@Override
	/**
	 * returns list of all cars 
	 */
	public List<CarVO> getAllCars() {
		return new DBHelper().getAllCars();
	}	
}
