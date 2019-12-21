import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule} from '@angular/common/http';
import { FormsModule} from '@angular/forms';
import { HomeComponent } from './home/home.component';
import { ComposemailComponent } from './composemail/composemail.component';
import { SentmailComponent } from './sentmail/sentmail.component';
import { ChangepasswordComponent } from './changepassword/changepassword.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    LoginComponent,
    RegisterComponent,
    HomeComponent,
    ComposemailComponent,
    SentmailComponent,
    ChangepasswordComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'navbar', component : NavbarComponent},
      {path : 'login', component : LoginComponent},
      {path : 'register', component :  RegisterComponent},
      {path : 'home', component :  HomeComponent},
      {path : 'home', component :  ComposemailComponent},
      {path : 'changepassword', component :  ChangepasswordComponent},
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
