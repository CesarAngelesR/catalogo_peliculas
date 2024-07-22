package com.practicaspring.practicapeliculas.services;

import java.util.List;

import com.practicaspring.practicapeliculas.entities.Genero;

public interface IGeneroService {
	
	public void save(Genero genero);
	public Genero findById(Long id);
	public void delete (Long id);
	public List<Genero> findAll();

}
