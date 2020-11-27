import java.util.ArrayList;
import java.util.HashSet;

public class Ambulatorio extends Paciente {
	
	ArrayList<Tratamiento> tratamientos;
	double estadoCuenta;

	Ambulatorio(String n, Integer hC, Fecha nac) {
		super(n, hC, nac);
		this.tratamientos = new ArrayList<Tratamiento>();
	}
	@Override
	public String toString() {
		return super.toString()+"; Tipo: Ambulatorio"+ "- Ttos: "+tratamientos.toString();
	}
	
	@Override
	public boolean nuevoTratamiento( String nomTratamiento, Integer matricula, double honorario) {
		
		estadoCuenta = estadoCuenta + honorario;
		return tratamientos.add(new Tratamiento(matricula,nomTratamiento));
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
