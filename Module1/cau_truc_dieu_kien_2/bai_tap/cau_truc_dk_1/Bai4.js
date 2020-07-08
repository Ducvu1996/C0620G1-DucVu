let soNguyen1= parseInt(prompt("nhập số nguyên 1:"));
let soNguyen2= parseInt(prompt("nhập số nguyên 2:"));
let soNguyen3= parseInt(prompt("nhập số nguyên 3:"));

let max= soNguyen1;
if(soNguyen2> max){
    max=soNguyen2;
}
if(soNguyen3>max){
    max=soNguyen3;
}
alert("số lớn nhất là:" + max);