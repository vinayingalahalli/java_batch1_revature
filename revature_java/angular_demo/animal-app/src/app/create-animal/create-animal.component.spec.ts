import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CreateAnimalComponent } from './create-animal.component';

describe('CreateAnimalComponent', () => {
  let component: CreateAnimalComponent;
  let fixture: ComponentFixture<CreateAnimalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CreateAnimalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CreateAnimalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
