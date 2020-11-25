

public class ConsExterno {
	
	boolean deuda;
	int matricula;
	Fecha fecha;
	Especialidad especialidades;
	
	ConsExterno(Especialidad esp ,int matricula,Fecha fecha){
		this.fecha=fecha;
		this.matricula=matricula;
		this.especialidades=esp;
		
		
	}

	public Fecha getFecha() {
		return fecha;
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
