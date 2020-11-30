import java.util.HashSet;

public class ObraSocial extends Paciente{

	private String obraSocial;
	private double porcentaje;
	private HashSet<Internacion> internaciones;
	private double estadoCuenta;
	
	ObraSocial(String n, int hC, Fecha nac, String OS, double p) {
		super(n, hC, nac);
		this.obraSocial = OS;
		this.porcentaje = p;
		this.internaciones = new HashSet<Internacion>();
	}
	@Override
	public String toString() {
		return super.toString()+"- O.S.: "+this.obraSocial+"- Porcentaje: "+this.porcentaje;
	}
	@Override
	public void nuevaInternacion (String area, Fecha dia, double precioDia) {
		internaciones.add(new Internacion(dia, area,precioDia));		
	}
	
	@Override
	public void altaInternacion (Fecha alta) {
		if (internaciones!= null ) {
			for (Internacion i: internaciones) {
				if (i.getFechaIngreso().esMayor(alta) && i.getFechaAlta().equals(new Fecha(0,0,0))) {
					
					i.setFechaAlta(alta);
					
					int cantDias = i.getFechaIngreso().diferenciaDias(i.getFechaAlta());
					estadoCuenta = estadoCuenta + cantDias*(i.getValor()*porcentaje);
				}
			}
		}
	}
	@Override
	public double getSaldo() {
		// TODO Auto-generated method stub
		return estadoCuenta;
	}
	@Override
	public void pagarSaldo() {
		// TODO Auto-generated method stub
		 estadoCuenta = 0 ;
	}
	@Override
	public boolean estaInternado() {
		if (internaciones != null) {
			boolean internado=false;
			for (Internacion i: internaciones) {
				internado= internado || i.getFechaAlta().equals(new Fecha(0,0,0));
			}
			return internado;
		}
		else {
			return false;
		}
	}

}
	
	

