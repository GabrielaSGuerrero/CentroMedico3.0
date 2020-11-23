
public class Especialidad {
	String nombre;
	int codigo;
	double valor;
	Especialidad especialidad;

	Especialidad (String n, int mat, double val){ //Constructor
		this.nombre = n;
		this.codigo= mat;
		this.valor= val;
		
		
	}
	
	public double getValor() {
		return valor;
	}

	
}