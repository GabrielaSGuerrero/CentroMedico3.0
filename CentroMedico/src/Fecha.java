
public class Fecha {
	int dia;
	int mes;
	int anio;

	Fecha(int dd, int mm, int aa){
		this.dia = dd;
		this.mes = mm;
		this.anio = aa;
	}
	@Override
	public String toString() {
		return this.dia+"/"+this.mes+"/"+this.anio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Fecha other = (Fecha) obj;
		if (anio != other.anio)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}
	
	//public void hoy(){}
	
	
		
}
