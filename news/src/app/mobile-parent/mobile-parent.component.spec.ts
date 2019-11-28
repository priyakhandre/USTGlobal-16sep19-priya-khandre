import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MobileParentComponent } from './mobile-parent.component';

describe('MobileParentComponent', () => {
  let component: MobileParentComponent;
  let fixture: ComponentFixture<MobileParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MobileParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MobileParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
