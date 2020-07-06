/bài 2
let a = parseInt(prompt('a?'));
switch (a) {
    case 0:
        alert(a);
        break;
    case 1:
        alert("giá trị a là: "+a);
        break;
    case 2:
    case 3:
        alert('2,3');
        break;
    default:
        alert("bye bye");
}