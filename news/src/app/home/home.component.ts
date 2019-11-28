import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
 
   news;
   entNews;
   sptNews;

  constructor(private http:HttpClient) {
    this.getNews();
    this.getEntNews();
    this.getSptNews();
   }
   getNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&apiKey=bd69e381bb38416f98dc53126dddda60').subscribe(data =>{
    this.news =data.articles;
    },err=>{
      console.log(err);
    },()=>{
      console.log("news got successfully");
    })
  



}
   getEntNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=bd69e381bb38416f98dc53126dddda60').subscribe(data =>{
      this.entNews =data.articles;
      },err=>{
        console.log(err);
      },()=>{
        console.log("news got successfully");
      })
   }

   getSptNews(){
    this.http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=sports&apiKey=bd69e381bb38416f98dc53126dddda60').subscribe(data =>{
      this.sptNews =data.articles;
      },err=>{
        console.log(err);
      },()=>{
        console.log("news got successfully");
      })
   }

  ngOnInit() {
  }

}
