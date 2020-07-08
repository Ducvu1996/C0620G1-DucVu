// thời lượng gọi nội mạng. đơn vị tính phút-2k/1p
// thời lượng gọi ngoại mạng. đơn vị tính phút- 3k/1p
let  intranet= parseInt(prompt("nhập vào số phút nội mạng:"));
let  offNet= parseInt(prompt("nhập vào số phút ngoại mạng:"));
let total;
if(intranet>100){
    total =intranet*1.5+offNet*3;
    alert("cước điện thoại là:"+total);
}else{
    total = intranet*2+offNet*3;
    alert("cước điện thoại là:"+total);
}