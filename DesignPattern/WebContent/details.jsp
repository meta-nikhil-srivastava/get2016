<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.metacube.VO.CarVO"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Car Details</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/jquery.min.js"></script>
<script src="js/bootstrap.min.js"></script>
</head>
<body>

	<%
		List<CarVO> carList = new ArrayList<CarVO>();
		carList = (List<CarVO>) session.getAttribute("carList");
		int vehicleId = Integer.parseInt(request.getParameter("vehicleId").toString());
		if (carList == null || carList.isEmpty()) {
	%>
	<h1>Sorry no matches were found!</h1>
	<%
		} else {
	%>

	<div class="container">
		<div class="row" style="margin-top: 40px;">
			<div class="col-lg-4 col-md-4 col-sm-4">
				<a href="index.jsp"><button type="button"
						class="btn btn-success">
						<span class="glyphicon glyphicon-home"></span> Home
					</button></a>
			</div>
			<div class="col-lg-4 col-md-4 col-sm-4">
				<h1 class="text-primary">Details Of Vehicle</h1>
			</div>
		</div>
		<div class="row" style="margin-top: 40px;">
			<table class="table table-bordered">
				<%
					for (CarVO car : carList) {
							if (car.getVehicleId() == vehicleId) {
				%>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Make</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.getMake()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Model</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.getModel()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Engine (in CC)</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.getEngineInCC()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Fuel Capacity (in L)</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.getMilage()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Road Tax(Rs.)</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.getRoadTax()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Price (Rs.)</label>
							</h3>
						</div>
					</td><td>
					<div class="col-lg-2">
						<h3>
							<label class="label label-success"><%=car.getPrice()%></label>
						</h3>
					</div>
					</td> 
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Has AC?</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.isAc()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Has Power Steering?</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.isPowerSteering()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<tr>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-danger">Has Accessory Kit?</label>
							</h3>
						</div>
					</td>
					<td>
						<div class="col-lg-2">
							<h3>
								<label class="label label-success"><%=car.isAccessoryKit()%></label>
							</h3>
						</div>
					</td>
				</tr>
				<%break;}
						 }
				%>
			</table>
		</div>
		</div>
		<%
			}
		%>
</body>
</html>