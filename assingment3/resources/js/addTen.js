function performAddition(){
    do{
    
        var input= prompt("Enter the Number");
    
    }while(isNaN(input) || input === "" );
    
    if(input ===null){
        alert("Operation Terminated");
    }
    else{
    input = parseInt(input);
    output = input+10;
    
    alert("Result is " +output);
}
}