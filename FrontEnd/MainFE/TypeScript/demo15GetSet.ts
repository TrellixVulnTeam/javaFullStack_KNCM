class Student {
    private _id: number;
    private _name: string;
    private _passMark: 70;
    private _x: number;

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


    get id() {
        return this._id;
    }

    set id(value: number) {
        if (value < 0)
            throw new Error('id can not be negative')
        this._id = value;
    }

    get passMark() {
        return this._passMark;
    }
    get name() {
        return this._name;
    }
    set name(val: string) {
        this._name = val;
    }

}


let st = new Student();

st.id=1;
st.name='md';
st.passMark;

console.log(`${st.id}${st.name} ${st.passMark}`)
//st.x=2;
console.log(st)
//console.log(`${st.getId}`)

//console.log(`${st.x} ${st.setId}`)

