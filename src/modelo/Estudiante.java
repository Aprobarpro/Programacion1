package modelo;

import java.util.Date;

public class Estudiante extends Persona {
	private int grupo;
	private String FechaIngreso;

	public Estudiante(String nif, String nombre, char sexo, Date fecha, int grupo, String FechaIngreso) {
		super(nif, nombre, sexo, fecha);
		this.grupo = grupo;
	    this.FechaIngreso = FechaIngreso;
	}

	public String getFechaIngreso() {
		return FechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

	public int getGrupo() {
		return grupo;
	}

	public void setGrupo(int grupo) {
		this.grupo = grupo;
	}

}
