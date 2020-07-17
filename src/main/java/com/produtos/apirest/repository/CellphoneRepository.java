package com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cellphones.apirest.models.Cellphone;

public interface CellphoneRepository extends JpaRepository<Cellphone, Long> {

}
