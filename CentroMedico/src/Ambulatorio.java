import java.util.HashSet;

public class Ambulatorio extends Paciente {
	
	private HashSet<Tratamiento> tratamientos;
	private double estadoCuenta;

	Ambulatorio(String n, Integer hC, Fecha nac) {
		super(n, hC, nac);
		this.tratamientos = new HashSet<Tratamiento>();
	}
	@Override
	public String toString() {
		return super.toString()+"; Tipo: Ambulatorio"+ "- Ttos: "+tratamientos.toString();
	}
	
	@Override
	public void nuevoTratamiento( String nomTratamiento, Integer matricula, double honorario) {
		estadoCuenta = estadoCuenta + honorario;
		tratamientos.add(new Tratamiento(matricula,nomTratamiento));
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

}
