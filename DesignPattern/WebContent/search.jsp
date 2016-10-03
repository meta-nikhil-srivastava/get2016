<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <title>Search a car here</title>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="js/jquery.min.js"></script>
      <script src="js/searchCar.js"></script>
      <script src="js/bootstrap.min.js"></script>
   </head>
   <body>
      <div class="container">
         <form role="form" method="get">
            <div class="form-group">
               <div class="row">
                  <div class="col-lg-4 col-md-4 col-sm-4">
                     <a href="index.jsp"><button type="button"
                        class="btn btn-primary">Home</button></a>
                  </div>
               </div>
            </div>
         </form>
         <div class="row">
            <div class="col-lg-10 text-center">
               <h2>Car Search</h2>
            </div>
         </div>
         <form role="form" action="SearchCarServlet" method="get" novalidate>
            <div class="form-group">
               <div class="row">
                  <div class="col-lg-4 col-md-4 col-sm-9"></div>
                  <div class="col-lg-3 col-md-4 col-sm-9">
                     <select class="form-control" id="search-parameter" name="search-parameter">
                        <option value="default">--Select search parameter</option>
                        <option value="make">Make</option>
                        <option value="model">Model</option>
                        <option value="engine_in_cc">EngineInCC</option>
                        <option value="fuel_capacity">Fuel Capacity</option>
                        <option value="milage">Milage</option>
                        <option value="price">Price</option>
                     </select>
                  </div>
               </div>
               <div class="row" id="search-value-string">
                  <input type="text" placeholder="Enter search parameter" name="search-value-string" required/>
               </div>
               <div class="row" id="search-value-number">
                  <input type="text" id="search-value-number-min"	placeholder="Enter minimum value" name="search-value-number-min" required/>
                  <input type="text"	id="search-value-number-max" placeholder="Enter maximum value" name="search-value-number-max" required/>
               </div>
               <div class="row">
                  <div class="col-lg-4 col-md-3"></div>
                  <div class="col-lg-4 col-md-6 col-sm-6">
                     <input type="submit" class="btn btn-primary" value="Search">
                  </div>
               </div>
            </div>
         </form>
      </div>
   </body>
</html>