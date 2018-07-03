import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {AlertModule} from 'ngx-bootstrap';
import {FormsModule} from '@angular/forms';


import { AppComponent } from './app.component';
import { ListSeizuresComponent } from './components/list-seizures/list-seizures.component';
import { SeizureFormComponent } from './components/seizure-form/seizure-form.component';
import { SeizureService} from './shared_service/seizure.service';
import {HttpModule} from '@angular/http';


const appRoutes:Routes=[
  {path:'', component: ListSeizuresComponent},
  {path:'op', component: SeizureFormComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    ListSeizuresComponent,
    SeizureFormComponent
  ],
  imports: [
    AlertModule.forRoot(),
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [SeizureService],
  bootstrap: [AppComponent]
})
export class AppModule { }
