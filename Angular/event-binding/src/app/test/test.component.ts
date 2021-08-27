import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  
  <h1>{{msg}}</h1>

  <button (click)="onButtonClick()">Click me</button>
  <input type="text" placeholder="press TAB after write" (change)="onChange()"/>

<br>
<input type="text" #myInput/><button (click)="onGetValue(myInput.value)">Get the value</button>
<hr>
<br>

<textarea #myText (keyup)="onKeyUp(myText.value)"></textarea>
<h1>{{comment.length - 120}}</h1>
  



  `,
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {

  comment='';


  msg='Hello Guest';
  constructor() { }

  ngOnInit(): void {
  }

  onButtonClick(){
    console.log("button Clicked")
    this.msg=('Hello Md')
  }

  onChange(){
    this.msg='Message changed'
  }


  onGetValue(input:any){

    console.log(input)
  }

  onKeyUp(data: any){

    this.comment=data;
  }

}
