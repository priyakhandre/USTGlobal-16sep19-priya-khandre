import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LaptopChildComponent } from './laptop-child.component';

describe('LaptopChildComponent', () => {
  let component: LaptopChildComponent;
  let fixture: ComponentFixture<LaptopChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LaptopChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LaptopChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
