import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UserformsComponent } from './userforms.component';

describe('UserformsComponent', () => {
  let component: UserformsComponent;
  let fixture: ComponentFixture<UserformsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UserformsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UserformsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
