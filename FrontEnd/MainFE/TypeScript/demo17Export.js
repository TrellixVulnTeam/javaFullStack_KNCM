"use strict";
exports.__esModule = true;
exports.B = exports.A = void 0;
var User = /** @class */ (function () {
    function User(name, email) {
        this.name = name;
        this.email = email;
    }
    User.prototype.getNameEmail = function () {
        console.log(this.name + " " + this.email);
    };
    return User;
}());
exports["default"] = User;
var A = /** @class */ (function () {
    function A() {
    }
    return A;
}());
exports.A = A;
var B = /** @class */ (function () {
    function B() {
    }
    return B;
}());
exports.B = B;
var C = /** @class */ (function () {
    function C() {
    }
    return C;
}());
