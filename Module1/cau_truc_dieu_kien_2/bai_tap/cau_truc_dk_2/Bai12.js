//tính lãi ngân hàng
// tiền vốn
// lãi ngân hàng : 7%
// số năm gửi
let fund=parseInt(prompt("nhập vào tiền vốn ban đầu"));
let years=parseInt(prompt("nhập vào số năm bạn cần gửi"));
let interest;
if(years<3){
    interest=fund*(1+ 7/100 * years)-fund;

}else{
    interest=fund* Math.pow(1+7/100,years)-fund;
}
alert("số tiền lãi sau khi bạn gửi "+ fund +" triêu, trong "  +years+ "năm là: " +interest +"triệu" );