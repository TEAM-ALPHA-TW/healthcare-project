import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './pages/login/login.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { PatientRecordsComponent } from './pages/patient-records/patient-records.component';
import { ClinicalTrailmatcherComponent } from './pages/clinical-trailmatcher/clinical-trailmatcher.component';
import { PatientEligibilityComponent } from './pages/patient-eligibility/patient-eligibility.component';
import { EligibilityLetterComponent } from './pages/eligibility-letter/eligibility-letter.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    DashboardComponent,
    PatientRecordsComponent,
    ClinicalTrailmatcherComponent,
    PatientEligibilityComponent,
    EligibilityLetterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
