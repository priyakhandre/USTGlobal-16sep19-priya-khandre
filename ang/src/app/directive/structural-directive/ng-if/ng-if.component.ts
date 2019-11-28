import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if',
  templateUrl: './ng-if.component.html',
  styleUrls: ['./ng-if.component.css']
})
export class NgIfComponent implements OnInit {
  showOrHide : boolean = false;
  
  
  constructor() { 
    setTimeout (() => {
      this.showOrHide = true ;
    } ,2000);
  }

  ngOnInit() {
  }

}
