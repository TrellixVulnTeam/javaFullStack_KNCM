import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InterpolatioAppComponent } from './interpolatio-app.component';

describe('InterpolatioAppComponent', () => {
  let component: InterpolatioAppComponent;
  let fixture: ComponentFixture<InterpolatioAppComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InterpolatioAppComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InterpolatioAppComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
