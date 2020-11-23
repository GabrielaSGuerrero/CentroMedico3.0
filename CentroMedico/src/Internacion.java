
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
		this.fechaAlta= new Fecha(0,0,0);
	}
	@Override
	public String toString() {
		return "Area: "+area+"-Fecha ingreso: "+this.fecha;
	}
	public Fecha getFechaIngreso() {
		return fecha;
	}
	public Fecha getFechaAlta() {
		return fechaAlta;
	}
}
