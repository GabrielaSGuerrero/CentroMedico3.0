
public class Medico {
	private String nombre;
	private Integer matricula;
	private double honorarios;
	private String especialidad;

	Medico (String n, Integer mat, double hono, String especialidad){ //Constructor
		this.nombre = n;
		this.matricula= mat;
		this.honorarios= hono;
		this.especialidad= especialidad;
	}

	// GETTERS 
	public double getHonorarios() {
		return honorarios;
	}

	public String getEspecialidad() {
		return especialidad;
	}


	@Override
	public String toString() {
		return nombre + " - MN: " + matricula + " - Honorarios: " + honorarios
				+"$"+ " - Especialidad: " + especialidad;
	}
	
	

}


		