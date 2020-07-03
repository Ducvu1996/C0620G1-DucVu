let Username =prompt("Who are you?");
if(Username=='admin'){
    let pass = prompt("what is your password?");
    if(pass=='ducvu123'){
        alert('Welcome!');
    } else if (pass == '') {
        alert('Canceled.');
    } else {
        alert('Wrong password');
    }
}else if (Username == null) {
    alert('Canceled');
} else {
    alert("I don't know you");
}