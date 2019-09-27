import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AnimalListComponent } from './animal-list/animal-list.component';
import { CreateAnimalComponent } from './create-animal/create-animal.component';
import { Routes, RouterModule } from '@angular/router';
import {FormsModule} from '@angular/forms'
import { HttpClient,HttpClientModule } from '@angular/common/http';
const routes:Routes=[
  {path:'animals',component:AnimalListComponent},
  {path:'createAnimal',component:CreateAnimalComponent}
]
@NgModule({
  declarations: [
    AppComponent,
    AnimalListComponent,
    CreateAnimalComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(routes),
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
