import java.util.HashSet;
import java.util.Iterator;

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
			//Run Throw new Exception ("Ya existe una internacion con esa fecha");
			System.out.println("Ya existe una internacion con esa fecha");
		}
/*      -----OPCION 2------ :D

		internaciones.add(new Internacion(dia, area));
		
		PORQUE el metodo "add" de HashSet, agrega SOLO SI NO EXISTE un objeto igual, eso lo hace llamando
		al equals de Internacion (en este caso). Como ya hice que el Equals pregunte por la fecha, si hay
		una internacion con la misma fecha no se agregará en nuestro conjunto.    */
	}
	@Override
	public void altaInternacion (Fecha alta) {
		if (internaciones!= null ) {
			for (Internacion i: internaciones) {
				if (i.getFechaIngreso().esMayor(alta) && i.getFechaAlta().equals(new Fecha(0,0,0))) {
					i.setFechaAlta(alta);
				}
			}
		}
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
	/*	Iterator<Internacion> it= internaciones.iterator();
		while(it.hasNext()) {
			System.out.println(it); */
		System.out.println(internaciones.toString());
		}
		
	}
	
	

