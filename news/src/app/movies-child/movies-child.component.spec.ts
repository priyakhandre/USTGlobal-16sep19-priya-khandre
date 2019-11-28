import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MoviesChildComponent } from './movies-child.component';

describe('MoviesChildComponent', () => {
  let component: MoviesChildComponent;
  let fixture: ComponentFixture<MoviesChildComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MoviesChildComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MoviesChildComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
