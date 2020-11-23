import java.util.HashMap;
import java.util.HashSet;
//import java.util.Map;

public class Centro {
 
	HashMap<Integer, Paciente> pacientes; //No deja usar INT!! HAY Q CAMBIAR A INTEGER H.CLINICA DE PACIENTE
	HashMap<Integer, Medico> medicos;        //iDEM
	HashSet<Especialidad> especialidades; //sino un conjunto de tupla de String,double para nombre y valor
	String CUIT;
	String nombre;
	double precioInternacion;

	Centro (String CUIT, String nombre, double pInternacion){
		this.CUIT = CUIT;
		this.nombre = nombre;
		this.precioInternacion = pInternacion;
		this.pacientes = new HashMap<Integer, Paciente>();
		this.medicos = new HashMap<Integer, Medico>();
	}
	@Override
	public String toString() { //STRINGBUILDER!!!
		return "----------"+this.nombre+"---------"+"CUIT: "+this.CUIT+"Profesionales: "+medicos.toString()+"Especialidades que ofrece el Centro: "
				+"Pacientes del Centro:"+pacientes.toString()+"Precio de internaci�n por d�a: "+this.precioInternacion+"$";
	}
	
	void agregarEspecialidad(String nombre, double valor) {
		
	}
	void agregarMedico(String nombre, Integer matricula, String nomEspecialidad,double valorTratamiento) {
		medicos.put(matricula, new Medico(nombre, matricula,valorTratamiento,nomEspecialidad));
	}//asegurada la no repeticion porque .put lo garantiza dado que matricula es key
	
	void agregarPacientePrivado(String nombre, Integer hC, Fecha nac) {
		pacientes.put(hC, new Privado(nombre, hC, nac));
	}
	
	void agregarPacienteAmbulatorio(String nombre, Integer hC, Fecha nac) {
		pacientes.put(hC, new Ambulatorio(nombre, hC, nac));
	}
	void agregarPacienteObraSocial(String nombre, Integer hC, Fecha nac, String	osocial, double p) {
		pacientes.put(hC, new ObraSocial(nombre, hC, nac,osocial,p));
	}
	void agregarAtencion(int hC, Fecha fecha, int matricula) { //en el caso de	atenci�n en consultorio.
		
	}
	void agregarAtencion(int hC, Fecha fecha) { //en el caso de atenci�n por	guardia.
		
	}
	void agregarInternacion(int hC, String area, Fecha fingreso) { //ingresa el	paciente a internaci�n.
		
	}
	void altaInternacion(int hC, Fecha fechaAlta) {// da de alta al pacienteinternado.
		
	}
	void agregarTratamiento(int hC, int matricula, String atencion) {
		
	}
	double getSaldo(int hC) {
		return 0;
	}
	void pagarSaldo(int hC) {
		
	}
//	Map<Fecha, String> atencionesEnConsultorio(int hC){}
//	public List<Integer> listaInternacion(){}

}
