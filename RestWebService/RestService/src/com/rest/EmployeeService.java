package com.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * restful service for accessing the employee data
 * 
 * @author admin
 *
 */
@Path("/employee")
public class EmployeeService {

	EmployeeFacade employeeFacade = new EmployeeFacade();

	/**
	 * method to return a list of all the employees
	 * 
	 * @return @return Response : status(200) if found some data entries else
	 *         status(404) if no data entry is found in data base
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response selectAllEmployees() {

		List<EmployeeVO> employeeList = employeeFacade.selectEmployee();
		if (employeeList != null) {
			GenericEntity<List<EmployeeVO>> genericEmployeeList = new GenericEntity<List<EmployeeVO>>(
					employeeList) {
			};
			return Response.status(200).entity(genericEmployeeList).build();
		} else {
			return Response.status(404).build();
		}
	}

	/**
	 * method to search employees by id
	 * 
	 * @param id
	 *            : employee id
	 * @return @return Response : status(200) if found some data entries else
	 *         status(404) if the data entry for given id is not found in data
	 *         base
	 */
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getEmployeeById(@PathParam("id") String id) {
		EmployeeVO employeeVO = employeeFacade.getEmployeeById(id);
		if (employeeVO != null) {
			GenericEntity<EmployeeVO> genericEmployeeVO = new GenericEntity<EmployeeVO>(
					employeeVO) {
			};
			return Response.status(200).entity(genericEmployeeVO).build();
		} else {
			return Response.status(404).build();
		}

	}

	/**
	 * method to search employees
	 * 
	 * @param searchType
	 *            : the parameter for search
	 * @param searchValue
	 *            : the value over which search is to be performed
	 * @return @return Response : status(200) if found some data entries else
	 *         status(404) if the data entry for given search type and value is
	 *         not found in data base
	 */
	@GET
	@Path("/search")
	@Produces(MediaType.APPLICATION_JSON)
	public Response searchEmployee(@QueryParam("searchType") String searchType,
			@QueryParam("searchValue") String searchValue) {
		GenericEntity<List<EmployeeVO>> genericEmployeeList = null;
		if (searchType.equals("name")) {
			List<EmployeeVO> employeeList = employeeFacade
					.getEmployeeByName(searchValue);
			genericEmployeeList = new GenericEntity<List<EmployeeVO>>(
					employeeList) {
			};
			return Response.status(200).entity(genericEmployeeList).build();
		} else {
			return Response.status(404).build();
		}

	}

	/**
	 * method to delete a employee detail based on id
	 * 
	 * @param id
	 *            : employee id
	 * @return Response : status(200) if deleted successfully else status(404)
	 *         if the data entry for given id not found in data base
	 */
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteEmployeeById(@PathParam("id") String id) {
		boolean flag = employeeFacade.deleteEmployeeById(id);
		if (flag == true)
			return Response.status(200).build();
		else
			return Response.status(404).build();
	}

	/**
	 * method to create a new employee entry
	 * 
	 * @param employeeVO
	 *            : employee data
	 * @return Response : status(201) if created successfully else status(409)
	 *         if the data contains duplicate ID entry
	 */
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertEmployee(EmployeeVO employeeVO) {
		Boolean flag = employeeFacade.insertEmployee(employeeVO);
		if (flag == true)
			return Response.status(201).build();
		else
			return Response.status(409).build();
	}
}
