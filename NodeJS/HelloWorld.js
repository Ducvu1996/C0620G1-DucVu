console.log("hello world");
let myDate =function (day, month, year) {
    this.day =day;
    this.month=month;
    this.year=year;
    this.getDay =function () {
        return this.day;
    }
    this.getMonth= function () {
        return this.month;
    }
    this.getYear= function () {
        return this.year;
    }
    this.setDay =function (day) {
        this.day=day;
    }
    this.setMonth= function (month) {
        this.month=month;
    }
    this.setYear=function (year) {
        this.year=year;

    }
    this.setDate=function (day,month,year) {
        this.day=day;
        this.month=month;
        this.year=year;

    }
    this.toString =function () {
        let format=  this.getMonth()+'/'+this.getDay()+'/'+this.getYear();
        return format;
    }

};
let date = new myDate(1,12,1999);
let day= date.getDay();
let month= date.getMonth();
let year= date.getYear();
// alert(day+'/'+month+'/'+year);

date.setDay(31);
date.setMonth(12);
date.setYear(1997);
// alert(date.getDay()+'/'+date.getMonth()+'/'+date.getYear());
console.log(date.toString());
date.setDate(25,12,2020);
console.log(date.toString());
for(let i=0;i<=5;i++){
    console.log("* \n");
}