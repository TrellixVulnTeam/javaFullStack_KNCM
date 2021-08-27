"use strict";
//if you not using default keyword infront of class
//import {User,A,B} from './demo17Export'
exports.__esModule = true;
//if you  using default keyword infront of class
var demo17Export_1 = require("./demo17Export");
var userObj = new demo17Export_1["default"]('Md', 'M@yahoo.com');
userObj.getNameEmail();
