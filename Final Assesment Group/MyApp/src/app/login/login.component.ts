import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private auth : AuthService,private router :Router) { }
  login(form: NgForm) {
      console.log(form.value);
      this.auth.loginUser(form.value).subscribe(data => {
        console.log('Response of login',data);
        if(data && data.message === 'Login Successful !!!!!!') {
          window.alert('Login Successful !!!!!!');
          localStorage.setItem('userDetails',JSON.stringify(data));
          this.router.navigateByUrl('/home');
        }
        form.reset();
      }, err => {
        console.log(err);
      });
    }

  ngOnInit() {
  }

}
