package com.cellphones.apirest.models;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CELLPHONES")
public class Cellphone implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long idCellphone;
	
	// Nome modelo celular
	private String nmCellphone;
	
	// Valor do celular
	private BigDecimal vlCellphone;

	public long getIdCellphone() {
		return idCellphone;
	}

	public void setIdCellphone(long idCellphone) {
		this.idCellphone = idCellphone;
	}

	public String getNmCellphone() {
		return nmCellphone;
	}

	public void setNmCellphone(String nmCellphone) {
		this.nmCellphone = nmCellphone;
	}

	public BigDecimal getVlCellphone() {
		return vlCellphone;
	}

	public void setVlCellphone(BigDecimal vlCellphone) {
		this.vlCellphone = vlCellphone;
	}
	
}
