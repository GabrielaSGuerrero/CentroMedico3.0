
public class Internacion {
	double valor;
	boolean deuda;
	//int matricula;
	Fecha fecha;
	Fecha fechaAlta;
	double costoTotal;
	String area;

	Internacion(Fecha ingreso, String area){
		this.fecha = ingreso;
		this.area = area;
		this.fechaAlta= new Fecha(0,0,0); //se crea por defecto esta fecha para evitar nullPointerExcetions en otros metodos
	}
	@Override
	public String toString() {
		return "Area: "+area+"-Fecha ingreso: "+this.fecha+"-Fecha alta: "+fechaAlta;
	}
	public Fecha getFechaIngreso() {
		return fecha;
	}
	public Fecha getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Fecha f) {
		this.fechaAlta.setCalendario(f.getDia(), f.getMes(), f.getAnio());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Internacion other = (Internacion) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}
	
}
