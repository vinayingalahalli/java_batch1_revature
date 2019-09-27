import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Animal } from './animal';
@Injectable({
  providedIn: 'root'
})
export class AnimalService {
  private createUrl:string;
  private getAnimalsUrl:string;
  constructor(private http:HttpClient) { 
    this.createUrl="http://localhost:2000/createAnimal";
    this.getAnimalsUrl="http://localhost:2000/animals";
  }
  public getAllAnimals():Observable<Animal[]>{
    return this.http.get<Animal[]>(this.getAnimalsUrl);
  }

  public createAnimal(animal:Animal){
    return this.http.post<Animal>(this.createUrl,animal);
  }
}
