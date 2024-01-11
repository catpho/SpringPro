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

	import com.example.SpringPro.domain.Pairs;
	import com.example.SpringPro.domain.CharacterPairs;

	@RestController
	@RequestMapping("webapi/pairs")
	public class pairController {
		
		@Autowired
		private CharacterPairs pairrepository;
		
		@GetMapping
		public Iterable<Pairs> getAllPairs(){
			return pairrepository.findAll();
		}
		
		@GetMapping(path = "{id}")
		public Optional<Pairs> getPair(@PathVariable Long id){
			return pairrepository.findById(id);
		}
		
		@PostMapping
		public Pairs createpair(@RequestBody Pairs pairingDetails) {
			return pairrepository.save(pairingDetails);
		}
		
		@PutMapping(path = "{id}")
		public Pairs updatepair(@PathVariable Long id, @RequestBody Pairs pairingDetails) {
			return pairrepository.save(pairingDetails);
		}
		
		@DeleteMapping(path = "{id}")
		public void deletePair(@PathVariable Long id) {
			pairrepository.deleteById(id);
		}
	}


