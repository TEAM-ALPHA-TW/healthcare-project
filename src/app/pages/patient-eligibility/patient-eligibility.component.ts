import { Component } from '@angular/core';

@Component({
  selector: 'app-patient-eligibility',
  templateUrl: './patient-eligibility.component.html',
  styleUrls: ['./patient-eligibility.component.css']
})
export class PatientEligibilityComponent {

  patientId: string = '';
  trialName: string = '';

  patient = {
    id: '',
    name: '',
    disease: ''
  };

  isEligible: boolean = false;

  checkEligibility(): void {

    if (this.patientId.trim() === '') {
      alert("Please Enter Patient ID");
      return;
    }

    if (this.trialName.trim() === '') {
      alert("Please Enter Clinical Trial Name");
      return;
    }

    if (
      this.patientId.trim().toUpperCase() === "P001" &&
      this.trialName.trim().toLowerCase() === "diabetes research trial"
    ) {

      this.patient = {
        id: 'P001',
        name: 'Ramesh',
        disease: 'Diabetes'
      };

      this.isEligible = true;

      alert(
        "✅ Patient is Eligible for Clinical Trial\n\n" +
        "Patient ID: " + this.patient.id +
        "\nPatient Name: " + this.patient.name +
        "\nDisease: " + this.patient.disease
      );

    } else {

      this.isEligible = false;

      this.patient = {
        id: '',
        name: '',
        disease: ''
      };

      alert("❌ Patient is Not Eligible for the Selected Clinical Trial");

    }

  }

  generateLetter(): void {

    if (!this.isEligible) {
      alert("Please check eligibility first.");
      return;
    }

    alert(
      "📄 Eligibility Letter Generated Successfully!\n\n" +
      "Patient ID : " + this.patient.id +
      "\nPatient Name : " + this.patient.name +
      "\nClinical Trial : " + this.trialName +
      "\nStatus : Eligible"
    );

  }

}