package org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio;


public interface IFuenteDatos {
	
	IAulas crearAulas();
	
	IProfesores crearProfesores();
	
	IReservas crearReservas();

}
