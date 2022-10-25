package Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Clases.Cuenta;

class CuentaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Cuenta cuenta1;
		Cuenta cuenta2;
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
		assertEquals(50, cuenta1.reintegro(100));
	}
	
	public void testIngreso() {
		assertEquals(50, cuenta1.ingreso(100));
	}

}
