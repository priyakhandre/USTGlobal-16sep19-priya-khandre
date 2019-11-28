import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-sources',
  templateUrl: './sources.component.html',
  styleUrls: ['./sources.component.css']
})
export class SourcesComponent implements OnInit {
  news;
  value=`abc-news`;
  constructor(private http:HttpClient) {
    this.getNews(this.value);
   }
  getNews(value){
    this.http.get<any>(`https://newsapi.org/v2/top-headlines?sources=${value}&apiKey=bd69e381bb38416f98dc53126dddda60`).subscribe(data =>{
    this.news =data.articles;
    },err=>{
      console.log(err);
    },()=>{
      console.log("news got successfully");
    })
  



}  ngOnInit() {
  }

}
