<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <title>Create Car</title>
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="js/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <script src="js/cardekho.js"></script>
   </head>
   <body>
      <div class="container">
         <div class="row" style="margin: 40px;">
            <div class="col-lg-4 col-md-4 col-sm-4">
               <a href="index.jsp"><button type="button"
                  class="btn btn-success"><span class="glyphicon glyphicon-home"></span> Home</button></a>
            </div>
         </div>
         <div class="row">
            <div class="col-lg-12 text-center">
               <h2 class="text-success">Enter the details</h2>
            </div>
         </div>
         <form role="form" 
            <%if(request.getAttribute("btn-value").toString().equals("Add")){
               %>action="CreateCarServlet"<% 
               }else {
               	%>action="UpdateServlet"<% 
               }
               		%>
            >
            <div class="form-group">
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3">
                     <label for="make">Make of car</label>
                  </div>
                  <div class="col-lg-6 col-md-4 col-sm-9">
                     <input type="text" placeholder="Enter the make"
                        class="form-control" name="make" required
                        value="<%=request.getAttribute("make")%>" />
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="model">Model Of Car</label>
                  </div>
                  <div class="col-lg-6 col-md-4 col-sm-9">
                     <input type="text" placeholder="Enter the model"
                        class="form-control" name="model" required
                        value="<%=request.getAttribute("model")%>" />
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="engine">Engine (in CC)</label>
                  </div>
                  <div class="col-lg-6 col-md-4 col-sm-9">
                     <input type="number"
                        placeholder="Enter the engine capacity eg.100-100000" min="100"
                        max="100000" class="form-control" step="0.01" name="engine"
                        value="<%=request.getAttribute("engine-capacity")%>" required />
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="fuel">Fuel Capacity</label>
                  </div>
                  <div class="col-lg-6 col-md-4 col-sm-9">
                     <input type="number" step="0.01"
                        placeholder="Enter the fuel capacity eg.5-100" min="5" max="100"
                        class="form-control" name="fuel"
                        value="<%=request.getAttribute("fuel-capacity")%>" required />
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="milage">Milage</label>
                  </div>
                  <div class="col-lg-6 col-md-4 col-sm-9">
                     <input type="number" placeholder="Enter the milage eg.1-100"
                        min="1" max="100" step="0.01" class="form-control" name="milage"
                        value="<%=request.getAttribute("milage")%>" required />
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="price">Price</label>
                  </div>
                  <div class="col-lg-6 col-md-4 col-sm-9">
                     <input type="number" placeholder="Enter the price eg.100,000-1,000,000" min="100000"
                        max="1000000" class="form-control" name="price"
                        value="<%=request.getAttribute("price")%>" required />
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="ac">Ac ?</label>
                  </div>
                  <div class="radio col-lg-3 col-md-4 col-sm-9">
                     <label><input type="radio" name="ac" value="yes"
                        <%if (request.getAttribute("isAC").toString()
                           .equalsIgnoreCase("true")) {%>
                        checked <%}%>>Yes</label> <label><input type="radio"
                        name="ac" value="no"
                        <%if (request.getAttribute("isAC").toString()
                           .equalsIgnoreCase("false")) {%>
                        checked <%}%>>No</label>
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="powersteering">Power Steering?</label>
                  </div>
                  <div class="radio col-lg-3 col-md-4 col-sm-9">
                     <label><input type="radio" name="powersteering"
                        value="yes"
                        <%if (request.getAttribute("isPowerSteering").toString()
                           .equalsIgnoreCase("true")) {%>
                        checked <%}%>>Yes</label> <label><input type="radio"
                        name="powersteering"
                        <%if (request.getAttribute("isPowerSteering").toString()
                           .equalsIgnoreCase("false")) {%>
                        checked <%}%> value="no">No</label>
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-3 col-md-2 col-sm-3 ">
                     <label for="accessorykit">Accessory Kit ?</label>
                  </div>
                  <div class="radio col-lg-3 col-md-4 col-sm-9">
                     <label><input type="radio" name="accessorykit" value="yes"
                        <%if (request.getAttribute("isAccessoryKit").toString().equalsIgnoreCase("true")) {%>
                        checked <%}%>>Yes</label> <label><input type="radio"
                        name="accessorykit" value="no"
                        <%if (request.getAttribute("isAccessoryKit").toString().equalsIgnoreCase("false")) {%>	checked <%}%>>No</label>
                  </div>
               </div>
               <div class="row">
                  <div class="col-lg-4 col-md-3"></div>
                  <div class="col-lg-4 col-md-6 col-sm-6">
                     <input type="submit" class="btn btn-success" value="<%=request.getAttribute("btn-value") %>"/>
                  </div>
               </div>
            </div>
         </form>
      </div>
   </body>
</html>