
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
	
	public void hoy(){}
}
