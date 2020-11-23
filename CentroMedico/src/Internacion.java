
public class Internacion {
	double valor;
	boolean deuda;
	//int matricula;
	Fecha fecha;
	Fecha fechaAlta;
	double costoTotal;
	String area;
	int numHabitacion;

	Internacion(Fecha ingreso, String area, int numHabitacion){
		this.fecha = ingreso;
		this.area = area;
	}
	@Override
	public String toString() {
		return "Area: "+area;
	}
	
}
