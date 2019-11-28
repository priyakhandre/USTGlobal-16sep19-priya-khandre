import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-categories',
  templateUrl: './categories.component.html',
  styleUrls: ['./categories.component.css']
})
export class CategoriesComponent implements OnInit {

  news;
  value=`general`;
  constructor(private http:HttpClient) {
    this.getNews(this.value);
   }
  getNews(value){
    this.http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=${value}&apiKey=bd69e381bb38416f98dc53126dddda60`).subscribe(data =>{
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
