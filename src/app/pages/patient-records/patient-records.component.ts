import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-patient-records',
  templateUrl: './patient-records.component.html',
  styleUrls: ['./patient-records.component.css']
})
export class PatientRecordsComponent implements OnInit {
  constructor(private route:ActivatedRoute){}

  patient = {
    id: '',
    name: '',
    age: '',
    gender: '',
    disease: '',
    bloodGroup: '',
    phone: ''
  };
 editMode: boolean = false;
editIndex: number = -1;
searchText: string = '';
showForm: boolean = false;
patients: any[] = [
    {
      id: 'P001',
      name: 'Ramesh',
      age: 45,
      gender: 'Male',
      disease: 'Diabetes',
      bloodGroup: 'O+',
      phone: '9876543210'
    },
    {
      id: 'P002',
      name: 'Sita',
      age: 38,
      gender: 'Female',
      disease: 'Hypertension',
      bloodGroup: 'A+',
      phone: '9123456789'
    }
  ];

ngOnInit(): void {

  const data = localStorage.getItem('patients');

  if (data) {
    this.patients = JSON.parse(data);
  }

  this.route.queryParams.subscribe(params => {
    if (params['search']) {
      this.searchText = params['search'];
    }
  });

}

 savePatient() {

  if (
    this.patient.id == '' ||
    this.patient.name == '' ||
    this.patient.age == '' ||
    this.patient.gender == '' ||
    this.patient.disease == '' ||
    this.patient.bloodGroup == '' ||
    this.patient.phone == ''
  ) {

    alert("Please fill all the fields!");

    return;

  }

  if (this.editMode) {

    this.patients[this.editIndex] = {
      ...this.patient
    };

    this.editMode = false;
    this.editIndex = -1;

    alert("Patient Updated Successfully!");

  } else {

    this.patients.push({
      ...this.patient
    });

    alert("Patient Added Successfully!");

  }

  localStorage.setItem('patients', JSON.stringify(this.patients));
  this.showForm = false;

  this.patient = {
    id: '',
    name: '',
    age: '',
    gender: '',
    disease: '',
    bloodGroup: '',
    phone: ''
  };

}

 deletepatient(index: number) {

  this.patients.splice(index, 1);

  localStorage.setItem('patients', JSON.stringify(this.patients));

  alert("Patient Deleted Successfully!");

}
editPatient(index: number) {

  alert("Edit button clicked");

  this.patient = {
    ...this.patients[index]
  };

  this.editMode = true;
  this.editIndex = index;
  this.showForm = true;

}

viewPatient(index: number) {

  const p = this.patients[index];

  alert(
    "Patient ID: " + p.id +
    "\nName: " + p.name +
    "\nAge: " + p.age +
    "\nGender: " + p.gender +
    "\nDisease: " + p.disease +
    "\nBlood Group: " + p.bloodGroup +
    "\nPhone: " + p.phone
  );

}
get filteredPatients() {
  return this.patients.filter(p =>
    p.name.toLowerCase().includes(this.searchText.toLowerCase()) ||
    p.id.toLowerCase().includes(this.searchText.toLowerCase())
  );
}

}
