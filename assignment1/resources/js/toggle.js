function toggle() {
    var toggleState = document.getElementById("button");
    
    var spanText = document.getElementById("spanText");
    
    if (toggleState.value == "Hide") {
        spanText.style.visibility = "hidden";
        toggleState.value = "Show";
        toggleState.textContent = "Show";
    }
    else {
        spanText.style.visibility = "visible";
        toggleState.textContent = "Hide";
        toggleState.value = "Hide";
    }
}