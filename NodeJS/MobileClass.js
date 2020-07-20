class Mobile{
    constructor(battery,name) {
        this.battery=battery;
        this.name =name;
        this.acction =0;
    }

    checkBattery() {
        return this.battery;
    }
    typingMessage() {
        let message="xin chào";
        this.battery--;
        return message;

    }
    sendMessage() {
        let message= this.typingMessage();
        this.arraySent= new Array();
        this.arraySent.push(message);
        this.battery--;
        return this.message;
    }
    sentMessage() {
        console.log(this.arraySent);
        this.battery--;
    }


};
let nokia= new Mobile(100,"nokia");
nokia.typingMessage();
nokia.sendMessage();
nokia.sentMessage();
console.log(nokia.checkBattery());