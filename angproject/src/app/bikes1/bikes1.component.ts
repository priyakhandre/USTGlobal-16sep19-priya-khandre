import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-bikes1',
  templateUrl: './bikes1.component.html',
  styleUrls: ['./bikes1.component.css']
})
export class Bikes1Component implements OnInit {
  @Input() Bike: {imgUrl : string  , Name :string};
  constructor() { }

  ngOnInit() {
  }

}
