import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private auth: AuthService,private router : Router) { }
  register(form) {
    console.log(form.value);
    this.auth.registerUser(form.value).subscribe(data => {
      console.log('Response of login',data);
      if(data && data.message === 'success with registration') {
        localStorage.setItem('userDetails',JSON.stringify(data));
        this.router.navigateByUrl('/login');
      }
      form.reset();
    }, err => {
      console.log(err);
    });
  }
  ngOnInit() {
  }

}
