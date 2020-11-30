import java.util.HashMap;

public abstract class Paciente {
	
	private String nombre;
	private Integer historiaClinica;
	private Fecha nac;

	Paciente (String n, Integer hC, Fecha nac){
		this.nombre = n;
		this.historiaClinica = hC;
		this.nac = nac;
	}
	@Override
	public String toString() {
		return this.nombre + "- hC: "+this.historiaClinica+"- F.Nac: "+this.nac;
	}
	public abstract double getSaldo();
	public abstract void pagarSaldo();
	public void nuevaInternacion(String area, Fecha dia, double precioInternacion) {}
	public boolean estaInternado() {
		return false;
	}
	public void  altaInternacion(Fecha fechaAlta) {}
	public void nuevoGuardia(Fecha fecha) {}
	public void getInternaciones() {}
	public HashMap<Fecha, String> atCE() {
		return null;
	}
	public void getCE() {}
	public void nuevoConsExterno(Integer matricula, Fecha dia, String especialidad, double precio) {}
	public void nuevoTratamiento( String nomTratamiento, Integer matricula, double honorario) {}
	public Integer getHC() {
		return historiaClinica;
	}
	
}
	


