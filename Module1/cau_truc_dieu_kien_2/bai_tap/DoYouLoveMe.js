function move() {

    let element = document.getElementById('buttonNo');
    element.style.position = 'relative';
    let width=  parseInt(Math.floor(Math.random() * 150));
    let height=parseInt( Math.floor(Math.random() * 150));

    document.getElementById("buttonNo").style.left = width +"px";
    document.getElementById("buttonNo").style.top = height +"px";


}