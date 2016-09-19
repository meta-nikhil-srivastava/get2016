$(document).ready(keyPress);

function keyPress() {
    $(".input#name").keyup(changeColorForNameField);
    $(".input#age").keyup(validateAge);
    $(".input#address").keyup(changeColorForAddressField);
}

function changeColor(inputTag) {
    inputTag.css("background", "yellow");
    setTimeout(function () {
        inputTag.css("background", "white");
    }, 100);
}

function changeColorForNameField() {
    var name = $(".input#name");
    var currentValue = "";
    currentValue = name.val();
    if (currentValue != "") {
        changeColor(name);
        $(".result #updatedName").html("Name: " + currentValue);
    }
    else {
        $("div #updatedName").html("");
    }
}

function changeColorForAgeField() {
    var age = $(".input#age");
    var currentValue = "";
    currentValue = age.val();
    if (currentValue != "") {
        changeColor(age);
        $(".result #updatedAge").text("Age: " + currentValue);
    }
    else {
        $(".result #updatedAge").html("");
    }
}

function changeColorForAddressField() {
    var address = $(".input#address");
    var currentValue = "";
    currentValue = address.val();
    if (currentValue != "") {
        changeColor(address);
        $(".result #updatedAddress").html("Address: " + currentValue);
    }
    else {
        $(".result #updatedAddress").html("");
    }
}
function validateAge() {
    var value = $(".input#age").val();
    if (value >= 0 && value < 150) {
        $(".input#age").css("borderColor", "grey");
    }
    else {
        $(".input#age").css("borderColor", "red");
        $(".input#age").val("");
    }
    changeColorForAgeField();
}