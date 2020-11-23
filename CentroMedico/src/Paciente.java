
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
	public abstract double getSaldo(Integer hC);
	public abstract void pagarSaldo(Integer hC);
	public void nuevaInternacion(String area, Fecha dia) {
		// TODO Auto-generated method stub
	}
	public Integer getHC() {
		return this.historiaClinica;
	}
	public boolean estaInternado() {
		// TODO Auto-generated method stub
		return false;
	}

}
