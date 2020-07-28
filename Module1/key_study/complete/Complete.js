class Customer{
    constructor(name, idCard,birthday,email) {
        this.name= name;
        this.idCard= idCard;
        this.birthday= birthday;
        this.email= email;
    }
    getName(){
        return this.name;
    }
    getIdCard(){
        return this.idCard;
    }
    getBirthday(){
        return this.birthday;
    }
    getEmail(){
        return this.email;
    }
    setName(name){
        this.name=name;
    }
    setIdCard(idCard){
        this.name=idCard;
    }
    setBirthday(birthday){
        this.name=birthday;
    }
    setEmail(email){
        this.name=email;
    }
    getInfo() {
        return "1. Customer Name: " + this.name + "\n2. Id Card: " + this.idCard +
            "\n3. Birthday: " + this.birthday + "\n 4. Email: " + this.email;
    }
}
let listCustomers =[];
let customer1= new Customer("Nguyễn Đức Vũ","12345678","22/12/1999","jonh@gmail.com");
let customer2= new Customer("Nguyễn Thị Thu","12344321","13/06/1999","jonh1@gmail.com");
let customer3= new Customer("Nguyễn Văn A","87655678","20/10/1999","jonh2@gmail.com");
listCustomers.push(customer1,customer2,customer3);
showCustomer(listCustomers);
function showCustomer(list) {
    let bang = '<table border="1">\n' +
        ' <tr>\n' +
        '        <th> STT</th>\n' +
        '        <th> Customer Name</th>\n' +
        '        <th> Id Card</th>\n' +
        '        <th> Birthday</th>\n' +
        '        <th> Email</th>\n' +
        '        <th> Edit</th>\n' +
        '        <th> Del</th>\n' +
        '    </tr>';
    for (let i = 0; i < list.length; i++) {
        bang += '<tr>\n' +
            '        <td> ' + (i + 1) + '</td>\n' +
            '        <td> ' + list[i].getName() + '</td>\n' +
            '        <td> ' + list[i].getIdCard() + '</td>\n' +
            '        <td> ' + list[i].getBirthday() + '</td>\n' +
            '        <td> ' + list[i].getEmail() + '</td>\n' +
            '        <td> <input type="button" value="edit" onclick="editCustomer(' + i + ')"></td>\n' +
            '        <td> <input type="button" value="del" onclick="deleteCustomer(' + i + ')"></td>\n' +
            '    </tr>';
    }
    bang += '</table>';
    document.getElementById("show").innerHTML = bang;
}
function addNewCustomer() {
    let name= prompt("input name of customer");
    let idCard= prompt("input idCard of Customer");
    let birthday=prompt("input birthday of customer");
    let email= prompt("input email of customer");
    let newCustomer= new Customer(name,idCard,birthday,email);
    listCustomers.push(newCustomer);
    showCustomer(listCustomers);
}
function deleteCustomer(i) {
    let confirmDel = confirm(" do you want to delete " + listCustomers[i].getName());
    if (confirmDel) {
        listCustomers.splice(i, 1);
    } else {
        alert(" you did delete completely the customer.")
    }
    showCustomer(listCustomers);

}
function editCustomer(i) {
    let choice = prompt(" choose the information of customer that you want to edit: \n" +
        listCustomers[i].getInfo()+"\n 5.exit");
    switch (choice) {
        case "1":
            let name=prompt("retype the name")
            listCustomers[i].setName(name);
            editCustomer(i);
            break;
        case "2":
            let idCard=prompt("retype the id Card")
            listCustomers[i].setIdCard(idCard);
            editCustomer(i);
            break;
        case "3":
            let birthday=prompt("retype the name")
            listCustomers[i].setBirthday(birthday);
            editCustomer(i);
            break;
        case "4":
            let email=prompt("retype the name")
            listCustomers[i].setEmail(email);
            editCustomer(i);
            break;
        case "5":
            break;
        default:
            alert("your choice is not correct");
            editCustomer(i);
    }
    showCustomer(listCustomers);
}