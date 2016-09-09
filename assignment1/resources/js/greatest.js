do{
    
	var firstNumber = prompt("Please Enter valid first number");

}while(isNaN(firstNumber) || firstNumber === "" );

do{
	
    secondNumber = prompt("Please Enter valid second number");

}while(isNaN(secondNumber) || secondNumber === "");

do{ 	
	
    thirdNumber = prompt("Please enter valid third number");

}while(isNaN(thirdNumber) || thirdNumber === "");

if(firstNumber === null || secondNumber === null || thirdNumber === null){

    prompt("Operation Cancelled");

}else{		
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
	alert("Largest number is "+maxNumber);
}