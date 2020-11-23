
public class Medico {
	String nombre;
	int matricula;
	double honorarios;
	Especialidad especialidad;

	Medico (String n, int mat, double hono, Especialidad especialidad){ //Constructor
		this.nombre = n;
		this.matricula= mat;
		this.honorarios= hono;
		this.especialidad= especialidad;
	}

	
	public double getHonorarios() {
		return honorarios;
	}

	public Especialidad getEspecialidad() {
		return especialidad;
	}


	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", matricula=" + matricula + ", honorarios=" + honorarios
				+ ", especialidad=" + especialidad + "]";
	}
	
	

}


		