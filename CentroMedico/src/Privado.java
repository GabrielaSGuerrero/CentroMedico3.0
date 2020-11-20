import java.util.HashSet;

public class Privado extends Paciente {
	
	HashSet<tupla<Fecha, Guardia>> atencionesGuardia;
	HashSet<tupla<Fecha, ConsExterno>> atencionesCE;


	Privado(String n, int hC, Fecha nac) {
		super(n, hC, nac);
		// TODO Auto-generated constructor stub
	}
	public void nuevoGuardia (int Matricula, Fecha dia) {
		
	}
	public void nuevoConsExterno(int Matricula, Fecha dia) {
		
	}


}
