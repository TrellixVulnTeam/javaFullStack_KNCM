import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {


  names=['mahi','md','shihab','rafa']

employees=[

  {id: 1,name:'md',gender:'male',email:'m@gmail.com'},
  {id: 2,name:'shihab',gender:'male',email:'s@gmail.com'},
  {id: 3,name:'mahi',gender:'male',email:'m@gmail.com'},
  {id: 4,name:'rafa',gender:'female',email:'r@gmail.com'},
  {id: 4,name:'rafa',gender:'female',email:'r@gmail.com'}
]



  constructor() { }

  ngOnInit(): void {
  }

}
