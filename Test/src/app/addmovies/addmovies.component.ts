import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';



@Component({
  selector: 'app-addmovies',
  templateUrl: './addmovies.component.html',
  styleUrls: ['./addmovies.component.css']
})
export class AddmoviesComponent implements OnInit {
  form = new FormGroup({
    movie : new FormControl('', [Validators.required]),
    tittle : new FormControl('', [Validators.required]),
  });
  get movie() {
    return this.form.get('movie');
  }
  get tittle(){
    return this.form.get('tittle');
e: new FormControl (' ', [Validators.required])
  }

  constructor() { }

  ngOnInit() {
  }
  loginData(form) {
    console.log(form);
  }

}
