

public class ConsExterno  {
	
	private int matricula;
	private Fecha fecha;
	private String especialidad;
	
	ConsExterno(int matricula,Fecha fecha, String esp){
		this.fecha=fecha;
		this.matricula=matricula;
		this.especialidad = esp;
	}
	
	public Fecha getFecha() {
		return this.fecha;
	}

	public String getEspecialidad() {
		return this.especialidad;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
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
		ConsExterno other = (ConsExterno) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		return true;
	}

	
	
}
