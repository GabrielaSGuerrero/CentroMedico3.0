import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Privado extends Paciente {
	
	HashSet<Guardia> atencionesGuardia;
	HashSet<ConsExterno> atencionesCE;
	double estadoCuenta;


	Privado(String n, Integer hC, Fecha nac) {
		super(n, hC, nac);
		this.atencionesGuardia= new HashSet<Guardia>();
		this.atencionesCE= new HashSet<ConsExterno>();
	}
	
	@Override
	public String toString() {
		return super.toString()+"; Tipo: Privado";
	}
	public void nuevoGuardia ( Fecha dia) {

		atencionesGuardia.add(new Guardia(dia));
	}
	@Override
	public void nuevoConsExterno(Integer matricula, Fecha dia, String especialidad, double precio) {
		
		estadoCuenta= estadoCuenta+precio;
		atencionesCE.add(new ConsExterno(matricula,dia,especialidad));
		
	}
	public HashMap<Fecha, String> atCE(){
		
 		HashMap<Fecha, String> registro = new HashMap<Fecha, String>();
 		
 		if (atencionesCE != null) {
	 		Iterator<ConsExterno> it = atencionesCE.iterator();
	 		while (it.hasNext()) {
	 			ConsExterno c = it.next();
	 			registro.put(c.getFecha(), c.getEspecialidad());
	 		}
 		}
 		return registro;
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
