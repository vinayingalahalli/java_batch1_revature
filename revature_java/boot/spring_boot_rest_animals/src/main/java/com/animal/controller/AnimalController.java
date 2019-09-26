package com.animal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.animal.model.Animal;
import com.animal.service.AnimalService;

@RestController
public class AnimalController {
	
	@Autowired
	private AnimalService service;
	@PostMapping("/createAnimal")
	public Animal createAnimal(@RequestBody Animal animal) {
		return service.createAnimal(animal);
	}

	@GetMapping("/animal/{id}")
	public Animal getAnimalById(@PathVariable int id) {
		return service.getAnimalById(id);
	}

	@GetMapping("/animals")
	public List<Animal> getAllAnimals() {
		return service.getAllAnimals();
	}

	@PutMapping("/updateAnimal")
	public Animal updateAnimal(@RequestBody Animal animal) {
		return service.updateAnimal(animal);
	}
	
	@DeleteMapping("/animal/{id}")
	public void deleteAnimal(@PathVariable int id) {
		service.deleteAnimal(id);
	}
	
	@GetMapping("/")
	public String welcome() {
		return "Welcome to Animal API V1.0";
	}

}
