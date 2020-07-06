function buttonOne() {
    let one = document.getElementById("one").value ;
    document.getElementById("result").value =document.getElementById("result").value +one;

}
function buttonTwo() {
    let  two = document.getElementById("two").value;
    document.getElementById("result").value = document.getElementById("result").value+two;

}
function buttonThree() {
    let three = document.getElementById("three").value;
    document.getElementById("result").value = document.getElementById("result").value+three;

}
function buttonFour() {
    let four = document.getElementById("four").value;
    document.getElementById("result").value = document.getElementById("result").value+four;
}
function buttonFive() {
    let five = document.getElementById("five").value;
    document.getElementById("result").value = document.getElementById("result").value+five;
}
function buttonSix() {
   let six = document.getElementById("six").value;
    document.getElementById("result").value = document.getElementById("result").value+six;

}function buttonSeven() {
    let seven = document.getElementById("seven").value;
    document.getElementById("result").value = document.getElementById("result").value+seven;
}function buttonEight() {
    let  eight = document.getElementById("eight").value;
    document.getElementById("result").value = document.getElementById("result").value+eight;
}function buttonNine() {
    let nine = document.getElementById("nine").value;
    document.getElementById("result").value = document.getElementById("result").value+nine;
}function buttonZero() {
    let zero = document.getElementById("zero").value;
    document.getElementById("result").value = document.getElementById("result").value+zero;
}
function buttonPlus() {

    let plus = document.getElementById("plus").value;
    document.getElementById("result").value = document.getElementById("result").value +plus;
}
function buttonMinus() {

    let minus = document.getElementById("minus").value;
    document.getElementById("result").value = document.getElementById("result").value +minus;
}
function buttonMultiply() {

    let multiply = document.getElementById("multiply").value;
    document.getElementById("result").value = document.getElementById("result").value +multiply;
}
function buttonDivide() {

    let divide = document.getElementById("divide").value;
    document.getElementById("result").value = document.getElementById("result").value +divide;
}

function buttonEqual() {
    document.getElementById("result").value=eval(document.getElementById("result").value);
}
function buttonClear() {
    document.getElementById("result").value='';
}





