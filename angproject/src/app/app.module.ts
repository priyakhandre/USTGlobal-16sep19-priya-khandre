import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { FormsModule} from '@angular/forms';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { CarsComponent } from './cars/cars.component';
import { Car1Component } from './car1/car1.component';
import { BikesComponent } from './bikes/bikes.component';
import { Bikes1Component } from './bikes1/bikes1.component';
import { Laptops1Component } from './laptops1/laptops1.component';


import { LaptopsComponent } from './laptops/laptops.component';
import { MoviesComponent } from './movies/movies.component';
import { Movies1Component } from './movies1/movies1.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { from } from 'rxjs';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SearchComponent } from './search/search.component';
import { SourcesComponent } from './sources/sources.component';
import { compileBaseDefFromMetadata } from '@angular/compiler';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    CarsComponent,
    Car1Component,
    BikesComponent,
    Bikes1Component,
    Laptops1Component,
    LaptopsComponent,
    MoviesComponent,
    Movies1Component,
    CommentComponent,
    CommentDetailsComponent,
    HomeComponent,
    CountriesComponent,
    CategoriesComponent,
    SearchComponent,
    SourcesComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot([
    {path : 'home' , component : HomeComponent},
    {path :'car', component :CarsComponent},
    {path : 'bike', component : BikesComponent},
    {path : 'laptop' , component: LaptopsComponent},
    {path : 'movie' , component : MoviesComponent},
    {path : 'comment-details', component : CommentDetailsComponent},
    {path :'countries', component:CountriesComponent},
    {path:'categories', component:CategoriesComponent},
    {path:'search', component:SearchComponent},
    {path:'sources',component:SourcesComponent}
  ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
