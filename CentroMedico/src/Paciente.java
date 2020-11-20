
public abstract class Paciente {
	String nombre;
	int historiaClinica;
	Fecha nac;

	Paciente (String n, int hC, Fecha nac){
		this.nombre = n;
		this.historiaClinica = hC;
		this.nac = nac;
	}
	@Override
	public String toString() {
		return "Paciente hC: "+this.historiaClinica+ "; "+this.nombre+"; F.Nac:"+this.nac;
	}
	//double abstract getSaldo(int hC) {	}
	//void abstract pagarSaldo(int hC) {	}

}
