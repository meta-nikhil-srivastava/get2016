function inputValues(){
    
    do{
    
	var firstNumber = prompt("Please Enter valid first number");

}while(isNaN(firstNumber) || firstNumber === "" );

do{
	
    secondNumber = prompt("Please Enter valid second number");

}while(isNaN(secondNumber) || secondNumber === "");

do{ 	
	
    thirdNumber = prompt("Please enter valid third number");

}while(isNaN(thirdNumber) || thirdNumber === "");

//calling the pramitised function
    findGreatest(firstNumber,secondNumber,thirdNumber);
}

function findGreatest (firstNumber,secondNumber,thirdNumber){
    
    var placeResult = document.getElementById("resultArea");
   
    
if(firstNumber === null || secondNumber === null || thirdNumber === null){

    alert("Operation Cancelled");

}
    else{
	firstNumber = parseInt(firstNumber);
	secondNumber = parseInt(secondNumber);
	thirdNumber = parseInt(thirdNumber);
	var maxNumber = firstNumber;
	
    if(maxNumber < secondNumber){
		maxNumber = secondNumber;
	}
	if(maxNumber < thirdNumber){
		maxNumber = thirdNumber;
	}
	
        document.getElementById("button").style.visibility="hidden";

placeResult.innerHTML="<h3>The largest no is " +maxNumber +"</h3>";
    }
    
    
}
