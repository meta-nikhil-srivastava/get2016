$(document).ready(function()
{
  
    $('[data-toggle="tooltip"]').tooltip();

    $("#notif-btn1").click(function(){
        $("#myModal").on("show.bs.modal",function(){
          $("#modalHeader123").text("Notification");
          $(".modal-header").removeClass("light-green");
          $(".modal-header").removeClass("light-red");
          $(".modal-header").removeClass("dark-green");
          $(".modal-header").removeClass("dark-violet");
          $(".modal-header").addClass("light-green");
        });
    });

    $("#notif-btn2").click(function(){
      $("#myModal").on("show.bs.modal",function(){
        $("#modalHeader123").text("Photography");
        $(".modal-header").removeClass("light-green");
        $(".modal-header").removeClass("light-red");
        $(".modal-header").removeClass("dark-green");
        $(".modal-header").removeClass("dark-violet");
        $(".modal-header").addClass("light-red");
    });
    });

    $("#notif-btn3").click(function(){
      $("#myModal").on("show.bs.modal",function(){
        $("#modalHeader123").text("Favourites");
        $(".modal-header").removeClass("light-green");
        $(".modal-header").removeClass("light-red");
        $(".modal-header").removeClass("dark-green");
        $(".modal-header").removeClass("dark-violet");
        $(".modal-header").addClass("dark-green");
    });
    });

    $("#notif-btn4").click(function(){
      $("#myModal").on("show.bs.modal",function(){
        $("#modalHeader123").text("Announcements");
        $(".modal-header").removeClass("light-green");
        $(".modal-header").removeClass("light-red");
        $(".modal-header").removeClass("dark-green");
        $(".modal-header").removeClass("dark-violet");
        $(".modal-header").addClass("dark-violet");
    });
  });
  });
