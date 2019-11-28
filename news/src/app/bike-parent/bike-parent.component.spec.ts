import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { BikeParentComponent } from './bike-parent.component';

describe('BikeParentComponent', () => {
  let component: BikeParentComponent;
  let fixture: ComponentFixture<BikeParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ BikeParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(BikeParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
