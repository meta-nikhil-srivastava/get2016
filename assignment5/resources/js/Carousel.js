
$(document).ready(pluginExample);

function pluginExample() {

	var carousel = $("#carousel").waterwheelCarousel();

	//move the image previous on clicking on prev button
	$('#prev').bind('click', function () {
	
		carousel.prev();
	});

	//move the image next on clicking on next button
	$('#next').bind('click', function () {
    
		carousel.next();
	});
}