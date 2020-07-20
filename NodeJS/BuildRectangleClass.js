let Rectangle = function (width,height) {
    this.width=width;
    this.height=height;
    this.area =function () {
        return this.width*this.height;
    }
    this.perimeter =function () {
        return (this.width+this.height)*2;
    }
};

function getRandomColor(){
    let  red = getRandomHex();
    let green = getRandomHex();
    let blue = getRandomHex();
    return "rgb(" + red + "," + blue + "," + green +")";
}
function createRectangle(){

    let ctx = document.getElementById("myCanvas").getContext("2d");
    let color = getRandomColor();
    let width = Math.random() * window.innerWidth;
    let height = Math.random() * window.innerHeight;
    let rectangle = new Rectangle(width, height);
    ctx.beginPath();
    ctx.fillRect(0,0,rectangle.width, rectangle.height );
    ctx.fillStyle = color;
    ctx.fill();

}
createRectangle();