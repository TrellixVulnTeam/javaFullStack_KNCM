class Employee {
    public empId: number;
    public firstName: string;
    public lastName: string;
    public email: string;

    public getFullName() {
        console.log(`${this.firstName} ${this.lastName}`)
    }

}


class FullTimeEmployee extends Employee{
    public annualSalary:number;
}

class PartTimeEmployee extends Employee{
    public hourlySalary:number;
}

let fte=new FullTimeEmployee();
fte.firstName='md';
fte.lastName='uddin'


let pte=new PartTimeEmployee();
pte.firstName='shihab'
pte.lastName='mahi'


fte.getFullName();
pte.getFullName();
