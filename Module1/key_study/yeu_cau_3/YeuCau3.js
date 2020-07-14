let name = prompt("nhập tên:");
let cmnd;
let birthday;
let check=false;
do{
    cmnd = prompt("nhập số cmnd:");
    if(!isNaN(cmnd)){
        cmnd=Number.parseFloat(cmnd);

    }
    if(!Number.isInteger(cmnd)){
        alert("CMND không đúng định dạng");
        continue;
    }
    if(cmnd<10000000||cmnd>99999999){
        alert("CMND không đúng định dạng");
        continue;
    }
    check=true;
}while(!check)
check=false;


do{
    birthday = prompt("nhập ngày sinh:");
    //let  re = /^[0-3]?[0-9]\/[01]?[0-9]\/[12][90][0-9][0-9]$/;
    let  re = /^[0-2]?[0-9]\/[0]?[1-9]\/[12][90][0-9][0-9]$/;
    let  re2 = /^[0-2]?[0-9]\/[1]?[0-2]\/[12][90][0-9][0-9]$/;
    let  re3 = /^[3]?[0-1]\/[0]?[1-9]\/[12][90][0-9][0-9]$/;
    let  re4 = /^[3]?[0-1]\/[1]?[0-2]\/[12][90][0-9][0-9]$/;

    if(birthday!=''&&!birthday.match(re)&&!birthday.match(re2)&&!birthday.match(re3)&&!birthday.match(re4)){
        alert("bạn nhập sai định dạng ");
    }else{
        check=true;
    }
}while (!check)
check=false;

let email;
do{
    let mailFormat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
    email = prompt("nhập email: ");
    if(email.match(mailFormat)){
        check=true;
    }else {
        alert("bạn nhập sai định dạng");
    }

}while(!check);
check=false;

let address = prompt("nhập địa chỉ:");
let typeService = prompt("nhập loại dịch vụ:");
let typeRoom = prompt("nhập loại phòng: ");
let typeCustomer = prompt("nhập loại khách hàng:");
let discount;
do{
    discount = prompt("nhập Discount");
    if(!isNaN(discount)){
        discount=Number.parseFloat(discount);
    }
    if(!Number.isInteger(discount)){
        alert("discount không đúng định dạng");
        continue;
    }

    check=true;

}while(!check)
check=false;


let rendDays;
do{
    rendDays = prompt("nhập số ngày thuê: ");
    if(!isNaN(rendDays)){
        rendDays=Number.parseFloat(rendDays);
    }
    if(!Number.isInteger(rendDays)){
        alert("rendDays không đúng định dạng");
        continue;
    }

    check=true;

}while(!check)
check=false;



alert("name: "+ name +
    'cmnd:'+cmnd + '\n'+
    'birthday:'+birthday+'\n'+
    'email:'+email+'\n'+
    'address:' + address +'\n'+
    'typeService:' +typeService+'\n'+
    'typeRoom:' +typeRoom+'\n'+
    'typeCustomer:'+typeCustomer+'\n'+

    'rendDays:'+rendDays+'\n'
)