function validateTextBox(){
    var box = document.getElementById("firstName");
    
    if(box.value ==""){
        alert("The field cannot be left blank");
        return false;
    }
}