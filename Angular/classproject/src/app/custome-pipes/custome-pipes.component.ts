import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-custome-pipes',
  templateUrl: './custome-pipes.component.html',
  styleUrls: ['./custome-pipes.component.css']
})
export class CustomePipesComponent implements OnInit {

employees=[

  {id: 1,name: 'md',gender:'male',salary:2000, dob:'01/01/1990'},
  
  {id: 2,name: 'uddin',gender:'male',salary:2500, dob:'09/04/1990'},
  
  {id: 3,name: 'shihab',gender:'male',salary:8500, dob:'03/09/1997'},
  
  {id: 4,name: 'ema',gender:'female',salary:9000, dob:'08/01/1995'},
  
  {id: 5,name: 'rafa',gender:'female',salary:6200, dob:'11/11/2020'},
]


  constructor() { }

  ngOnInit(): void {
  }

}
