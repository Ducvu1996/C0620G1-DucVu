class Customer{
    constructor(name, idCard,birthday,email,typeService,discount,rendDays) {
        this.name= name;
        this.idCard= idCard;
        this.birthday= birthday;
        this.email= email;
        this.typeService= typeService;
        this.discount= discount;
        this.rendDays= rendDays;
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
    getTypeService(){
        return this.typeService;
    }
    getDiscount(){
        return this.discount;
    }
    getRendDays(){
        return this.rendDays;
    }

    setName(name){
        this.name=name;
    }
    setIdCard(idCard){
        this.idCard=idCard;
    }
    setBirthday(birthday){
        this.birthday=birthday;
    }
    setEmail(email){
        this.email=email;
    }
    setTypeService(typeService){
        this.typeService=typeService;
    }
    setDiscount(discount){
        this.discount=discount;
    }
    setRendDays(rendDays){
        this.rendDays=rendDays;
    }
    getInfo() {
        return "1. Customer Name: " + this.name + "\n2. Id Card: " + this.idCard +
            "\n3. Birthday: " + this.birthday + "\n 4. Email: " + this.email+
             "\n 5. Type of Service: " + this.typeService+"\n6. Discount: " + this.discount+
            "\n 7. Rend Days: " + this.rendDays ;
    }
}class Employee{
    constructor(name, idCard,birthday,email,job) {
        this.name= name;
        this.idCard= idCard;
        this.birthday= birthday;
        this.email= email;
        this.job=job;
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
     getJob(){
        return this.job;
    }


    setName(name){
        this.name=name;
    }
    setIdCard(idCard){
        this.idCard=idCard;
    }
    setBirthday(birthday){
        this.birthday=birthday;
    }
    setEmail(email){
        this.email=email;
    }
    setJob(job){
        this.typeService=job;
    }

    getInfoEmployee() {
        return "1. Customer Name: " + this.name + "\n2. Id Card: " + this.idCard +
            "\n3. Birthday: " + this.birthday + "\n 4. Email: " + this.email+
             "\n 5. Job: " +this.job;
    }
}

let listCustomers =[];
let customer1= new Customer("Nguyễn Đức Vũ","12345678","22/12/1999","jonh@gmail.com","Villa",10,5);
let customer2= new Customer("Nguyễn Thị Thu","12344321","13/06/1999","jonh1@gmail.com","House",20,7);
let customer3= new Customer("Nguyễn Văn A","87655678","20/10/1999","jonh2@gmail.com","Room",15,10);
listCustomers.push(customer1,customer2,customer3);
showCustomer(listCustomers);
//displayMainMenu();
function displayMainMenu() {
    let choice= parseInt(prompt("Input your choice:\n" +
        "1.Add a new customer.\n" +
        "2.Show all of customers.\n" +
        "3. Exit\n"));
    switch(choice) {
        case 1:
            addNewCustomer();
            break;
        case 2:
            showCustomer(listCustomers);
            break;
        case 3:
            break;
        default:
            break;
    }
}
    function showCustomer(list) {
    let bang = '<table border="1">\n' +
        ' <tr>\n' +
        '        <th> STT</th>\n' +
        '        <th> Customer Name</th>\n' +
        '        <th> Id Card</th>\n' +
        '        <th> Birthday</th>\n' +
        '        <th> Email</th>\n' +
        '        <th> Type of Service</th>\n' +
        '        <th> TotalPay</th>\n' +
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
            '        <td> ' + list[i].getTypeService() + '</td>\n' +
            '        <td> <input type="button" value="TotalPay" onclick="totalPay(' + i + ')"></td>\n' +
            '        <td> <input type="button" value="edit" onclick="editCustomer(' + i + ')"></td>\n' +
            '        <td> <input type="button" value="del" onclick="deleteCustomer(' + i + ')"></td>\n' +
            '    </tr>';
    }
    bang += '</table>';
    document.getElementById("show").innerHTML = bang;
}
function totalPay(i){
    let totalPay=0;
    let rendDays=parseInt(listCustomers[i].getRendDays());
    let discount=parseInt(listCustomers[i].getDiscount());
    if(listCustomers[i].getTypeService()==='Villa'){
        totalPay=500*rendDays*(1-discount/100) + '$';
    }
    if(listCustomers[i].getTypeService()==='House'){
        totalPay=300*rendDays*(1-discount/100)+ '$';
    }
    if(listCustomers[i].getTypeService()==='Room'){
        totalPay=100*rendDays*(1-discount/100)+'$';
    }
    alert(totalPay)
}
function addNewCustomer(){
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
            let name=prompt("retype the name");
            listCustomers[i].setName(name);
            editCustomer(i);
            break;
        case "2":
            let idCard=prompt("retype the id Card");
            listCustomers[i].setIdCard(idCard);
            editCustomer(i);
            break;
        case "3":
            let birthday=prompt("retype the birthday");
            listCustomers[i].setBirthday(birthday);
            editCustomer(i);
            break;
        case "4":
            let email=prompt("retype the email");
            listCustomers[i].setEmail(email);
            editCustomer(i);
            break;
        case "5":
            let typeService=prompt("retype the typeService");
            listCustomers[i].setEmail(typeService);
            editCustomer(i);
            break;
        case "6":
            let discount=prompt("retype the discount");
            listCustomers[i].setEmail(discount);
            editCustomer(i);
            break;
        case "7":
            let rendDays=prompt("retype the rendDays");
            listCustomers[i].setEmail(rendDays);
            editCustomer(i);
            break;
        default:
            alert("your choice is not correct");
            editCustomer(i);
    }
    showCustomer(listCustomers);
}