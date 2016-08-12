/**
 * FileName : Employee.java
 */
package com.metacube.ds.session6.assignment1;

public class Employee implements Comparable<Employee> {
	private String empID;
	private String empName;
	private String empAddress;

	/**
	 * Constructor To initialize the Employee Class member variables
	 * 
	 * @param employeeID
	 *            (String) denotes the employee Id given by the user
	 * @param name
	 *            (String) denotes the name of the employee.
	 * @param address
	 *            (String) denotes the address of the employee
	 */
	public Employee(String employeeID, String name, String address) {
		this.empID = employeeID;
		this.empName = name;
		this.empAddress = address;
	}

	/**
	 * @return the empID
	 */
	public String getEmpID() {
		return empID;
	}

	/**
	 * @param empID
	 *            the empID to set
	 */
	public void setEmpID(String empID) {
		this.empID = empID;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the empAddress
	 */
	public String getEmpAddress() {
		return empAddress;
	}

	/**
	 * @param empAddress
	 *            the empAddress to set
	 */
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	/**
	 * Method to perform the natural ordering based on the employee id
	 */
	@Override
	public int compareTo(Employee o) {
		return empID.compareTo(o.getEmpID());
	}
	
	@Override
	public String toString(){
		return "ID : "+ this.empID + "  Name : " + this.empName + "  Address : " + this.empAddress;
		
	}
}
