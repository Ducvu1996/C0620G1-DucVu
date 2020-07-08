// tính giá điện
// nếu sử dụng trên 100kw thì tiền điện là 4k/1kw
// nếu sử dụng trên 50kw thì tiền điện là 3k/1kw
// nếu sử dụng dưới 50kw thì tiền điện là 2k/1kw
let soDien = parseInt(prompt("Số lượng điện tiêu thụ là:")) ;
let thanhTien;
if(soDien>100){
    thanhTien= soDien*4;
    alert("giá điện là:"+thanhTien+'.000 VND');
}else if(soDien<50){
    thanhTien= soDien*2;
    alert("giá điện là:"+thanhTien+'.000 VND');
}else{
    thanhTien= soDien*3;
    alert("giá điện là:"+thanhTien+'.000 VND');
}