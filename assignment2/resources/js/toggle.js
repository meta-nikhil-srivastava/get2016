$(document).ready(function(){
  
    $("#button").click(function(){
     
        if($("#button").text()==='Show')
           {
              $("#spanText").css("visibility","visible");
               $("#button").text("Hide");   
           }
           else{
               $("#spanText").css("visibility","hidden");
               $("#button").text("Show");
               
           }
//         $("#spanText").toggle();
   });
    
});