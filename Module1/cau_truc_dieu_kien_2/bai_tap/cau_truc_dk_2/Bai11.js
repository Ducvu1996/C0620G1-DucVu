// tính thuế thu nhập cá nhân
// nhập thu nhập cá nhân
let income= parseInt(prompt("nhập thu nhập của bạn:"));
let tax;
if(income> 1000){
    tax= income*15/100;
}else{
    tax= income*10/100;
}
alert("thuế thu nhập cá nhân của bạn là:"+tax +'$');