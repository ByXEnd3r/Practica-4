package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.Cuenta;

class CuentaTest {

	static Cuenta cuenta1;
	static Cuenta cuenta2;

	@BeforeAll
	static void setUpBeforeClass() {
		cuenta1 = new Cuenta("12345", "Cuenta1", 0);
		cuenta2 = new Cuenta("67890", "Cuenta2", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testReintegro() {
		cuenta1.ingreso(50);
		assertEquals(50, cuenta1.getSaldo());
	}

	public void testIngreso() {
		cuenta1.reintegro(50);
		assertEquals(0, cuenta1.getSaldo());
	}

}
