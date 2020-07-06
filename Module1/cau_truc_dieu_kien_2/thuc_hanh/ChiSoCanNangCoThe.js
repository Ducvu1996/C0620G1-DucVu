let weight = parseInt(prompt("nhập vào cân nặng: "));
let height = parseFloat(prompt("nhập vào chiều cao: "));
let bmi= weight/(height*height);
//alert(bmi);
 if(bmi<18){
     alert("gầy gò");
 }else if(bmi<25){
    alert("bình thương");
 }else if(bmi<30){
     alert("quá cân");
 }else {
     alert("béo phì");
 }