package com.practicaspring.ejemplo.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.practicaspring.ejemplos.models.Equipo;
import com.practicaspring.ejemplos.models.Jugador;

@Service
@Primary
public class EquipoInglaterraService implements IService{

	@Override
	public List<Equipo> getTodos() {
		Equipo manchesterUnited = new Equipo();
		manchesterUnited.setNombre("ManchesterUnited");
		manchesterUnited.addJugador(new Jugador("GARNACHO",1));

		
		Equipo manchesterCity = new Equipo();
		manchesterCity.setNombre("ManchesterCity");
		manchesterCity.addJugador(new Jugador("J ALVAREZ",1));
		
		return List.of(manchesterUnited, manchesterCity);
	}

}
