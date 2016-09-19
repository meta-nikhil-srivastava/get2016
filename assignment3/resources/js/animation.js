$(document).ready(buttonsClick);

function buttonsClick() {
    $("#startAnimation").click(startAnimation);
    $("#stopAnimation").click(stopAnimation);
    $("#backAnimation").click(backAnimation);
    $("#leftAnimation").click(leftAnimation);
    $("#rightAnimation").click(rightAnimation);
    $("#topAnimation").click(topAnimation);
    $("#bottomAnimation").click(bottomAnimation);
}

function startAnimation() {
    $("#animateDiv").animate({
        left: '100px'
    }, 1000, 'linear');
}

function stopAnimation() {
    $("#animateDiv").stop();
}

function backAnimation() {
    $("#animateDiv").animate({
        left: '0'
    }, 1000, 'linear');
}

function leftAnimation() {
    $("#animateDiv").animate({
        left: '0'
    }, 1000, 'linear');
}

function rightAnimation() {
    $("#animateDiv").animate({
        left: '100px'
    }, 1000, 'linear');
}

function topAnimation() {
    $("#animateDiv").animate({
        top: '0'
    }, 1000, 'linear');
}

function bottomAnimation() {
    $("#animateDiv").animate({
        top: '100px'
    }, 1000, 'linear');
}