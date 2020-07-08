//nhập vào số điểm học sinh
let point =parseInt(prompt("nhập vào điểm của học sinh"));
if(point>=9){
    alert("đạt học sinh giỏi");
}else if(point>=7 && point<9){
    alert("đạt học sinh khá");
}else if(point>=5 && point<7){
    alert("đạt học sinh trung bình");
}else {
    alert("đạt học sinh yếu");
}