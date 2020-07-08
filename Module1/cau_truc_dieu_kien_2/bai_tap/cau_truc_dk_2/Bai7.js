//Giải phương trình bậc 2.
// ax*x+bx+c=0
let a =parseInt(prompt("nhập vào số a"));
let b =parseInt(prompt("nhập vào số b"));
let c =parseInt(prompt("nhập vào số c"));
let delta= b*b-4*a*c;
if(delta < 0){
    alert("phương trình vô nghiệm");
} else if(delta==0){
    alert("phương trình có nghiệm kép là :"+ -b/(2*a));
}else {
    let x1=(-b- Math.sqrt(delta))/(2*a);
    let x2=(-b+ Math.sqrt(delta))/(2*a);

    alert("phương trình có hai nghiệm:" +x1 + " và "+ x2);
}