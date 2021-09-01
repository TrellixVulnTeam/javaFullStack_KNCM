import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router'

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  departments = [
    { id: 1, name: 'md' },
    { id: 2, name: 'uddin' },
    { id: 3, name: 'ema' },
    { id: 4, name: 'Rafa' }
  ]
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  onButtonClicked(department: any) {
    this.router.navigate(['/department', department.id])
  }

}
