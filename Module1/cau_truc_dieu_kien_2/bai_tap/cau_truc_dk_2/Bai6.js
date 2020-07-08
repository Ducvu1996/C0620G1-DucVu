// ax+b=0
let a =parseInt(prompt("nhập vào số a"));
let b =parseInt(prompt("nhập vào số b"));
if(a ==0 && b!=0){
    alert("phương trình vô nghiệm");
}else if(a==0 && b==0){
    alert("phương trình có vô số nghiệm");
}else{
    alert("phương trình có nghiệm là: "+ -b/a);
}