class Calculator {
    x: number;
    y: number;

    // ? mark means you can either provide a value for
    //that for you can make it empty
    constructor(x: number, y?: number) {
        this.x = x;
        this.y = y;
    }
    addNum() {
        console.log(this.x + this.y)
    }

}


// let cal = new Calculator(10, 20);
// // cal.x = 10;
// // cal.y = 20;

// cal.addNumber();

let cal=new Calculator(20);

cal.y=25;


cal.addNum()