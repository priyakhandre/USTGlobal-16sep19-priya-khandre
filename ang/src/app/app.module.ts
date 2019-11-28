import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
 
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { HelpComponent } from './header/help.component';
import { HomeComponent } from './header/home.component';
import { AboutComponent } from './header/about.component';

import { DataBindingsComponent } from './data-bindings/data-bindings.component';
import { PropertyBindingComponent } from './data-bindings/property-binding/property-binding.component';
import { FooterComponent } from './footer/footer.component';
import { EventBindingComponent } from './data-binding/property-binding/event-binding/event-binding.component';
import { TwoWayDataBindingComponent } from './data-binding/two-way-data-binding/two-way-data-binding.component';
import { DirectiveComponent } from './directive/directive.component';
import { StructuralDirectiveComponent } from './directive/structural-directive/structural-directive.component';
import { NgIfComponent } from './directive/structural-directive/ng-if/ng-if.component';
import { NgSwitchComponent } from './directive/structural-directive/ng-switch/ng-switch.component';
import { CustomerDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { FormsComponent } from './forms/forms.component';
import { Form1Component } from './forms/form1/form1.component';
import { UserformsComponent } from './forms/userforms/userforms.component';
import { ProductFormComponent } from './product-form/product-form.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { DollarPipe } from './dollar.pipe';

@NgModule({
  declarations: [
    AppComponent , HeaderComponent, HomeComponent ,
    AboutComponent,HelpComponent,FooterComponent,PropertyBindingComponent,DataBindingsComponent,EventBindingComponent,TwoWayDataBindingComponent,DirectiveComponent,StructuralDirectiveComponent,NgIfComponent, NgSwitchComponent,
    CustomerDirective,
    RegisterComponent,
    FormsComponent,
    Form1Component,
    UserformsComponent,
    ProductFormComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent,
    DollarPipe
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : '' , component : HomeComponent },
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent } ,
      {path : 'property-binding', component : PropertyBindingComponent},
      {path: 'event-binding', component : EventBindingComponent},
      {path : 'two-way' , component : TwoWayDataBindingComponent},
      {path : 'ng-if' , component : NgIfComponent},
      {path : 'ng-switch', component : NgSwitchComponent},
      {path : 'register', component: RegisterComponent},
      {path : 'forms', component : FormsComponent},
      {path : 'form1' , component : Form1Component},
      {path :'user', component : UserformsComponent},
      {path :'product', component :ProductFormComponent},
      {path : 'reactive', component : ReactiveFormComponent},
      {path : 'parent', component : ParentComponent}

    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
