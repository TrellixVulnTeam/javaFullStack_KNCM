
// // code without Data Injector

// class Tire{

// }
// class Engine{

// }

// class Car{

// engine: Engine='';
// tire: Tire='';

// constructor(){
//     this.engine=new Engine();
//     this.tire=new Tire();
// }

// }




// code with Data Injector

class Tire {

    constructor(tire: string) {

    }
}
class Engine {
    constructor(engine: string) {

    }
}

// let engine=new Engine();
// let tire=new Tire();

class Car {

    engine: Engine = '';
    tire: Tire = '';

    constructor(engine: Engine,tire:Tire) {
        this.engine = engine;
        this.tire = tire;
    }

}



