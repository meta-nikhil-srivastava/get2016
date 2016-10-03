<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page isErrorPage="true"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Error page</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-4 col-md-4 col-sm-4">
				<a href="index.jsp"><button type="button"
						class="btn btn-primary">
						<span class="glyphicon glyphicon-home"></span>Home
					</button></a>
			</div>
		</div>
	</div>
	<h1>Opps...</h1>
	<p>Sorry, an error occurred.</p>
	<pre>
<%
         exception.getLocalizedMessage();
         %>
</pre>
</body>
</html>