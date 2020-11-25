

public class ConsExterno  {
	
	boolean deuda;
	int matricula;
	Fecha fecha;
	Especialidad especialidad;
	
	ConsExterno(Especialidad esp ,int matricula,Fecha fecha){
		this.fecha=fecha;
		this.matricula=matricula;
		this.especialidad=esp;
		
		
	}

	public Fecha getFecha() {
		return this.fecha;
	}
	public Especialidad getEspecialidad() {
		return this.especialidad;
	}

	public boolean isDeuda() {
		return deuda;
	}

	public void setDeuda(boolean deuda) {
		this.deuda = deuda;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	
	
}
