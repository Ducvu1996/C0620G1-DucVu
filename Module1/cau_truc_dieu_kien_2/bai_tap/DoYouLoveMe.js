function move() {

    let element = document.getElementById('buttonNo');
    element.style.position = 'relative';
    let x=  parseInt(Math.floor(Math.random() * 150));
    let y=parseInt( Math.floor(Math.random() * 150));

    document.getElementById("buttonNo").style.left = x +"px";
    document.getElementById("buttonNo").style.top = y +"px";


}