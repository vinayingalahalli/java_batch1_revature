import { Component } from '@angular/core';
import { Animal } from '../animal';
import { AnimalService } from '../animal.service';
import {Router} from '@angular/router'
@Component({
  selector: 'app-create-animal',
  templateUrl: './create-animal.component.html',
  styleUrls: ['./create-animal.component.css']
})
export class CreateAnimalComponent {

  animal:Animal;

  constructor(private animalService: AnimalService,private router:Router) { 
    this.animal=new Animal();
  }

  createAnimal(){
    this.animalService.createAnimal(this.animal).subscribe(data=>this.gotoAnimalList());
  }
  gotoAnimalList(){
    this.router.navigate(['/animals']);
  }
  

}
