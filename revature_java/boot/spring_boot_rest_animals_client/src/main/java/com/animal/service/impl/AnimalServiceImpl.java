package com.animal.service.impl;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.animal.model.Animal;
import com.animal.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {
	
	@Override
	public Animal createAnimal(Animal animal) {
		RestTemplate  restTemplate=new RestTemplate();
		String url="http://localhost:2000/createAnimal";
		return restTemplate.postForObject(url,animal,Animal.class );
	}

	@Override
	public Animal getAnimalById(int id) {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:2000/animal/"+id;
		ResponseEntity<Animal> responseEntity=restTemplate.exchange(
				url, 
				HttpMethod.GET,  
				null, 
				Animal.class);
		return responseEntity.getBody();
	}

	@Override
	public List<Animal> getAllAnimals() {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:2000/animals";
		ResponseEntity<List<Animal>> responseEntity=restTemplate.exchange(
				url, 
				HttpMethod.GET,  
				null, 
				new ParameterizedTypeReference<List<Animal>>() {
				});
		
		return responseEntity.getBody();
	}

	@Override
	public Animal updateAnimal(Animal animal) {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:2000/updateAnimal";
		restTemplate.put(url, animal);
		return animal;
	}

	@Override
	public void deleteAnimal(int id) {
		RestTemplate restTemplate=new RestTemplate();
		String url="http://localhost:2000/animal/"+id;
		restTemplate.delete(url);
	}

}