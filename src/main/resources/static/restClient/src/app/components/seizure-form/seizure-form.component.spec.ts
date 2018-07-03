import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SeizureFormComponent } from './seizure-form.component';

describe('SeizureFormComponent', () => {
  let component: SeizureFormComponent;
  let fixture: ComponentFixture<SeizureFormComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SeizureFormComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SeizureFormComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
