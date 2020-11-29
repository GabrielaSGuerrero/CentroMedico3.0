
public class Especialidad {
	String nombre;
	double valor;

	Especialidad (String n, double val){ //Constructor
		this.nombre = n;
		this.valor= val;		
	}
	
	public double getValor() {
		return valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public boolean equals(Object obj) { //Se genera con "nombre" para que cuando se agregue una nueva Especialidad
										//al centro, no se repita.
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Especialidad other = (Especialidad) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return this.nombre+" - Valor: "+this.valor+"$";
	}
	

	
}