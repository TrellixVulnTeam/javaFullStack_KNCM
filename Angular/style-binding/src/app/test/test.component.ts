import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  //templateUrl: './test.component.html',
  template: `
  
  <h1 style="color: red">heading</h1>
  <h1 [style.color]="hasError? 'red':'green'">some new heading</h1>
  <h1 [style.color]="specialColor">Some other heading</h1>
  <h1 [ngStyle]="customStyle">Custom heading</h1>



  `,
  styles: [`
  `]
  //styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {


  hasError = false
  specialColor = '#999999'
  customStyle = {
    color: 'blue',
    fontStyle: 'italic'
  }



  constructor() { }

  ngOnInit(): void {
  }

}
