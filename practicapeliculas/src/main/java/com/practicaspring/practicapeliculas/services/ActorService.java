package com.practicaspring.practicapeliculas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practicaspring.practicapeliculas.dao.IActorRepository;
import com.practicaspring.practicapeliculas.entities.Actor;
@Service
public class ActorService implements IActorService {
	
	@Autowired
	private IActorRepository actorReposotory;

	public List<Actor> findAll() {
		return (List<Actor>) actorReposotory.findAll();
	}

	public List<Actor> findAllById(List<Long> ids) {
		return (List<Actor>) actorReposotory.findAllById(ids);
	}

}
