import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ComposemailComponent } from './composemail.component';

describe('ComposemailComponent', () => {
  let component: ComposemailComponent;
  let fixture: ComponentFixture<ComposemailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ComposemailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ComposemailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
