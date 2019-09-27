import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AnimalListComponent } from './animal-list.component';

describe('AnimalListComponent', () => {
  let component: AnimalListComponent;
  let fixture: ComponentFixture<AnimalListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AnimalListComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AnimalListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
