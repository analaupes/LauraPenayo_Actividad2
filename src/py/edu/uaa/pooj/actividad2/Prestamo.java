package py.edu.uaa.pooj.actividad2;

import java.util.Date;

public class Prestamo {
	private Lector lector;
	private Ejemplar ejemplar;
	private Boolean estado;
	private Date fechaPrestamo;
	
	public void realizarPrestamo() {
		
	}
	public void consultarEstadoPrestamo()  {
		
	}
	public void librosAdeudadosLector() {
		
	}
	
	public Lector getLector() {
		return lector;
	}
	public void setLector(Lector lector) {
		this.lector = lector;
	}
	
	public Ejemplar getEjemplar() {
		return ejemplar;
	}
	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}
	
	public Boolean getEstado() {
		return estado;
	}
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}
	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

}
