package com.practicaspring.ejemplo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.practicaspring.ejemplos.models.Equipo;
import com.practicaspring.ejemplos.models.Jugador;

@Service("equiposEspaña")
public class EquipoService implements IService{
	
	
	public List<Equipo> getTodos(){
		Equipo barcelona = new Equipo();
		barcelona.setNombre("Barcelona");
		barcelona.addJugador(new Jugador("TER STEGEN",1));
		barcelona.addJugador(new Jugador("ARAUJO",4));
		barcelona.addJugador(new Jugador("BUSQUET",5));
		barcelona.addJugador(new Jugador("LEWANDOSKI",9));
		barcelona.addJugador(new Jugador("DEMBLE",7));
		
		Equipo realMadrid = new Equipo();
		realMadrid.setNombre("RealMadrid");
		realMadrid.addJugador(new Jugador("COURTOIS",1));
		realMadrid.addJugador(new Jugador("CARVAJAL",9));
		realMadrid.addJugador(new Jugador("MODRIC",8));
		realMadrid.addJugador(new Jugador("BENZEMA",2));
		realMadrid.addJugador(new Jugador("DEMBELE",7));
		
		return List.of(barcelona, realMadrid);
	}

}
