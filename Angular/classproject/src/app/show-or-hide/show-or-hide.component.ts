import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-show-or-hide',
  templateUrl: './show-or-hide.component.html',
  styleUrls: ['./show-or-hide.component.css']
})
export class ShowOrHideComponent implements OnInit {

  isDisable = true;
  employees = [
    { id: 1, name: 'md', email: 'm@yahoo.com' },
    { id: 2, name: 'uddin', email: 'u@yahoo.com' },
    { id: 3, name: 'shihab', email: 's@yahoo.com' },
    { id: 4, name: 'rafa', email: 'r@yahoo.com' }

  ]

  constructor() { }

  ngOnInit(): void {
  }
  onButtonClicked() {
    if (this.isDisable) {
      this.isDisable = false;
    } else {
      this.isDisable = true;
    }
  }

}
