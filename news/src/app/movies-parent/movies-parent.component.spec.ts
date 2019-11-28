import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MoviesParentComponent } from './movies-parent.component';

describe('MoviesParentComponent', () => {
  let component: MoviesParentComponent;
  let fixture: ComponentFixture<MoviesParentComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MoviesParentComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MoviesParentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
