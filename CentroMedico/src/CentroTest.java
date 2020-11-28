

import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class CentroTest {
	Centro ctro;

	@Before
	public void setUp() throws Exception {
		// nombre, CUIT, valor diario de internacion
		ctro = new Centro("Clinica Fuertes", "30-77888999-5", 5000);

		// nombre, valor de consulta
		ctro.agregarEspecialidad("Cardiologia", 2000);
		ctro.agregarEspecialidad("Dermatologia", 1500);
		ctro.agregarEspecialidad("Pediatria", 1200);
		
		// nombre, matricula, especialidad, valor de tratamiento
		ctro.agregarMedico("Rene Vena", 12345, "Cardiologia", 20000);
		ctro.agregarMedico("Susana Cortez", 34567, "Dermatologia", 15000);
		ctro.agregarMedico("Mario Piazza", 56789, "Pediatria", 12000);
		
		// nombre, nro hc, fecha de nacimiento
		ctro.agregarPacientePrivado("Rosa Rios", 321, new Fecha(3,2,1971));
		ctro.agregarPacienteAmbulatorio("Yoel Camino", 543, new Fecha(20,6,2015));
		// nombre, nro hc, fecha de nacimiento,
		// obra social, porcentaje que paga de la internacion
		ctro.agregarPacienteObraSocial("Damian Moreno", 432, new Fecha(1,5,1963),
										"Osplad", 0.2);

		// atenciones en guardia: nro hc, fecha
		ctro.agregarAtencion(321, new Fecha(11,10,2020));
		ctro.agregarAtencion(321, new Fecha(13,11,2020));
		// atenciones en consultorio: nro hc, fecha, matricula del medico
		ctro.agregarAtencion(321, new Fecha(19,10,2020),34567);
		ctro.agregarAtencion(321, new Fecha(21,10,2020),12345);
		ctro.agregarAtencion(321, new Fecha(6,11,2020),34567);

		// nueva internacion: nro hc, area, fecha de ingreso
		ctro.agregarInternacion(432, "General", new Fecha(28,9,2020));
		// alta de internacion: nro hc, fecha de alta
		ctro.altaInternacion(432, new Fecha(2,10,2020));
		ctro.agregarInternacion(432, "Cardiologia", new Fecha(20,10,2020));
		ctro.altaInternacion(432, new Fecha(29,10,2020));
		
		// tratamiento: nro hc, matricula del medico, descripcion del tratamiento
		ctro.agregarTratamiento(543, 56789, "Inmunoterapia");
		ctro.agregarTratamiento(543, 34567, "Terapia antihistaminica");
	
	}

	@Test
	public void testSaldoPacientePrivado() {
		assertEquals(5000,ctro.getSaldo(321),10);
		ctro.pagarSaldo(321);
		assertEquals(0,ctro.getSaldo(321),1);
	}

	@Test
	public void testSaldoPacienteOSocial() {
		assertEquals(13000,ctro.getSaldo(432),20);
		ctro.pagarSaldo(432);
		assertEquals(0,ctro.getSaldo(432),1);
	}

	@Test
	public void testSaldoPacienteAmbulatorio() {
		assertEquals(27000,ctro.getSaldo(543),10);
		ctro.pagarSaldo(543);
		assertEquals(0,ctro.getSaldo(543),1);
	}

	@Test
	public void testAtencionesEnConsultorio() {
		Map<Fecha,String> aten = ctro.atencionesEnConsultorio(321);
		assertTrue(aten.values().contains("Cardiologia"));
		assertTrue(aten.values().contains("Dermatologia"));
	}

	@Test
	public void testListaInternacion() {
		ctro.agregarInternacion(432, "Cardiologia", new Fecha(15,11,2020));

		ctro.agregarPacienteObraSocial("Yamila Choque", 654, new Fecha(20,6,2013),
				"Ospe", 0.3);
		ctro.agregarInternacion(654, "Pediatria", new Fecha(20,11,2020));
		ctro.altaInternacion(654, Fecha.hoy());

		ctro.agregarPacienteObraSocial("Ramiro Delgado", 765, new Fecha(9,7,1989),
				"Osde", 0.1);
		ctro.agregarInternacion(765, "Cardiologia", new Fecha(21,11,2020));

		List<Integer> inter = ctro.listaInternacion();
		assertTrue(inter.contains(432));
		assertTrue(inter.contains(765));
		// nro hc 654 fue dado de alta
		assertFalse(inter.contains(654));
	}


}