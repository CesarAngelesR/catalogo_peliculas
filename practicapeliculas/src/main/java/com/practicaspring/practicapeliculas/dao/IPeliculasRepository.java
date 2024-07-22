package com.practicaspring.practicapeliculas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practicaspring.practicapeliculas.entities.Pelicula;

public interface IPeliculasRepository extends JpaRepository<Pelicula, Long>{

}
