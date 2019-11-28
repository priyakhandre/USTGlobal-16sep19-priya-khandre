import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component ({
    selector : 'app-home' ,
    templateUrl : './home.component.html' ,
    styleUrls : ['./home.component.css']


})


export class HomeComponent {
  news;  
constructor( private http : HttpClient ) {   //inject http client
this.getNews();
}
getNews() {
    this.http.get<any>('https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=750a34b217fc4db48ae952a20411250c').subscribe (data =>
    {
        this.news =data.articles;
     
    }, err => {
        console.log(err);
    },() => {
        console.log('news got succesfully');
    })

}

}
