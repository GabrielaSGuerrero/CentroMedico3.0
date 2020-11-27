
public class Tratamiento {
	
	Integer matricula;
	String nombreTto;
	
	Tratamiento (Integer mat, String nomTto){ //Constructor
		this.nombreTto = nomTto;
		this.matricula= mat;
	}
	@Override
	public String toString() {
		return "Tratamiento [Nombre" + this.nombreTto + ", Medico matricula: "+ this.matricula+ "]";
	}

	

}
