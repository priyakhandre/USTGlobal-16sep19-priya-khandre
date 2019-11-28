import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Car1Component } from './car1.component';

describe('Car1Component', () => {
  let component: Car1Component;
  let fixture: ComponentFixture<Car1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Car1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Car1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
