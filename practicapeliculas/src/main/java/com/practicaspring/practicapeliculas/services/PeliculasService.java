package com.practicaspring.practicapeliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.practicaspring.practicapeliculas.dao.IPeliculasRepository;
import com.practicaspring.practicapeliculas.entities.Pelicula;

@Service
public class PeliculasService implements IPeliculasService {
	
	@Autowired
	private IPeliculasRepository peliculasRepository;

	@Override
	public void save(Pelicula pelicula) {
		peliculasRepository.save(pelicula);

	}

	@Override
	public Pelicula findById(Long id) {
		return peliculasRepository.findById(id).orElse(null);
	}

	@Override
	public List<Pelicula> findAll() {
		return (List<Pelicula>) peliculasRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		peliculasRepository.deleteById(id);

	}

	@Override
	public Page<Pelicula> findAll(Pageable pageble) {
		return peliculasRepository.findAll(pageble);
	}
	
	

}
