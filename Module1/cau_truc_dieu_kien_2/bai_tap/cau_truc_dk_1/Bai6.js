let revenue =parseInt(prompt("nhập vào doanh thu bán hàng:"));
let commission;
if(revenue >1000){
    commission = revenue*10/100;
    alert("doanh thu:"+revenue);
    alert("tiền hoa hồng:" +commission);
}else if(revenue < 1000&& revenue>=500){
    commission = revenue*8/100;
    alert("doanh thu:"+revenue);
    alert("tiền hoa hồng:" +commission);
}else {
    commission = revenue*5/100;
    alert("doanh thu:"+revenue);
    alert("tiền hoa hồng:" +commission);
}