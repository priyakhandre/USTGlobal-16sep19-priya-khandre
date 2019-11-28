import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-laptop-parent',
  templateUrl: './laptop-parent.component.html',
  styleUrls: ['./laptop-parent.component.css']
})
export class LaptopParentComponent implements OnInit {
  selectedMobile;
  Mobiles =[
    {
     imgUrl :'https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg',
     name :'Asus Rog-Gaming',
     price:"Rs-53000",
     desc :"ASUS rog X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System.             Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory."
    },
    {
      imgUrl :'https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg',
      name :'Hp- Pavillion',
      price :"Rs-68900",
      desc :"Hp -pavillion. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz S"
     },
     {
      imgUrl :'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg',
      name :'Macbook',
      price :"Rs-135000",
      desc :"Macbook Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz S"
     },
     {
      imgUrl :'https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/TOSHIBA_Satellite_Pro_L850/TOSHIBA_Satellite_Pro_L850_L_1.jpg',
      name :'Toshiba',
      price :"Rs-45000",
      desc :"Toshiba. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz S"
     }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile){
    this.selectedMobile=mobile;
    console.log(mobile);
    
  }

}
 
