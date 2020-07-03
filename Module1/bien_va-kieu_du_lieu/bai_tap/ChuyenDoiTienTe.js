function getData() {
   let amount = document.getElementById("amount").value;
   let from= document.getElementById("from").value;

   let to = document.getElementById("to").value;
   let result;
   if(from=="vietnam"& to=="usd"){
      result = amount/23000 +"USD";
   }
   if(from=="usd"& to=="vietnam"){
      result = amount*23000+"VND";
   }
   if(from==to){
      result=amount;
   }
   document.getElementById("result").innerHTML=result;
}
