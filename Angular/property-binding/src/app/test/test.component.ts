import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  
  <img src="https://1000logos.net/wp-content/uploads/2021/05/Google-logo.png" width="300"/>
  
  <br>

  <h1>property binding</h1>
  <img [src]="image" width="200"/>
  <br>

  <h1>Interpolation</h1>
  <img src={{image}} width="300"/>

  <br>

  <br>
  <button disabled>regular button</button>
  <button disabled="{{isDisabled}}">Interpolation button</button>
  <button [disabled]= "isDisabled">property-binding button</button>




  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  isDisabled=false;
  image='https://1000logos.net/wp-content/uploads/2021/05/Google-logo.png'


  path='https://1000logos.net/wp-content/uploads/2021/05/';
  imgName='Google-logo.png'

  constructor() { }

  ngOnInit(): void {
  }

}
