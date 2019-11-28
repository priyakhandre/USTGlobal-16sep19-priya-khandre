import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { MobileParentComponent } from './mobile-parent/mobile-parent.component';
import { MobileChildComponent } from './mobile-child/mobile-child.component';
import { RouterModule } from '@angular/router';
import { BikeParentComponent } from './bike-parent/bike-parent.component';
import { BikeChildComponent } from './bike-child/bike-child.component';
import { MoviesParentComponent } from './movies-parent/movies-parent.component';
import { MoviesChildComponent } from './movies-child/movies-child.component';
import { LaptopParentComponent } from './laptop-parent/laptop-parent.component';
import { LaptopChildComponent } from './laptop-child/laptop-child.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { from } from 'rxjs';
import { HomeComponent } from './home/home.component';
import { CountriesComponent } from './countries/countries.component';
import { CategoriesComponent } from './categories/categories.component';
import { SearchComponent } from './search/search.component';
import { SourcesComponent } from './sources/sources.component';
import { compileBaseDefFromMetadata } from '@angular/compiler';
@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    MobileParentComponent,
    MobileChildComponent,
    BikeParentComponent,
    BikeChildComponent,
    MoviesParentComponent,
    MoviesChildComponent,
    LaptopParentComponent,
    LaptopChildComponent,
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
    HttpClientModule,
    RouterModule.forRoot([
      {path:'mobile-parent', component:MobileParentComponent},
      {path:'bike-parent',component:BikeParentComponent},
      {path:'movies-parent',component:MoviesParentComponent},
      {path:'laptop-parent', component:LaptopParentComponent},
      {path:'comment-details',component:CommentDetailsComponent},
      {path: 'home', component:HomeComponent},
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
