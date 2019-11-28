import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobileChildComponent } from './mobile-child.component';

describe('MobileChildComponent', () => {
  let component: MobileChildComponent;
  let fixture: ComponentFixture<MobileChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobileChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobileChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
