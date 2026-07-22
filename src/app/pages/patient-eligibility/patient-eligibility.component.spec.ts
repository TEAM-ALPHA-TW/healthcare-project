import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientEligibilityComponent } from './patient-eligibility.component';

describe('PatientEligibilityComponent', () => {
  let component: PatientEligibilityComponent;
  let fixture: ComponentFixture<PatientEligibilityComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PatientEligibilityComponent]
    });
    fixture = TestBed.createComponent(PatientEligibilityComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
