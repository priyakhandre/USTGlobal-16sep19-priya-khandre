import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movies',
  templateUrl: './movies.component.html',
  styleUrls: ['./movies.component.css']
})
export class MoviesComponent implements OnInit {

  selectedMovie;
  Movies = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg',
      Name : 'Adventure',
      Description : 'Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg',
      Name : ' charlie chaplin',
      Description :'Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, "The Tramp", and is considered one of the most important figures in the history of the film industry.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/04/08/16/27/spiderman-4112322__340.jpg',
      Name : 'Spider Man',
      Description :'Spider-Man is a fictional superhero created by writer-editor Stan Lee and writer-artist Steve Ditko. He first appeared in the anthology comic book Amazing Fantasy #15 in the Silver Age of Comic Books.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2018/05/08/11/36/avenger-3382834__340.jpg',
      Name : 'Avangers',
      Description :'Adrift in space with no food or water, Tony Stark sends a message to Pepper Potts as his oxygen supply starts to dwindle. Meanwhile, the remaining Avengers -- Thor, Black Widow, Captain America and Bruce Banner -- must figure out a way to bring back their vanquished allies for an epic showdown with'
    }
  ]
 

  constructor() { }

  ngOnInit() {
  }
  sendMovie(Movie) {
    this.selectedMovie = Movie;
    console.log(Movie);
  }
}
