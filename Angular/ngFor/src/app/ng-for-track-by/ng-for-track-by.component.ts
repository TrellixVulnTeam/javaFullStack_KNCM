import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-for-track-by',
  templateUrl: './ng-for-track-by.component.html',
  styleUrls: ['./ng-for-track-by.component.css']
})
export class NgForTrackByComponent implements OnInit {

  employees: any[] = [];

  constructor() {
    this.employees = [
      { id: 1, name: 'md', gender: 'male', email: 'm@gmail.com' },
      { id: 2, name: 'shihab', gender: 'male', email: 's@gmail.com' },
      { id: 3, name: 'mahi', gender: 'male', email: 'm@gmail.com' },
      { id: 4, name: 'rafa', gender: 'female', email: 'r@gmail.com' },

    ]


  }

  ngOnInit(): void {
  }
  onButtonClicked() {
    this.employees = [
      { id: 1, name: 'md', gender: 'male', email: 'm@gmail.com' },
      { id: 2, name: 'shihab', gender: 'male', email: 's@gmail.com' },
      { id: 3, name: 'mahi', gender: 'male', email: 'm@gmail.com' },
      { id: 4, name: 'rafa', gender: 'female', email: 'r@gmail.com' },
      { id: 5, name: 'rafa', gender: 'female', email: 'r@gmail.com' }

    ]
  }

  trackById(empl: any){

    return empl.id;
  }

}
