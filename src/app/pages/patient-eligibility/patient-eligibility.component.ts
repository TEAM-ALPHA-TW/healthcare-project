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

  checkEligibility() {

    if (this.patientId.trim() == '') {
      alert("Please Enter Patient ID");
      return;
    }

    if (
      this.patientId.trim().toUpperCase() == "P001" &&
      this.trialName.trim().toLowerCase() == "diabetes research trial"
    ) {

      this.patient = {
        id: 'P001',
        name: 'Ramesh',
        disease: 'Diabetes'
      };

      alert("Patient is Eligible for Clinical Trial");

    } else {

      alert("Patient Not Eligible");

    }

  }

  generateLetter() {

    if (
      this.patientId.trim().toUpperCase() == "P001" &&
      this.trialName.trim().toLowerCase() == "diabetes research trial"
    ) {

      alert(
        "Eligibility Letter Generated\n\n" +
        "Patient ID: " + this.patientId +
        "\nClinical Trial: " + this.trialName +
        "\nStatus: Eligible"
      );

    } else {

      alert("Please check eligibility first.");

    }

  }

}