let nam= parseInt(prompt("nhập vào 1 năm"));
if(nam%400==0){
    alert("đây là năm nhuận");
}else if(nam%4==0&nam%100!=0){
            alert("đây là năm nhuận");
        }else {
            alert("đây không phải là năm nhuận");
        }
