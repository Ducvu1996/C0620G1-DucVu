let num = parseInt(prompt("nhập vào số lượng số nguyên tố cần in ra"));

let count=0;

for(let i=2;;i++) {
    if (isPrimeNumber(i)){
      document.write(i+'\n');
      count ++;
    }

    if(count==num){
        break;
    }
}


function isPrimeNumber(n) {
    if(n<2){
        return 0;
    }
    let i;
    for(i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            return 0;
        }
    }
    return 1;
}
