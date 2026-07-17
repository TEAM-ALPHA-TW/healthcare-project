import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EligibilityLetterComponent } from './eligibility-letter.component';

describe('EligibilityLetterComponent', () => {
  let component: EligibilityLetterComponent;
  let fixture: ComponentFixture<EligibilityLetterComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [EligibilityLetterComponent]
    });
    fixture = TestBed.createComponent(EligibilityLetterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
