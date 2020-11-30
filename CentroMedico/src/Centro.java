import java.util.HashMap;
import java.util.HashSet;
//import java.util.Map;
import java.util.LinkedList;

public class Centro {
 
	private HashMap<Integer, Paciente> pacientes; 
	private HashMap<Integer, Medico> medicos;     
	private HashSet<Especialidad> especialidades; 
	private String CUIT;
	private String nombre;
	private double precioInternacion;

	Centro ( String nombre, String CUIT, double pInternacion){
		this.CUIT = CUIT;
		this.nombre = nombre;
		this.precioInternacion = pInternacion;
		this.pacientes = new HashMap<Integer, Paciente>();
		this.medicos = new HashMap<Integer, Medico>();
		this.especialidades = new HashSet<Especialidad> ();
	}
	@Override
	public String toString() { 
		StringBuilder sb = new StringBuilder();
		sb.append("----------"+this.nombre+"---------");
		sb.append("\nCUIT: "+this.CUIT);
		sb.append("\nProfesionales: "+medicos.toString());
		sb.append("\nEspecialidades que ofrece el Centro: "+this.especialidades);
		sb.append("\nPacientes del Centro:"+pacientes.toString());
		sb.append("\nPrecio de internacion por dia: "+this.precioInternacion+"$");
		return sb.toString();
	}
	
	public void agregarEspecialidad(String nombre, double valor) {	
			 especialidades.add(new Especialidad(nombre,valor));
	}
	public void agregarMedico(String nombre, Integer matricula, String nomEspecialidad,double valorTratamiento) {
		medicos.put(matricula, new Medico(nombre, matricula,valorTratamiento,nomEspecialidad));
	}//asegurada la no repeticion porque .put lo garantiza dado que matricula es key
	
	public void agregarPacientePrivado(String nombre, Integer hC, Fecha nac) {
		pacientes.put(hC, new Privado(nombre, hC, nac));
	}
	
	public void agregarPacienteAmbulatorio(String nombre, Integer hC, Fecha nac) {
		pacientes.put(hC, new Ambulatorio(nombre, hC, nac));
	}
	public void agregarPacienteObraSocial(String nombre, Integer hC, Fecha nac, String	osocial, double p) {
		pacientes.put(hC, new ObraSocial(nombre, hC, nac,osocial,p));
	}
	public void agregarAtencion(Integer hC, Fecha fecha, int matricula) { //en el caso de atencion en consultorio.
			String esp = medicos.get(matricula).getEspecialidad();
			double precioEsp = 0;
		    for (Especialidad obj : especialidades) {
		       if (obj.equals(new Especialidad(esp,0))) {
		      	   precioEsp = obj.getValor();
		       }
		    }
			pacientes.get(hC).nuevoConsExterno(matricula, fecha, esp, precioEsp);
	}
	public void agregarAtencion(int hC, Fecha fecha) { //en el caso de atencion por guardia.
		pacientes.get(hC).nuevoGuardia(fecha);
	}
	public void agregarInternacion(int hC, String area, Fecha fingreso) { //ingresa el	paciente a internacion.
		if (!pacientes.get(hC).estaInternado()) {
			pacientes.get(hC).nuevaInternacion(area,fingreso,precioInternacion);
		}
	}
	public void altaInternacion(int hC, Fecha fechaAlta) {// da de alta al paciente internado.
		pacientes.get(hC).altaInternacion(fechaAlta);
	}
	public void agregarTratamiento(int hC, int matricula, String atencion) {
		double hon = medicos.get(matricula).getHonorarios();
		pacientes.get(hC).nuevoTratamiento(atencion,matricula, hon);
	}
	
	public double getSaldo(int hC) {
		return pacientes.get(hC).getSaldo();
	}
	public void pagarSaldo(int hC) {
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
