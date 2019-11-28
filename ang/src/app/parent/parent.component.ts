import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedCat;
  Cats = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/10/16/18/android-1814600__340.jpg',
      Name : 'kitty1'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/11/15/22/09/cat-1044914__340.jpg',
      Name : 'kitty2'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg',
      Name : 'kitty3'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
      Name : 'kitty4'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2013/07/12/18/39/smartphone-153650__340.png',
      Name : 'kitty4'
    }
  ]

  constructor() { }

  ngOnInit() {
  }
  sendCat(cat) {
    this.selectedCat = cat;
    console.log(cat);
  }

}
