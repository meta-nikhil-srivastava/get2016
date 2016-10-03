$(document).ready(init);

function init() {
	$("#search-value-string").hide();
	$("#search-value-number").hide();
	$("#search-parameter").on('change', getSelectedOption);
}

function getSelectedOption() {

	var optionSelected = $("#search-parameter").val();
	if (optionSelected === "default") {
		$("#search-value-string").hide();
		$("#search-value-number").hide();
		alert('Choose a valid option');
		return false;
	} else {
		switch (optionSelected) {
		case "make":
			$("#search-value-number").hide();
			$("#search-value-string").attr("placeholder", "Enter the brand");
			$("#search-value-string").show();
			break;
		case "model":
			$("#search-value-number").hide();
			$("#search-value-string").show();
			$("#search-value-string").attr("placeholder", "Enter the model");
			break;
		case "engine_in_cc":
		case "fuel-capacity":
		case "milage":
		case "price":
			$("#search-value-string").hide();
			$("#search-value-number").show();
			break;
		default:
			break;
		}
	}
}