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
		return super.toString()+"- O.S.: "+this.obraSocial+"- Porcentaje: "+this.porcentaje;
	}
	@Override
	public void nuevaInternacion (String area, Fecha dia) {
		boolean existe= false;
		for(Internacion i: internaciones) {
			existe = existe || i.getFechaIngreso().equals(dia); 
		}
		if (existe == false) {
			internaciones.add(new Internacion(dia, area));
		}
		else {
			System.out.println("Ya existe una internación con esa fecha");
		}
		//tupla<Fecha,Internacion> nueva = new tupla(dia, new Internacion(dia, area));
		//atencionesInternacion.add(nueva);
		
	}
	
	public void altaInternacion (Fecha alta) {
		
	}
	@Override
	public double getSaldo(Integer hC) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void pagarSaldo(Integer hC) {
		// TODO Auto-generated method stub
		
	}
	public HashSet<Internacion> getInternaciones(){
		return internaciones;
	}

	
	
}
