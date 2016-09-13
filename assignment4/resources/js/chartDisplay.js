function chartDisplay() {
	
	var resultArea = document.getElementById("resultArea");
	var totalElements;
	var arr = new Array();
	
	do {
		totalElements = prompt("Enter the number of elements of the array. (Integers only):");
		
	}while(isNaN(totalElements)|| totalElements==='')
		
	totalElements = parseInt(totalElements);
	for(var index = 0 ; index < totalElements ; index++) {
		
		var temp;
		do {
			temp = prompt("Enter the element "+(index+1)+" of array. (Integers only):");
		
		}while(isNaN(temp) || temp===null || temp==='')
			
		temp = parseInt(temp);
		arr.push(temp);
	}
	
	var largest = 0;
	
	for(var index = 0 ; index < arr.length ; index++) {
		
		if(largest < arr[index]) {
			
			largest = arr[index];
		}
	}
	
	var str = "";
	
	for(var rowIndex = largest ; rowIndex > 0 ; rowIndex--) {
		
		for(var columnIndex = 0 ; columnIndex < arr.length ; columnIndex++) {
			
			if(arr[columnIndex] >= rowIndex) {
				
				str = str+"*&nbsp;&nbsp;";

			} else {
				
				str = str+"&nbsp;&nbsp;&nbsp;&nbsp;"
			}
		}
		str = str+"<br />";
	}
	
	for(var index = 0 ; index < arr.length ; index++) {
		
		str = str + "" + String.fromCharCode(index+65) + "&nbsp;";
	}
	resultArea.innerHTML = ""+str;
}
