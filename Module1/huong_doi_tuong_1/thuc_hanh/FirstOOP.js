let person={
    name: ["Vũ","Thu"],
    age:20,
    hair: "blue",
    run:function () {
        alert(this.name[0]+' love '+this.name[1]);
    },
    eat:function () {
        alert("I am" +this.name[0]+ "Tôi ăn rất là nhiều.")
    },
    sleep:function(){
        this.eat()
    }
};
person.eat();
person.run();
person.sleep();
alert(person.name[0]);
// var names = Array("An", "Bình", "Tuấn", "Sơn");
// alert(names);
