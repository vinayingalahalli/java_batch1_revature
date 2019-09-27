import { Component, OnInit } from '@angular/core';
import { AnimalService } from '../animal.service';
import { Animal } from '../animal';

@Component({
  selector: 'app-animal-list',
  templateUrl: './animal-list.component.html',
  styleUrls: ['./animal-list.component.css']
})
export class AnimalListComponent implements OnInit {

  animals:Animal[];
  constructor(private animalService:AnimalService) { }

  ngOnInit() {
    this.animalService.getAllAnimals().subscribe(data=>{
      this.animals=data;
    });
  }

}
