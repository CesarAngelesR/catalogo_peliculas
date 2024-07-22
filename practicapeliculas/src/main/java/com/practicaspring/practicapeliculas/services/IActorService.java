package com.practicaspring.practicapeliculas.services;

import java.util.List;

import com.practicaspring.practicapeliculas.entities.Actor;

public interface IActorService {
	public List<Actor>findAll();
	public List<Actor>findAllById(List<Long>ids);

}
