package com.cellphones.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/api")
@Api(value="Cellphone REST API")
@CrossOrigin(origins="*")
public class CellphoneResource {
	@Autowired
	CellphoneRepository cellphoneRepository;

	@GetMapping("/cellphones")
	@ApiOperation(value = "Returns a list of all registered cellphones")
	public List<Cellphone> cellphoneList() {
		return cellphoneRepository.findAll();
	}

	@GetMapping("/cellphone/{id}")
	@ApiOperation(value = "Returns a specific cellphone")
	public Cellphone cellphoneListSpecific(@PathVariable(value="id") long id) {
		return cellphoneRepository.findById(id);
	}
	
	@PostMapping("/cellphone")
	@ApiOperation(value = "Adds cellphone")
	public Cellphone addCellphone(@RequestBody Cellphone cellphone) {
		return cellphoneRepository.save(cellphone);
	}
	
	@DeleteMapping("/cellphone")
	@ApiOperation(value = "Deletes cellphone")
	public void deleteCellphone(@RequestBody Cellphone cellphone) {
		cellphoneRepository.delete(cellphone);
	}
	
	@PutMapping("/cellphone")
	@ApiOperation(value = "Update cellphone info")
	public Cellphone updateCellphone(@RequestBody Cellphone cellphone) {
		return cellphoneRepository.save(cellphone);
	}
}
