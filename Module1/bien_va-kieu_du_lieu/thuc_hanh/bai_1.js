let toan =parseInt(prompt("nhập điểm toán"));
let ly =parseInt(prompt("nhập điểm lý"));
let hoa =parseInt(prompt("nhập điểm hóa"));

 let average = (toan + ly + hoa)/3;
 let sum = toan + ly + hoa;
 document.write("điểm trung bình 3 môn là:"+average+'<br/>');
 document.write("tổng điểm 3 môn là: " +sum);