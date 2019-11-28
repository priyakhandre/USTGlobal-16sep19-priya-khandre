import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-laptops1',
  templateUrl: './laptops1.component.html',
  styleUrls: ['./laptops1.component.css']
})
export class Laptops1Component implements OnInit {
  @Input() Laptop : {imgUrl : string  , Name :string};

  constructor() { }

  ngOnInit() {
  }

}
