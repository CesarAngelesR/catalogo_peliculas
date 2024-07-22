package com.practicaspring.practicapeliculas.services;

import java.io.InputStream;

import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;


public interface IArchivoService {

	public void guardar(String archivo, InputStream bytes);
	public ResponseEntity<Resource> get(String archivo);
	public void eliminar(String archivo);
	
}
