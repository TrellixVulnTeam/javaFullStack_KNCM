import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-interpolatio-app',
  template: `
  
  <h1>Interpolation Component</h1>
  <h1>Hello md</h1>
  <h1>Hello {{name }}</h1>
  <h1>Welcome {{name}}</h1>
  <h1>{{'Welcome as it is '+ name}}</h1>

  <h1>{{msg.length}}</h1>
  <h1>{{msg.toUpperCase()}}</h1>
  <h1>{{greetUser() }}</h1>

  `,
  styleUrls: ['./interpolatio-app.component.css']
})
export class InterpolatioAppComponent implements OnInit {

  name='Shihab';
  msg='This is a long message'

greetUser(){
  return 'Hi!!' + this.name;
}

  constructor() { }

  ngOnInit(): void {
  }

}
