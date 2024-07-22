package com.practicaspring.practicapeliculas.services;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.practicaspring.practicapeliculas.entities.Pelicula;

public interface IPeliculasService {
	
	public void save(Pelicula pelicula);
	
	public Pelicula findById(Long id);
	
	public List<Pelicula> findAll();
	
	public Page<Pelicula> findAll(Pageable pageble);
	
	public void delete(Long id);
}
