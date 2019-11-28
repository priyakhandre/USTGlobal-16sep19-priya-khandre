import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { Laptops1Component } from './laptops1.component';

describe('Laptops1Component', () => {
  let component: Laptops1Component;
  let fixture: ComponentFixture<Laptops1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ Laptops1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(Laptops1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
