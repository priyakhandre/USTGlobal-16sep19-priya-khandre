import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies-parent',
  templateUrl: './movies-parent.component.html',
  styleUrls: ['./movies-parent.component.css']
})
export class MoviesParentComponent implements OnInit {
  selectedMobile;
  Mobiles =[
    {
     imgUrl :'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
     name :'Adventure',
     price:"Rating: 5/10",
     desc :"Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death."
    },
    {
      imgUrl :'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      name :'Charlie Chaplin',
      price :"Rating: 9/10",
      desc :"Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death"
     },
     {
      imgUrl :'https://cdn.pixabay.com/photo/2019/05/25/12/30/iron-man-4228269__340.jpg',
      name :'Avanger',
      price :"Rating:8.5/10",
      desc :"Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death"
     },
     {
      imgUrl :'https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842__340.jpg',
      name :'Captain America',
      price :"Rating: 10/10",
      desc :"Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death"
     }
  ]
  constructor() { }

  ngOnInit() {
  }
  sendMobile(mobile){
    console.log(mobile);
    this.selectedMobile=mobile
  }

}
