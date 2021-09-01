import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  getEmployees() {
    return [
      { id: 1, name: "md", gender: "male", age: 31 },
      { id: 2, name: "uddin", gender: "male", age: 28 },
      { id: 3, name: "Rafa", gender: "female", age: 35 },
      { id: 4, name: "ema", gender: "female", age: 41 },
      { id: 5, name: "shihab", gender: "male", age: 50 },

    ]
  }


  constructor() { }
}
