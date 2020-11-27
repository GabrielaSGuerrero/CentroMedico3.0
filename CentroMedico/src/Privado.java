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
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return super.toString()+"; Tipo: Privado";
	}
	public void nuevoGuardia ( Fecha dia) {
/*		boolean existe= false;
		for(Guardia i: atencionesGuardia) {
			existe = existe || i.getFecha().equals(dia); 
		}
		if (existe == false) {
			atencionesGuardia.add(new Guardia(dia));
		}
		else {
			//Run Throw new Exception ("Ya existe una internacion con esa fecha");
			System.out.println("Ya existe una internacion con esa fecha");
		}	*/
		atencionesGuardia.add(new Guardia(dia));
	}
	
	public void nuevoConsExterno(Integer matricula, Fecha dia, String especialidad, double precio) {
	/*	boolean existe= false;
		for(ConsExterno i: atencionesCE) {
			existe = existe || i.getFecha().equals(dia); 
		}
		if (existe == false) {
			atencionesCE.add(new ConsExterno(esp,matricula,dia));
		}
		else {
			//Run Throw new Exception ("Ya existe una internacion con esa fecha");
			System.out.println("Ya existe una internacion con esa fecha");
		}	*/
		atencionesCE.add(new ConsExterno(matricula,dia,especialidad));
		estadoCuenta= estadoCuenta+precio;
	}
	public HashMap<Fecha, String> atCE(){  ///VER TEMA CASTEO...PORQUE?
 		HashMap<Fecha, String> registro = new HashMap<Fecha, String>();
 		if (atencionesCE != null) {
	 		Iterator<ConsExterno> it = atencionesCE.iterator();
	 		while (it.hasNext()) {
	 			registro.put(((ConsExterno) it).getFecha(), ((ConsExterno) it).getEspecialidad());
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
	public void pagarSaldo(Integer hC) {
		// TODO Auto-generated method stub
		
	}


}
