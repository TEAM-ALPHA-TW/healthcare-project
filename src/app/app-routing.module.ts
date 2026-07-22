import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { LoginComponent } from './pages/login/login.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { PatientRecordsComponent } from './pages/patient-records/patient-records.component';
import { ClinicalTrailmatcherComponent } from './pages/clinical-trailmatcher/clinical-trailmatcher.component';
import { PatientEligibilityComponent } from './pages/patient-eligibility/patient-eligibility.component';
import { EligibilityLetterComponent } from './pages/eligibility-letter/eligibility-letter.component'
const routes: Routes = [
  { path: '', component: LoginComponent },
  { path: 'dashboard', component: DashboardComponent },
  { path:'patient-records',component:PatientRecordsComponent},
  { path:'clinical-trail',component:ClinicalTrailmatcherComponent},
  { path:'patient-eligibility',component:PatientEligibilityComponent},
  { path:'eligibility-letter',component:EligibilityLetterComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }