
public class Tratamiento {
	
	int matricula;
	String nombreTto;
	boolean deuda;
	
	Tratamiento (int mat, String nomTto){ //Constructor
		this.nombreTto = nomTto;
		this.matricula= mat;
	
	}
	@Override
	public String toString() { //NO DEBERIA IR SOLO EL NOMBRE Y LA MATRICULA?
		return "Tratamiento [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public boolean isDeuda() {
		return deuda;
	}
	public void setDeuda(boolean deuda) {
		this.deuda = deuda;
	}

}
