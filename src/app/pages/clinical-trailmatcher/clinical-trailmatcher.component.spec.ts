import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ClinicalTrailmatcherComponent } from './clinical-trailmatcher.component';

describe('ClinicalTrailmatcherComponent', () => {
  let component: ClinicalTrailmatcherComponent;
  let fixture: ComponentFixture<ClinicalTrailmatcherComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ClinicalTrailmatcherComponent]
    });
    fixture = TestBed.createComponent(ClinicalTrailmatcherComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
