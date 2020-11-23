import java.util.HashSet;

public class ObraSocial extends Paciente{

	String obraSocial;
	double porcentaje;
	//HashSet<tupla<Fecha, Internacion>> atencionesInternacion;
	HashSet<Internacion> internaciones;
	
	ObraSocial(String n, int hC, Fecha nac, String OS, double p) {
		super(n, hC, nac);
		this.obraSocial = OS;
		this.porcentaje = p;
		//this.atencionesInternacion = new HashSet<tupla<Fecha,Internacion>>();
		this.internaciones = new HashSet<Internacion>();
	}
	@Override
	public String toString() {
		return super.toString()+"; O.S.: "+this.obraSocial+"; Porcentaje: "+this.porcentaje;
	}
	public void nuevaInternacion (String area, Fecha dia) {
		//implementar verificacion de que no se repita fecha
		//tupla<Fecha,Internacion> nueva = new tupla(dia, new Internacion(dia, area));
		//atencionesInternacion.add(nueva);
	}
	
	public void altaInternacion (Fecha alta) {
		
	}
	@Override
	public double getSaldo(int hC) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void pagarSaldo(int hC) {
		// TODO Auto-generated method stub
		
	}
	public HashSet<Internacion> getInternaciones(){
		return internaciones;
	}

	
	
}
