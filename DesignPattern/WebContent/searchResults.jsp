<%@page import="java.util.ArrayList"%>
<%@page import="com.metacube.VO.CarVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="js/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <title>Search Results</title>
   </head>
   <body>
      <%
         List<CarVO> carList = new ArrayList<CarVO>();
         carList = (List<CarVO>) request.getAttribute("carList");
         if (carList == null || carList.isEmpty()) {
         %>
      <h1>Sorry no matches were found! Please go home and sleep and keep
         calm
      </h1>
      <%
         } else {
         %>
      <div class="container">
         <div class="row">
            <div class="col-lg-4 col-md-4 col-sm-4">
               <a href="index.jsp"><button type="button"
                  class="btn btn-primary">
               <span class="glyphicon glyphicon-home"></span>Home
               </button></a>
            </div>
         </div>
         <table class="table table-striped table-bordered table-responsive">
            <tr>
               <th>Make</th>
               <th>Model</th>
               <th>Engine(In CC)</th>
               <th>Fuel Capacity(litres)</th>
               <th>Milage(kmpl)</th>
               <th>RoadTax(Rs.)</th>
               <th>Price(Rs.)</th>
               <th>Ac</th>
               <th>PowerSteering</th>
               <th>AccessoryKit</th>
            </tr>
            <%
               for (CarVO car : carList) {
               %>
            <tr>
               <td><%=car.getMake()%></td>
               <td><%=car.getModel()%></td>
               <td><%=car.getEngineInCC()%></td>
               <td><%=car.getFuelCapacity()%></td>
               <td><%=car.getMilage()%></td>
               <td><%=car.getRoadTax()%></td>
               <td><%=car.getPrice()%></td>
               <td><%=car.isAc()%></td>
               <td><%=car.isPowerSteering()%></td>
               <td><%=car.isAccessoryKit()%></td>
            </tr>
            <%
               }
               %>
         </table>
      </div>
      <%
         }
         %>
   </body>
</html>