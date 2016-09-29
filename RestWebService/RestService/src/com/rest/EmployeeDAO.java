package com.rest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.jdbc.connection.ConnectionFactory;

/**
 * DAO for employee table
 * 
 * @author admin
 *
 */
public class EmployeeDAO {

	ConnectionFactory connectionFactory;
	Connection connection = ConnectionFactory.getConnectionObject();

	/**
	 * method to create a new employee entry
	 * 
	 * @param employeeVO
	 *            : employee data
	 * @return boolean : true if created successfully else false
	 */
	boolean insertEmployee(EmployeeVO employeeVO) {
		int rowsAffected = 0;
		String id = employeeVO.getId();
		String name = employeeVO.getName();
		int age = employeeVO.getAge();
		int salary = employeeVO.getSalary();
		try {
			String query = "insert into employee values(?,?,?,?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, name);
			preparedStatement.setInt(3, age);
			preparedStatement.setInt(4, salary);
			rowsAffected = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rowsAffected > 0)
			return true;
		else
			return false;
	}

	/**
	 * method to return a list of all the employees
	 * 
	 * @return List<EmployeeVO> : list of all the employees
	 */
	List<EmployeeVO> selectEmployee() {
		List<EmployeeVO> employeeList = new ArrayList<EmployeeVO>();
		try {
			String query = "select * from employee";
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				EmployeeVO employeeVO = new EmployeeVO();
				employeeVO.setId(resultSet.getString("id"));
				employeeVO.setName(resultSet.getString("name"));
				employeeVO.setAge(resultSet.getInt("age"));
				employeeVO.setSalary(resultSet.getInt("salary"));
				employeeList.add(employeeVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	/**
	 * method to return a employee detail based on id
	 * 
	 * @param id
	 *            : employee id
	 * @return EmployeeVO : employee detail
	 */
	EmployeeVO getEmployeeById(String id) {
		EmployeeVO employeeVO = new EmployeeVO();
		try {
			String query = "select * from employee where id='" + id + "'";
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				employeeVO.setId(resultSet.getString("id"));
				employeeVO.setName(resultSet.getString("name"));
				employeeVO.setAge(resultSet.getInt("age"));
				employeeVO.setSalary(resultSet.getInt("salary"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeVO;
	}

	/**
	 * method to return a employee detail based on name
	 * 
	 * @param name
	 *            : employee name
	 * @return List<EmployeeVO> : list of all the employees found based on name
	 *         search
	 */
	List<EmployeeVO> getEmployeeByName(String name) {
		List<EmployeeVO> employeeList = new ArrayList<EmployeeVO>();
		try {
			String query = "select * from employee where name='" + name + "'";
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				EmployeeVO employeeVO = new EmployeeVO();
				employeeVO.setId(resultSet.getString("id"));
				employeeVO.setName(resultSet.getString("name"));
				employeeVO.setAge(resultSet.getInt("age"));
				employeeVO.setSalary(resultSet.getInt("salary"));
				employeeList.add(employeeVO);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employeeList;
	}

	/**
	 * method to delete a employee detail based on id
	 * 
	 * @param id
	 *            : employee id
	 * @return boolean : true if created successfully else false
	 */
	boolean deleteEmployeeById(String id) {

		String query = "delete from employee where id=?";
		int rowsDeleted = 0;
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement(query);
			preparedStatement.setString(1, id);
			rowsDeleted = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (rowsDeleted > 0)
			return true;
		else
			return false;
	}
}
