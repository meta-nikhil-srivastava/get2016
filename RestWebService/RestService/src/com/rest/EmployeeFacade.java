package com.rest;

import java.util.List;

/**
 * Bussines Logic Layer for employeeDAO
 * @author admin
 *
 */
public class EmployeeFacade {

	EmployeeDAO employeeDAO = new EmployeeDAO();

	/**
	 * method to create a new employee entry
	 * @param employeeVO : employee data
	 * @return boolean : true if created successfully else false
	 */
	Boolean insertEmployee(EmployeeVO employeeVO) {

		return employeeDAO.insertEmployee(employeeVO);
	}

	/**
	 * method to return a list of all the employees
	 * @return List<EmployeeVO> : list of all the employees
	 */
	List<EmployeeVO> selectEmployee() {

		return employeeDAO.selectEmployee();
	}

	/**
	 *  method to return a employee detail based on id
	 * @param id : employee id
	 * @return EmployeeVO : employee detail
	 */
	EmployeeVO getEmployeeById(String id) {
		return employeeDAO.getEmployeeById(id);
	}

	/**
	 *  method to return a employee detail based on name
	 * @param name : employee name
	 * @return List<EmployeeVO> : list of all the employees found based on name search
	 */
	List<EmployeeVO> getEmployeeByName(String name) {
		return employeeDAO.getEmployeeByName(name);
	}
	
	/**
	 *  method to delete a employee detail based on id
	 * @param id : employee id
	 * @return boolean : true if created successfully else false
	 */
	boolean deleteEmployeeById(String id) {
		return employeeDAO.deleteEmployeeById(id);
	}
}
