import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListSeizuresComponent } from './list-seizures.component';

describe('ListSeizuresComponent', () => {
  let component: ListSeizuresComponent;
  let fixture: ComponentFixture<ListSeizuresComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListSeizuresComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListSeizuresComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
