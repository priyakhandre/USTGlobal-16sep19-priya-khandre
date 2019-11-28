import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LaptopParentComponent } from './laptop-parent.component';

describe('LaptopParentComponent', () => {
  let component: LaptopParentComponent;
  let fixture: ComponentFixture<LaptopParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LaptopParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LaptopParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
