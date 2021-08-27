var Student = /** @class */ (function () {
    function Student() {
    }
    Object.defineProperty(Student.prototype, "id", {
        // get x(){
        //     return this._x;
        // }
        // set x(value){
        //     if(value<0){
        //         throw new Error('id can not be nagative')
        //     }
        //     this._x=value;
        // }
        // get Id(){
        //     return this.id;
        // }
        // set Id(val){
        //     if(val<0){
        //         throw new Error('can not be nagative')
        //     }
        //     this.id=val;
        // }
        get: function () {
            return this._id;
        },
        set: function (value) {
            if (value < 0)
                throw new Error('id can not be negative');
            this._id = value;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "passMark", {
        get: function () {
            return this._passMark;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Student.prototype, "name", {
        get: function () {
            return this._name;
        },
        set: function (val) {
            this._name = val;
        },
        enumerable: false,
        configurable: true
    });
    return Student;
}());
var st = new Student();
st.id = 1;
st.name = 'md';
st.passMark;
console.log("" + st.id + st.name + " " + st.passMark);
//st.x=2;
console.log(st);
//console.log(`${st.getId}`)
//console.log(`${st.x} ${st.setId}`)
