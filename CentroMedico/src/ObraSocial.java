import java.util.HashSet;

public class ObraSocial extends Paciente{

	String obraSocial;
	double porcentaje;
	HashSet<Internacion> internaciones;
	double estadoCuenta;
	
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
	public void nuevaInternacion (String area, Fecha dia, double precioDia) {
	/*------OPCION 1-------------------
	 * boolean existe= false;
		for(Internacion i: internaciones) {
			existe = existe || i.getFechaIngreso().equals(dia); 
		}
		if (existe == false) {
			internaciones.add(new Internacion(dia, area));
		}
		else {
			//Run Throw new Exception ("Ya existe una internacion con esa fecha");
			System.out.println("Ya existe una internacion con esa fecha");
		}
		*/
/*    -----OPCION 2------ :D
		PORQUE el metodo "add" de HashSet, agrega SOLO SI NO EXISTE un objeto igual, eso lo hace llamando
		al equals de Internacion (en este caso). Como ya hice que el Equals pregunte por la fecha, si hay
		una internacion con la misma fecha no se agregará en nuestro conjunto.    */

		internaciones.add(new Internacion(dia, area,precioDia));		
	}
	
	@Override
	public void altaInternacion (Fecha alta) {
		if (internaciones!= null ) {
			for (Internacion i: internaciones) {
				if (i.getFechaIngreso().esMayor(alta) && i.getFechaAlta().equals(new Fecha(0,0,0))) {
					i.setFechaAlta(alta);
					int cantDias = i.getFechaIngreso().diferenciaDias(i.getFechaAlta());
					estadoCuenta = estadoCuenta + cantDias*(i.getValor()*porcentaje/100);
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
		estadoCuenta = 0;
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
		return false;}
	}
	
	public void getInternaciones() {
		System.out.println(internaciones.toString());
		}
		
	}
	
	

