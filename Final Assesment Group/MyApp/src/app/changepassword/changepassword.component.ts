import { Component, OnInit } from '@angular/core';
import { AuthService } from '../auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-changepassword',
  templateUrl: './changepassword.component.html',
  styleUrls: ['./changepassword.component.css']
})
export class ChangepasswordComponent implements OnInit {

  constructor(private auth : AuthService,private router :Router) { }
  changepassword(form) {
    console.log(form.value);
    this.auth.changepasswordUser(form.value).subscribe(data => {
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
