import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-search',
  templateUrl: './search.component.html',
  styleUrls: ['./search.component.css']
})
export class SearchComponent implements OnInit {

  news;
  search='';
  constructor( private http:HttpClient) {

   }

   getNews(){
    this.http.get<any>(`https://newsapi.org/v2/everything?q=${this.search}&apiKey=bd69e381bb38416f98dc53126dddda60`).subscribe(data =>{
      this.news =data.articles;
      },err=>{
        console.log(err);
      },()=>{
        console.log("news got successfully");
      })
   }
   ngOnInit() {
  }

}
