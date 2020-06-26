package com.servicio_rest_1.dto;

public class User {
	private Integer id;
	private String nombre;
	private String apaterno;
	private String amaterno;
	  
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApaterno() {
		return apaterno;
	}
	
	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}
	
	public String getAmaterno() {
		return amaterno;
	}
	
	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}
}
