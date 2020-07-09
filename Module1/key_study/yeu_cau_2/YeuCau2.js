let name = "Nguyễn Văn A";

let cmnd = "123456789";
let birthday = 8 / 19 / 1987;
let email = "abc@gmail.com";
let address = "Đà Nẵng";
let typeService = "Villa";// House, Room
let typeRoom = "Vip"; //Business, Normal
let typeCustomer = "Diamond";// Platinum , Gold, Silver, Member
let discount =0;
let rendDays = 7;
// tính discount
//theo address
if(address=='Đà Nẵng'){
    discount = discount +20;
}else if(address=='Huế'){
    discount=discount+10;
}else if(address=='Quảng Nam'){
    discount=discount+5;
}
// theo số ngày thuê
if(rendDays>=7){
    discount+=30;
}else if(rendDays>=5&&rendDays<7){
    discount+=20;
}else if(rendDays>=2&&rendDays<=4){
    discount+=10;
}
//theo typeCustomer
if(typeCustomer=='Diamond'){
    discount+=15;
}else if(typeCustomer=='Platinum'){
    discount+=10;
}else if(typeCustomer=='Gold'){
    discount+=5;
}else if(typeCustomer=='Silver'){
    discount+=2;
}

let currentYear = new Date().getFullYear();
let  yearOfBirth= new Date(birthday).getFullYear();
let ageCustomer = currentYear - yearOfBirth;
if(ageCustomer>=30){
    discount+=2;
}else if(ageCustomer>=20&&ageCustomer<30){
    discount+=1;
}
//theo birthday

choice();

function choice() {
    let choose = parseInt(prompt("nhập lựa chọn của bạn:\n" +
        "1: In thông tin khách hàng.\n" +
        "2: Sửa thông tin khách hàng.\n" +
        "3: Số tiền phải trả sau khi giảm giá"));
    switch (choose) {
        case 1:
            show();
            choice();
            break;
        case 2:
            edit();
            choice();
            break;
        case 3:
            total();
            break;
        default:
            alert("failed");
            break;
    }

}
function edit() {
    let choice = parseInt(prompt("nhập lựa chọn của bạn:\n" +
        "1: Sửa tên khách hàng.\n" +
        "2: Sửa số chứng minh nhân dân.\n" +
        "3: Sửa ngày sinh.\n" +
        "4: Sửa email.\n" +
        "5: Sửa địa chỉ.\n" +
        "6: Sửa loại dịch vụ.\n" +
        "7: Sửa loại phòng.\n" +
        "8: Sửa loại khách hàng.\n" +
        "9:Số ngày thuê "));
    switch (choice) {
        case 1:
            name = prompt("nhập tên khách hàng");
            break;
        case 2:
            cmnd = prompt("nhập số chứng minh nhân dân");
            break;
        case 3:
            birthday = prompt("nhập ngày sinh");
            break;
        case 4:
            email = prompt("nhập email");
            break;
        case 5:
            address = prompt("nhập địa chỉ");
            break;
        case 6:
            typeService = prompt("nhập loại dịch vụ");
            break;
        case 7:
            typeRoom = prompt("nhập loại phòng");
            break;
        case 8:
            typeCustomer = prompt("nhập loại khách hàng");
            break;
        case 9:
            rendDays = prompt("nhập số ngày thuê");
            break;
        default:
            alert("failed");
            break;
    }

}

function show() {

    alert("name: " + name + '\n' +
        'cmnd:' + cmnd + '\n' +
        'birthday:' + birthday + '\n' +
        'email:' + email + '\n' +
        'address:' + address + '\n' +
        'typeService:' + typeService + '\n' +
        'typeRoom:' + typeRoom + '\n' +
        'typeCustomer:' + typeCustomer + '\n' +
        'rendDays:' + rendDays + '\n'
    );
}
function total() {
    let totalPay=0;
    if(typeService=='Villa'){
        totalPay= 500*rendDays-discount;
    }else if(typeService=='House'){
        totalPay=300*rendDays-discount;
    }else if(typeService=='Room'){
        totalPay=100*rendDays-discount;
    }
    alert("số tiền khách phải trả là:"+totalPay + '$');
}