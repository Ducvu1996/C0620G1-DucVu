function change(img) {
    let objImg1= document.getElementById("img1");
    let objImg2= document.getElementById("img2");
    let objImg3= document.getElementById("img3");
    let objImg4= document.getElementById("img4");
    let objImg5= document.getElementById("img5");
    switch (img) {
        case "img1":
            if (objImg1.getAttribute("src")==="funny-cat1_part1x1.jpg"){
                objImg1.src="monkey_part1x1.jpg";
            }else if (objImg1.getAttribute("src")==="monkey_part1x1.jpg"){
                objImg1.src="panda_swap_part1x1.jpg";
            }else {
                objImg1.src="funny-cat1_part1x1.jpg";
            }
            setTimeout(check,1000);
            break;
        case "img2":
            if (objImg2.getAttribute("src")==="funny-cat1_part2x1.jpg"){
                objImg2.src="monkey_part2x1.jpg";
            }else if (objImg2.getAttribute("src")==="monkey_part2x1.jpg"){
                objImg2.src="panda_swap_part2x1.jpg";
            }else {
                objImg2.src="funny-cat1_part2x1.jpg";
            }
            setTimeout(check,1000);
            break;
        case "img3":
            if (objImg3.getAttribute("src")==="funny-cat1_part3x1.jpg"){
                objImg3.src="monkey_part3x1.jpg";
            }else if (objImg3.getAttribute("src")==="monkey_part3x1.jpg"){
                objImg3.src="panda_swap_part3x1.jpg";
            }else {
                objImg3.src="funny-cat1_part3x1.jpg";
            }
            setTimeout(check,1000);
            break;
        case "img4":
            if (objImg4.getAttribute("src")==="funny-cat1_part4x1.jpg"){
                objImg4.src="monkey_part4x1.jpg";
            }else if (objImg4.getAttribute("src")==="monkey_part4x1.jpg"){
                objImg4.src="panda_swap_part4x1.jpg";
            }else {
                objImg4.src="funny-cat1_part4x1.jpg";
            }
            setTimeout(check,1000);
            break;
        case "img5":
            if (objImg5.getAttribute("src")==="funny-cat1_part5x1.jpg"){
                objImg5.src="monkey_part5x1.jpg";
            }else if (objImg5.getAttribute("src")==="monkey_part5x1.jpg"){
                objImg5.src="panda_swap_part5x1.jpg";
            }else {
                objImg5.src="funny-cat1_part5x1.jpg";
            }
            setTimeout(check,1000);
            break;


    }
}
function check() {
    let objImg1= document.getElementById("img1");
    let objImg2= document.getElementById("img2");
    let objImg3= document.getElementById("img3");
    let objImg4= document.getElementById("img4");
    let objImg5= document.getElementById("img5");

    let checkCat=objImg1.getAttribute("src")==="funny-cat1_part1x1.jpg"&&objImg2.getAttribute("src")==="funny-cat1_part2x1.jpg"&&objImg3.getAttribute("src")==="funny-cat1_part3x1.jpg"&&objImg4.getAttribute("src")==="funny-cat1_part4x1.jpg"&&objImg5.getAttribute("src")==="funny-cat1_part5x1.jpg";
    let checkMonkey=objImg1.getAttribute("src")==="monkey_part1x1.jpg"&&objImg2.getAttribute("src")==="monkey_part2x1.jpg"&&objImg3.getAttribute("src")==="monkey_part3x1.jpg"&&objImg4.getAttribute("src")==="monkey_part4x1.jpg"&&objImg5.getAttribute("src")==="monkey_part5x1.jpg";
    let checkPanda=objImg1.getAttribute("src")==="panda_swap_part1x1.jpg"&&objImg2.getAttribute("src")==="panda_swap_part2x1.jpg"&&objImg3.getAttribute("src")==="panda_swap_part3x1.jpg"&&objImg4.getAttribute("src")==="panda_swap_part4x1.jpg"&&objImg5.getAttribute("src")==="panda_swap_part5x1.jpg";

    if (checkCat){
        alert(" chào con mèo");
    }else if(checkMonkey){
        alert("ôi con khỉ");
    }else if(checkPanda){
        alert("wow con gấu trúc");
    }
}