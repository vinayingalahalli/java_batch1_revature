package com.animal.service;

import java.util.List;

import com.animal.model.Animal;

public interface AnimalService {

	public Animal createAnimal(Animal animal);
	public Animal getAnimalById(int id);
	public List<Animal> getAllAnimals();
	public Animal updateAnimal(Animal animal);
	public void deleteAnimal(int id);
}
