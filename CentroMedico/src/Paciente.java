import java.util.HashMap;

public abstract class Paciente {
	String nombre;
	Integer historiaClinica;
	Fecha nac;

	Paciente (String n, Integer hC, Fecha nac){
		this.nombre = n;
		this.historiaClinica = hC;
		this.nac = nac;
	}
	@Override
	public String toString() {
		return "Paciente hC: "+this.historiaClinica+ "- "+this.nombre+"- F.Nac: "+this.nac;
	}
	public abstract double getSaldo();
	public abstract void pagarSaldo(Integer hC);
	public void nuevaInternacion(String area, Fecha dia, double precioInternacion) {
		// TODO Auto-generated method stub
	}
	public Integer getHC() {
		return this.historiaClinica;
	}
	public boolean estaInternado() {
		// TODO Auto-generated method stub
		
		
		return false;
	}
	public void  altaInternacion(Fecha fechaAlta) {
		// TODO Auto-generated method stub		
		}
	public void nuevoTratamiento(String atencion, int matricula) {
		// TODO Auto-generated method stub
		
	}
	
	public void nuevoGuardia(Fecha fecha) {
		// TODO Auto-generated method stub
		
	}
	public void getInternaciones() {
		// TODO Auto-generated method stub
		
	}
	public HashMap<Fecha, String> atCE() {
		// TODO Auto-generated method stub
		return null;
	}
	public void getCE() {
		// TODO Auto-generated method stub
		
	}
	public void nuevoConsExterno(Integer matricula, Fecha dia, String especialidad, double precio) {
		// TODO Auto-generated method st
	}
	
		}
	


