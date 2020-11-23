
public class CodigoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Centro centro=new Centro("Centro Medico Dolores Fuentes","30-36542563-0",3000);
		centro.agregarEspecialidad("Pediatria",2000);
		centro.agregarEspecialidad("Cardiologia",3000);
		centro.agregarEspecialidad("Traumatologia",2500);
		centro.agregarMedico("Dr Perez", 55555, "Pediatria", 5000);
		centro.agregarMedico("Dr Rodriguez", 66666, "Cardiologia", 8000);
		centro.agregarMedico("Dr Curetta", 77777, "Traumatologia", 2000);
		centro.agregarPacientePrivado("Juan", 111, new Fecha(20,11,1980));
		centro.agregarPacienteObraSocial("Carlos", 222, new Fecha(15,1,1940), "Pami",
		0.3);
		centro.agregarPacienteAmbulatorio("Pedro", 333, new Fecha(28,2,1970));
		centro.agregarPacienteObraSocial("Jose", 444, new Fecha(15,1,1940), "Ospe",
		0.2);
		centro.agregarAtencion(111, new Fecha(25,10,2020));
//		centro.agregarAtencion(111, Fecha.hoy(), 55555);
//		System.out.println("Lista de internacion:" + centro.listaInternacion());
		System.out.println("\nSe agrega una internacion...\n");
		centro.agregarInternacion(222,"Cardiologia",new Fecha(20,10,2020));
//		System.out.println("Lista de internacion:" + centro.listaInternacion());
		System.out.println("\nSe da de alta la internacion...\n");
		centro.altaInternacion(222, new Fecha(14,11,2020));
//		System.out.println("Lista de internacion:" + centro.listaInternacion());
		System.out.println("\nSe agregan dos nuevas internaciones...\n");
		centro.agregarInternacion(222,"General",new Fecha(16,11,2020));
		centro.agregarInternacion(444,"Pediatria",new Fecha(17,11,2020));
//		System.out.println("Lista de internacion:" + centro.listaInternacion());
		centro.agregarTratamiento(333, 66666, "Angioplastia");
		System.out.println("\n\n" + centro.toString());
		System.out.println("Deuda paciente HC 111: " + centro.getSaldo(111));
		System.out.println("Deuda paciente HC 222: " + centro.getSaldo(222));
		System.out.println("Deuda paciente HC 333: " + centro.getSaldo(333));
		System.out.println("\nSaldando deudas...\n");
		centro.pagarSaldo(111);
		centro.pagarSaldo(333);
		centro.pagarSaldo(222);
		System.out.println("Deuda paciente HC 111: " + centro.getSaldo(111));
		System.out.println("Deuda paciente HC 222: " + centro.getSaldo(222));
		System.out.println("Deuda paciente HC 333: " + centro.getSaldo(333));
		System.out.println("\n\n"+centro.toString());
		System.out.println("\nAgrego nueva atencion paciente 111...\n");
		centro.agregarAtencion(111, new Fecha(18,11,2020),77777);
		System.out.println("Atenciones paciente 111:");
//		System.out.println(centro.atencionesEnConsultorio(111));
*/
		Paciente p = new ObraSocial("Cuca",111,new Fecha(02,05,1990), "Osde", 30);
		System.out.println(p.toString());
		((ObraSocial) p).nuevaInternacion("Cardiologia", new Fecha(20,11,2020)); //porqué tengo que castear?? :( revisar teoria
		System.out.println(((ObraSocial) p).getInternaciones());
		
		Tratamiento t = new Tratamiento(15, "Pediatria");
		System.out.println(t.toString());
	}

}
