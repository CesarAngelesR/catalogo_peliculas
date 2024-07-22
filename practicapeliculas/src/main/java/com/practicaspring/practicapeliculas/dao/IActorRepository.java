package com.practicaspring.practicapeliculas.dao;

import org.springframework.data.repository.CrudRepository;

import com.practicaspring.practicapeliculas.entities.Actor;

public interface IActorRepository extends CrudRepository <Actor, Long>{

}
