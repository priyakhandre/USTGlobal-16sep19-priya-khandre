import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
// tslint:disable-next-line:no-inferrable-types
name: string  = 'priya';
imgUrl = 'https://cdn.pixabay.com/photo/2019/06/02/17/27/summer-4246927_960_720.jpg' ;
address: string = 'vijaynagar, moddapallya 560098';
colorName: string = 'red';
isActive: boolean = false;
colSpanValue : number = 2 ;

  constructor() {
  }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'blue';
      this.isActive = !this.isActive;
        }, 2000);
}

}
