function mathematicalTable() {
	
	var a;
	
	do {
		a = prompt("Enter the number to find table of (Integers only):");
		
	}while(isNaN(a) || a==='')
	
    if(a===null){
        alert("Operation Terminated !!!")
    }    
    else{
        
    
	a = parseFloat(a);
	var statement = document.getElementById("statement");
	statement.innerHTML = "<h3>Table of "+a+" is :</h3><br />";
	
	var str ="";
	for(var index = 1 ; index <= 10 ; index++) {
		
		str = str+""+a+" x "+index+" = "+(a*index).toFixed(2)+"<br />";
	}
	
	var table = document.getElementById("table");
	table.innerHTML = ""+str;
}
}