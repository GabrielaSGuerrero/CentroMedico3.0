import java.util.HashMap;
import java.util.HashSet;
//import java.util.Map;
import java.util.LinkedList;

public class Centro {
 
	HashMap<Integer, Paciente> pacientes; //No deja usar INT!! HAY Q CAMBIAR A INTEGER H.CLINICA DE PACIENTE
	HashMap<Integer, Medico> medicos;        //iDEM
	HashSet<Especialidad> especialidades; //sino un conjunto de tupla de String,double para nombre y valor
	String CUIT;
	String nombre;
	double precioInternacion;

	Centro ( String nombre, String CUIT, double pInternacion){
		this.CUIT = CUIT;
		this.nombre = nombre;
		this.precioInternacion = pInternacion;
		this.pacientes = new HashMap<Integer, Paciente>();
		this.medicos = new HashMap<Integer, Medico>();
		this.especialidades = new HashSet<Especialidad> ();
	}
	@Override
	public String toString() { //STRINGBUILDER!!!
		return "----------"+this.nombre+"---------"+"\nCUIT: "+this.CUIT+"\nProfesionales: "+medicos.toString()+"\nEspecialidades que ofrece el Centro: "
				+"\nPacientes del Centro:"+pacientes.toString()+"\nPrecio de internacion por dia: "+this.precioInternacion+"$";
	}
	
	void agregarEspecialidad(String nombre, double valor) {	
			 especialidades.add(new Especialidad(nombre,valor));
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
	void agregarAtencion(Integer hC, Fecha fecha, int matricula) { //en el caso de atencion en consultorio.
			String esp = medicos.get(matricula).getEspecialidad();
			double hon = medicos.get(matricula).getHonorarios();
			pacientes.get(hC).nuevoConsExterno(matricula,fecha, esp,hon);
	}
	void agregarAtencion(int hC, Fecha fecha) { //en el caso de atencion por guardia.
		pacientes.get(hC).nuevoGuardia(fecha);
	}
	void agregarInternacion(int hC, String area, Fecha fingreso) { //ingresa el	paciente a internacion.
		pacientes.get(hC).nuevaInternacion(area,fingreso,precioInternacion);
	}
	void altaInternacion(int hC, Fecha fechaAlta) {// da de alta al paciente internado.
		pacientes.get(hC).altaInternacion(fechaAlta);
	}
	boolean agregarTratamiento(int hC, int matricula, String atencion) {
		double hon = medicos.get(matricula).getHonorarios();
		System.out.println("honorario="+hon);
		return pacientes.get(hC).nuevoTratamiento(atencion,matricula, hon);
	}
	
	//AGREGO METODO PARA VER ALGO
	void verInternaciones(Integer hc) {
		pacientes.get(hc).getInternaciones();
	}
	//otro
	String verPaciente(Integer hC) {
		return pacientes.get(hC).toString();
	}
	Paciente getPaciente (Integer hC) {
		return pacientes.get(hC);
	}
	
	double getSaldo(int hC) {
		return pacientes.get(hC).getSaldo();
	}
	void pagarSaldo(int hC) {
		pacientes.get(hC).pagarSaldo();
	}
	
	public HashMap<Fecha, String> atencionesEnConsultorio(int hC){
		return pacientes.get(hC).atCE();
    }
 
	
	
	public LinkedList<Integer> listaInternacion(){  //Devuelve una lista con las hC de la pacientes internados
		LinkedList<Integer> nueva = new LinkedList<Integer>();
		//por cada paciente de pacientes
		for (Paciente value : pacientes.values()) {
			if (value.estaInternado()){
				nueva.add(value.getHC());
			}
		}
		return nueva;
	}
}
