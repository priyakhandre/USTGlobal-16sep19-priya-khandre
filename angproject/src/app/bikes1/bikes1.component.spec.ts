import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Bikes1Component } from './bikes1.component';

describe('Bikes1Component', () => {
  let component: Bikes1Component;
  let fixture: ComponentFixture<Bikes1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Bikes1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Bikes1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
