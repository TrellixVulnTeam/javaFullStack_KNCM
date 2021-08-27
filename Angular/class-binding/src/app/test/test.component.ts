import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  //templateUrl: './test.component.html',
  template: `
  <h1 class="text-success">1st line</h1>
  <h1 [class]="successClass">2nd line</h1>
<br>

<h1 [class.text-danger]="hasError">some lines</h1>


<input type="text" class="form-control" [class.is-invalid]="hasError" />

<h1 [ngClass]="customStyle">custom heading</h1>


  `,
  //styleUrls: ['./test.component.css']
  styles: [`
    
    .text-success{
      color: green
    }
    .text-danger{
      color: red
    }
    .text-special{
      font-style:italic
    }
    
    
    
    `]
})
export class TestComponent implements OnInit {

  hasError = true;
  successClass = 'text-success'
  isSpecial = true;
  constructor() { }

  ngOnInit(): void {
  }

  customStyle = {
    'text-success': !this.hasError,
    'text-danger': this.hasError,
    'text-special': this.isSpecial



  }

}
