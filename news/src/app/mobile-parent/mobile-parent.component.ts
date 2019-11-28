import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mobile-parent',
  templateUrl: './mobile-parent.component.html',
  styleUrls: ['./mobile-parent.component.css']
})
export class MobileParentComponent implements OnInit {
  selectedMobile;
  Mobiles =[
    {
     imgUrl :'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg',
     name :'Asus Zenfone 5',
     price:29000,
     desc :"ASUS Mobile X407UB. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System.             Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory."
    },
    {
      imgUrl :'https://cdn.pixabay.com/photo/2017/01/06/13/50/smartphone-1957740__340.jpg',
      name :'Iphone',
      price :55000,
      desc :"Iphone. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz S"
     },
     {
      imgUrl :'https://cdn.pixabay.com/photo/2016/12/09/11/33/smartphone-1894723__340.jpg',
      name :'Intex',
      price :85000,
      desc :"Iphone. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz S"
     },
     {
      imgUrl :'https://cdn.pixabay.com/photo/2015/05/12/09/13/social-media-763731__340.jpg',
      name :'Karboon',
      price :35000,
      desc :"Iphone. Processor. Intel® Core™ i3 6006U Processor, 2 GHz (3 M Cache) Operating System. Windows 10 Pro - ASUS recommends Windows 10 Pro. Memory. DDR4 2400MHz S"
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