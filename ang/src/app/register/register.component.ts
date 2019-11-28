import { Component, OnInit, DoCheck, AfterViewInit, AfterViewChecked, OnDestroy } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit,DoCheck, AfterViewInit ,AfterViewChecked , OnDestroy{
  users;
  selectedUser;
  today = new Date();


  constructor(public service: UserService) {
    console.log("constructor is executed");
    this.getdata();  // calling get data from datbase 
   }

  ngOnInit() {
    console.log("ngonit is executed");
  }
  ngDoCheck() {
    console.log("ngDoCheck is executed");
    
  }
  ngAfterViewInit() {
    console.log("ngafterviewinit is executed")
  }
  ngAfterViewChecked () {
    console.log("ngafterviewchecked is executed")
  }

ngOnDestroy () {
  console.log("ondestroy is executed")
}
  loginData(form: NgForm) {
    console.log (form.value);
    this.service.postUser(form.value).subscribe(data => {
      console.log(data);
    } , err => {
      console.log(err);
    }, () => {
      console.log('data hosted succesfully');
    }
    );

}
getdata() {
  this.service.getusers().subscribe(data => {
    console.log(data);
    this.users = data ;
  },err => {
    console.log(err);
  },() => {
    console.log('data got succesfully');
  })
}
deleteData(user){
  console.log(user);
  this.service.deleteUser(user.id).subscribe(data =>{
    console.log(data);
    this.getdata(); // after deleting to get data
  },err => {
    console.log(err);
  },() => {
    console.log("data deleted succesfully");
  })
}
selectUser(user) {
  this.selectedUser = user;

}
updateData(form) {
  console.log(form.value);
  this.service.updateUser(form.value.id,form.value).subscribe (data =>{
    console.log(data);
  }, err => {
    console.log(err);
  }, () => {
    console.log("data updated succesfully");
  })
}

}
