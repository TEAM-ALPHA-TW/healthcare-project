import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  doctorName: string = "";
  email: string = "";
  password: string = "";


  constructor(private router: Router) { }

  login() {
    
    if (this.email == "" || this.password == "") {
      alert("Please enter Email and Password");
    }
    else {
      alert("Login Successful");
      localStorage.setItem('doctorName', this.doctorName);
      localStorage.setItem('doctorEmail', this.email);
      this.router.navigate(['/dashboard']);
    }

  }

}