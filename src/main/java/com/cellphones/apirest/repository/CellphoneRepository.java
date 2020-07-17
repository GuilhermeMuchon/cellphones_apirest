package com.cellphones.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cellphones.apirest.models.Cellphone;

public interface CellphoneRepository extends JpaRepository<Cellphone, Long> {
	Cellphone findById(long id);
}
