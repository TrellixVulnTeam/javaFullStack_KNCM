var Calculator = /** @class */ (function () {
    function Calculator(x, y) {
        this.x = x;
        this.y = y;
    }
    Calculator.prototype.addNum = function () {
        console.log(this.x + this.y);
    };
    return Calculator;
}());
var cal = new Calculator(20);
cal.y = 25;
cal.addNum();
