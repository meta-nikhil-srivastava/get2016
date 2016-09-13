
function checkCharacter(){
    var demo = document.getElementById("result");
    do{
    var inputCharacter = prompt("Enter a character");
}while(inputCharacter.length!=1|| !isNaN(inputCharacter))

   
 switch(inputCharacter){
         
     case "a":
     case "A":
     case "e":
     case "E":
     case "i":
     case "I":
     case "o":
     case "O":
     case "u":
     case "U":
        
     demo.innerHTML= "<b>"+inputCharacter +" is a vowel </b>"
     break;
     default: demo.innerHTML="<b>"+inputCharacter +" is a consonant </b>"
     break;
 }    
}