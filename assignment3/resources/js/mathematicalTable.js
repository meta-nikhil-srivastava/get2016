function mathematicalTable() {
	
	var number;
	
	do {
		number = prompt("Enter the number to find table of (Integers only):");
		
	}while(isNaN(number) || number==='')
	
    if(number===null){
        alert("Operation Terminated !!!")
    }    
    else{
        
	number = parseInt(number);
	var statement = document.getElementById("statement");
	statement.innerHTML = "<h3>Table of "+number+" is :</h3><br />";
	
	var str ="";
	for(var index = 1 ; index <= 10 ; index++) {
		
		str = str+""+number+" x "+index+" = "+(number*index)+"<br />";
	}
	
	var table = document.getElementById("table");
	table.innerHTML = ""+str;
}
}
