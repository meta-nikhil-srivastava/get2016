$(document).ready(printEmployeeData);

function printEmployeeData() {

	$("select#employee").change(function() {

		var employee  = $("select#employee").val().trim();
		if(employee != "default") {
			$.ajax({
			
				url: "resources/json/employees.json",
				dataType: "text",
				success: function(data) {
					
					//parsing of JSON file
					var json = $.parseJSON(data);
					
					$.each(json, function(index) {

						if(json[index].firstName+" "+json[index].lastName === employee) {
							
							$("#result").html("<br />Name : "+json[index].firstName+" "+json[index].lastName+"<br />Email : "+json[index].email+"<br />D.O.B. : "+json[index].dob+"<br />Address : "+json[index].address.streetAddress+", "+json[index].address.city+", "+json[index].address.state+", "+json[index].address.postalCode+"<br />");
						}
					});
				},
				//reuns when error comes
				error: function() {
				
					alert("error");
				}
			});
		} else {
			
			$("#result").html("");
		}
	});
}