import java.util.HashSet;

public class Privado extends Paciente {
	
	HashSet<tupla<Fecha, Guardia>> atencionesGuardia;
	HashSet<tupla<Fecha, ConsExterno>> atencionesCE;


	Privado(String n, int hC, Fecha nac) {
		super(n, hC, nac);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return super.toString()+"; Tipo: Privado";
	}
	public void nuevoGuardia (int Matricula, Fecha dia) {
		
	}
	public void nuevoConsExterno(int Matricula, Fecha dia) {
		
	}
	@Override
	public double getSaldo(int hC) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public void pagarSaldo(int hC) {
		// TODO Auto-generated method stub
		
	}


}
