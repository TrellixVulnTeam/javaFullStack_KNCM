var count;
count = 10;
count = '';
count = true;
var score = 20;
//score='';
var roll;
var a;
var b;
var c;
var d = [1, 'mahi', true, 20.25, {}];
var e = [1, 2, 1, 2];
var fullName = {
    firstName: '',
    lastName: ''
};
fullName.firstName;
var red = 0;
var green = 1;
var blue = 2;
var Color;
(function (Color) {
    Color[Color["red"] = 0] = "red";
    Color[Color["green"] = 1] = "green";
    Color[Color["blue"] = 2] = "blue";
})(Color || (Color = {}));
console.log('Color ' + Color.blue);
var Gender;
(function (Gender) {
    Gender[Gender["Male"] = 0] = "Male";
    Gender[Gender["Female"] = 1] = "Female";
})(Gender || (Gender = {}));
console.log('Gender ' + Gender.Female);
var Days;
(function (Days) {
    Days[Days["Monday"] = 1.1] = "Monday";
    Days[Days["Tuesday"] = 2.2] = "Tuesday";
    Days[Days["Wednesday"] = 3.3] = "Wednesday";
    Days[Days["Thursday"] = 4.4] = "Thursday";
    Days[Days["Friday"] = 5.5] = "Friday";
})(Days || (Days = {}));
console.log('Days ' + Days.Friday);
