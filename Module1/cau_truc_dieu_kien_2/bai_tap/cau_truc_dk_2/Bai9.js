let a =parseInt(prompt("nhập vào cạnh thứ 1"));
let b =parseInt(prompt("nhập vào cạnh thứ 2"));
let c =parseInt(prompt("nhập vào cạnh thứ 3"));
if( a<b+c && b<a+c && c<a+b && a>0&& b>0 && c>0){
    alert("đây là 3 cạnh của 1 tam giác");
}else {
    alert("đây không phải là ba cạnh của 1 tam giác");
}