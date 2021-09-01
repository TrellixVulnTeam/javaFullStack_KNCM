import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-input-output',
  templateUrl: './input-output.component.html',
  styleUrls: ['./input-output.component.css']
})
export class InputOutputComponent implements OnInit {


  @Input()
  childData = '';

  @Output()
  childEvent = new EventEmitter();
  constructor() { }

  ngOnInit(): void {
  }
  onButtonClick(){
    this.childEvent.emit('Hi from child component')
  }

}
