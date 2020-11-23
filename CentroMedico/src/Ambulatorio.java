import java.util.HashSet;

public class Ambulatorio extends Paciente {
	
	HashSet<Tratamiento> tratamientos;

	Ambulatorio(String n, Integer hC, Fecha nac) {
		super(n, hC, nac);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"; Tipo: Ambulatorio";
	}
	public void nuevoTratamiento( String nomTratamiento, Integer matricula) {
		
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

}
