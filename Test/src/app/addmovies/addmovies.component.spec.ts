import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddmoviesComponent } from './addmovies.component';

describe('AddmoviesComponent', () => {
  let component: AddmoviesComponent;
  let fixture: ComponentFixture<AddmoviesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddmoviesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddmoviesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
