import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BikeChildComponent } from './bike-child.component';

describe('BikeChildComponent', () => {
  let component: BikeChildComponent;
  let fixture: ComponentFixture<BikeChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BikeChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BikeChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
