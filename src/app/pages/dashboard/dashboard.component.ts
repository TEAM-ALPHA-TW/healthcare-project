import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  doctorName: string = "";
  doctorEmail: string = "";
  today: string = "";
  searchText: string = '';

  constructor(private router: Router) {}

  ngOnInit(): void {
    this.doctorName = localStorage.getItem('doctorName') || "Doctor";
    this.doctorEmail = localStorage.getItem('doctorEmail') || "doctor@gmail.com";
    this.today = new Date().toLocaleDateString();
  }

  logout(): void {
    localStorage.removeItem('doctorName');
    this.router.navigate(['/']);
  }
searchPatient(): void {

  if (this.searchText.trim() === '') {
    alert("Please enter Patient ID or Name");
    return;
  }

  this.router.navigate(['/patient-records'], {
    queryParams: {
      search: this.searchText
    }
  });

}
}