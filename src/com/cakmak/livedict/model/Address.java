package com.cakmak.livedict.model;

public class Address {

	private Integer postaCode;
	private String mahalle;
	private String sokak;
	private String cadde;
	private String apartmanName;

	public String getSokak() {
		return sokak;
	}

	public void setSokak(String sokak) {
		this.sokak = sokak;
	}

	public String getCadde() {
		return cadde;
	}

	public void setCadde(String cadde) {
		this.cadde = cadde;
	}

	public String getApartmanName() {
		return apartmanName;
	}

	public void setApartmanName(String apartmanName) {
		this.apartmanName = apartmanName;
	}

	public Integer getPostaCode() {
		return this.postaCode;
	}

	public void setPostaCode(Integer postaCode) {
		this.postaCode = postaCode;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}
}
