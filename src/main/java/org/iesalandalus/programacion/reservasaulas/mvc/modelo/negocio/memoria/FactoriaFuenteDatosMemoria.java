package org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.memoria;

import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.IAulas;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.IFuenteDatos;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.IProfesores;
import org.iesalandalus.programacion.reservasaulas.mvc.modelo.negocio.IReservas;

public class FactoriaFuenteDatosMemoria implements IFuenteDatos{
	
	@Override
	public IAulas crearAulas() {
		return (IAulas) new Aulas();
	}
	
	@Override
	public IProfesores crearProfesores() {
		return (IProfesores) new Profesores();
	}
	
	@Override
	public IReservas crearReservas() {
		return (IReservas) new Reservas();
	}

	
}
