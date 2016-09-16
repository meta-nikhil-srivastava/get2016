$(document).ready(changeSpanMessage);
$(document).ready(selectDivs);
$(document).ready(selectButtons);
$(document).ready(selectImages);
$(document).ready(selectTextbox);
$(document).ready(selectTextboxes);
$(document).ready(selectPara);
$(document).ready(selectErrors);
$(document).ready(selectBothDivs);
$(document).ready(selectmyDiv);

function changeSpanMessage() {
    $('#button1').click(function () {
        if ($("#button1").text() === 'Change') {
            $("span.message").css("fontSize", "25px");
            $("#button1").text("Revert");
        }
        else {
            $("span.message").css("fontSize", "16px");
            $("#button1").text("Change");
        }
    });
}

function selectDivs() {
    $('#button2').click(function () {
        if ($("#button2").text() === 'Change') {
            $("div.box:first").css("background", "green");
            $("#button2").text("Revert");
        }
        else {
            $("div.box:first").css("background", "white");
            $("#button2").text("Change");
        }
    });
}

function selectButtons() {
    $('#button3').click(function () {
        $(":button").css("color", "blue");
    });
}

function selectImages() {
    $('#button4').click(function () {
        $("img[alt='hello']").css("width", "300px");
    });
}

function selectTextbox() {
    $('#button5').click(function () {
        $("#myDiv").find("input[type='text']").css("background", "orange");
    });
}

function selectTextboxes() {
    $('#button6').click(function () {
        $("input[name^='txt']").css("background", "yellow");
    });
}

function selectPara() {
    $('#button7').click(function () {
        $("p").not(".box").css("background", "red");
    });
}

function selectErrors() {
    $('#button8').click(function () {
        $(".box, .error").css("background", "lime");
    });
}

function selectBothDivs() {
    $('#button9').click(function () {
        $(".box.error").css("background", "pink");
    });
}

function selectmyDiv() {
    $('#button10').click(function () {
        $("div#myDiv span.info").css("color", "blue");
    });
}