import java.util.HashMap;
//import java.util.Map;

public class Centro {
 
	HashMap<Integer, Paciente> pacientes; 
	HashMap<Integer, Medico> medicos;
	//HashSet<Especialidad> especialidades; //sino un conjunto de tupla de String,double para nombre y valor
	String CUIT;
	double precioInternacion;

	Centro (String CUIT, String nombre, double pInternacion){
	
	}
	
	void agregarEspecialidad(String nombre, double valor) {
		
	}
	void agregarMedico(String nombre, int matricula, String nomEspecialidad,double valorTratamiento) {
		
	}
	void agregarPacientePrivado(String nombre, int hC, Fecha nac) {
		
	}
	void agregarPacienteAmbulatorio(String nombre, int hC, Fecha nac) {
		
	}
	void agregarPacienteObraSocial(String nombre, int hC, Fecha nac, String	osocial, double p) {
		
	}
	void agregarAtencion(int hC, Fecha fecha, int matricula) { //en el caso de	atención en consultorio.
		
	}
	void agregarAtencion(int hC, Fecha fecha) { //en el caso de atención por	guardia.
		
	}
	void agregarInternacion(int hC, String area, Fecha fingreso) { //ingresa el	paciente a internación.
		
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
