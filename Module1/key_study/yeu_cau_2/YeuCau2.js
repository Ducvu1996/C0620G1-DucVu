let name = "Nguye";
let name = prompt("nhập tên:");
let cmnd = prompt("nhập số cmnd:");
let birthday = prompt("nhập ngày sinh:");
let email = prompt("nhập email: ");
let address = prompt("nhập địa chỉ:");
let typeService = prompt("nhập loại dịch vụ:");
let typeRoom = prompt("nhập loại phòng: ");
let typeCustomer = prompt("nhập loại khách hàng:");
let discount = prompt("nhập Discount");
let quantityIncluded = prompt("nhập số lượng:");
let rendDays = prompt("nhập số ngày thuê: ");

let totalPay;
if(typeService=='Villa'){
    totalPay=500*rendDays*(1-discount/100) + '$';
}
if(typeService=='House'){
    totalPay=300*rendDays*(1-discount/100)+ '$';
}
if(typeService=='Room'){
    totalPay=100*rendDays*(1-discount/100)+'$';
}

function show(){

    alert("name: "+ name +
        'cmnd:'+cmnd + '\n'+
        'birthday:'+birthday+'\n'+
        'email:'+email+'\n'+
        'address:' + address +'\n'+
        'typeService:' +typeService+'\n'+
        'typeRoom:' +typeRoom+'\n'+
        'typeCustomer:'+typeCustomer+'\n'+
        'quantityIncluded:'+ quantityIncluded+'\n'+
        'rendDays:'+rendDays+'\n'+
        'totalPay:'+totalPay
    );
}