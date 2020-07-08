function change(ten) {
    let  objGood= document.getElementById("good");
    let  objCheap= document.getElementById("cheap");
    let  objFast= document.getElementById("fast");
    switch (ten) {
        case "good":
            if(objGood.checked&&objCheap.checked){
                objFast.checked=false;
            }

            break;
        case "cheap":
            if(objCheap.checked && objFast.checked){
                objGood.checked=false;
            }

            break;
        case "fast":
            if(objFast.checked&&objGood.checked){
                objCheap.checked=false;
            }

            break;
    }


}
