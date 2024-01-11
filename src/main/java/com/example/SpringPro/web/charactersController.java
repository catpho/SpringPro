package com.example.SpringPro.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringPro.domain.Characters;
import com.example.SpringPro.domain.CharacterRepository;

@RestController
@RequestMapping("webapi/characters")
public class charactersController {
	
	@Autowired
	private CharacterRepository characterrepository;
	
	@GetMapping
	public Iterable<Characters> getCharacters(){
		return characterrepository.findAll();
	}
	
	@GetMapping(path = "{id}")
	public Optional<Characters> getCharacter(@PathVariable Long id){
		return characterrepository.findById(id);
	}
	
	@PostMapping
	public Characters createchar(@RequestBody Characters charDetails) {
		return characterrepository.save(charDetails);
	}
	
	@PutMapping(path = "{id}")
	public Characters updatechar(@PathVariable Long id, @RequestBody Characters charDetails) {
		return characterrepository.save(charDetails);
	}
	
	@DeleteMapping(path = "{id}")
	public void deleteCharacter(@PathVariable Long id) {
		characterrepository.deleteById(id);
	}
}




