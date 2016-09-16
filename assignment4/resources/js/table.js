$(document).ready(function () {
    $("#button").click(function () {
        if ($("#button").text() === "Change") {
            $("tr:even").css("backgroundColor", "pink");
            $("tr:odd").css("backgroundColor", "orange");
            //color odd rows
            $("#button").text("Revert");
        }
        else {
            $("tr").css("backgroundColor", "white");
            $("#button").text("Change");
        }
    });
});
