<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <script src="js/jquery.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <title>CarDekho</title>
   </head>
   <body>
      <div class="container">
         <div class="panel panel-success" style="margin-top: 60px;">
            <div class="col-lg-12 text-center panel-heading">
               <h2>Car Dekho</h2>
            </div>
            <div class="panel-body text-success">
               <div class="col-lg-12" style="padding:10px; ">
                  <p ><strong>Metacube</strong> is a software engineering
                     services company that has deep experience in developing enterprise
                     level products and applications for a wide spectrum of domains
                     including global trade management, supply chain analytics,
                     manufacturing analytics, business continuity planning, CRM,
                     publishing and eCommerce. These applications have been developed on
                     a variety of platforms. The common denominator in all our services
                     has been our total customer focus, ensuring that each engagement is
                     a success and provides the desired value to the customer.
                  </p>
               </div>
            </div>
            <div class="panel-footer panel-info">
               <form id="cardekhoform" role="form">
                  <div class="form-group">
                     <div class="row">
                        <div class="col-lg-4 col-md-4 col-sm-4">
                           <a href="CarDekhoServlet?action=create">
                           <button type="button" class="btn btn-success">Create Item</button>
                           </a>
                        </div>
                        <div class="col-lg-4 col-md-4 col-sm-4">
                           <a href="CarDekhoServlet?action=list">
                           <button type="button" class="btn btn-danger">List</button>
                           </a>
                        </div>
                     </div>
                  </div>
               </form>
            </div>
         </div>
      </div>
   </body>
</html>