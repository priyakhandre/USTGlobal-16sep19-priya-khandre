import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';


import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddmoviesComponent } from './addmovies/addmovies.component';
import { LoginComponent } from './login/login.component';
import { RouterModule } from '@angular/router';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { MoviesComponent } from './movies/movies.component';



@NgModule({
  declarations: [
    AppComponent,HeaderComponent, AddmoviesComponent, LoginComponent, MoviesComponent

    
  ],
  imports: [
    BrowserModule,FormsModule,
    ReactiveFormsModule,
    HttpClientModule, RouterModule.forRoot([
      {path : 'login' , component: LoginComponent },
      {path: 'add_movies' , component : AddmoviesComponent},
    {path : 'movies', component : MoviesComponent}
      
    ])
      
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
