let result=0;

function plus() {
    let a = parseInt( document.getElementById("first").value);
    let b = parseInt(document.getElementById("second").value);
    result= a + b;
    document.getElementById("result").value=result;
}
function subti() {
    let a = parseInt( document.getElementById("first").value);
    let b = parseInt(document.getElementById("second").value);
    result= a - b;
    document.getElementById("result").value=result;
}
function multi() {
    let a = parseInt( document.getElementById("first").value);
    let b = parseInt(document.getElementById("second").value);
    result= a * b;
    document.getElementById("result").value=result;
}
function div() {
    let a = parseInt( document.getElementById("first").value);
    let b = parseInt(document.getElementById("second").value);
    result= a / b;
    document.getElementById("result").value=result;
}
