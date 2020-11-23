import java.util.HashSet;

public class Privado extends Paciente {
	
	HashSet<tupla<Fecha, Guardia>> atencionesGuardia;
	HashSet<tupla<Fecha, ConsExterno>> atencionesCE;


	Privado(String n, Integer hC, Fecha nac) {
		super(n, hC, nac);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"; Tipo: Privado";
	}
	public void nuevoGuardia (Integer Matricula, Fecha dia) {
		
	}
	public void nuevoConsExterno(Integer Matricula, Fecha dia) {
		
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
