import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipes',
  templateUrl: './pipes.component.html',
  styleUrls: ['./pipes.component.css']
})
export class PipesComponent implements OnInit {

  name = 'mahi';
  msg = "this is my angular message";
  person = {
    firstName: 'md',
    lastName: 'uddin'

  }
  currentDate=new Date;
  constructor() { }

  ngOnInit(): void {
  }

}
