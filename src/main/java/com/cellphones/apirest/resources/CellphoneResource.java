package com.cellphones.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cellphones.apirest.models.Cellphone;
import com.cellphones.apirest.repository.CellphoneRepository;

@RestController
@RequestMapping(value = "/api")
public class CellphoneResource {
	@Autowired
	CellphoneRepository cellphoneRepository;

	@GetMapping("/cellphones")
	public List<Cellphone> cellphoneList() {
		return cellphoneRepository.findAll();
	}

	@GetMapping("/cellphone/{id}")
	public Cellphone cellphoneListSpecific(@PathVariable(value="id") long id) {
		return cellphoneRepository.findById(id);
	}
	
	@PostMapping("/cellphone")
	public Cellphone addCellphone(@RequestBody Cellphone cellphone) {
		return cellphoneRepository.save(cellphone);
	}
	
	@DeleteMapping("/cellphone")
	public void deleteCellphone(@RequestBody Cellphone cellphone) {
		cellphoneRepository.delete(cellphone);
	}
	
	@PutMapping("/cellphone")
	public Cellphone updateCellphone(@RequestBody Cellphone cellphone) {
		return cellphoneRepository.save(cellphone);
	}
}
