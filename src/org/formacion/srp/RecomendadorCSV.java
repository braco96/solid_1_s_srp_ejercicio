package org.formacion.srp;

import java.util.List;

import java.util.stream.Collectors;
//Creando este método separamos la logica de negocio de la logica de presentacion.
public class RecomendadorCSV  {
	public String recomendacionesCSV (List<Pelicula>  peliculas) {
		
		return peliculas.stream()
		      .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
		      .collect(Collectors.joining("\n"));
	}
}
