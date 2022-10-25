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
		cuenta1 = new Cuenta("12345", "Cuenta1", 50);
		cuenta2 = new Cuenta("67890", "Cuenta2", 0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new Cuenta("12345", "Cuenta1", 50);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void testIngreso() {
		cuenta1.ingreso(50);
		assertEquals(100, cuenta1.getSaldo());
	}

	@Test
	public void testReintegro() throws Exception {
		cuenta1.reintegro(50);
		assertEquals(0, cuenta1.getSaldo());
	}
	
	@Test
	public void Test0014() throws Exception {
		cuenta1.reintegro(200);
		cuenta2.reintegro(350);
		cuenta1.ingreso(100);
		try {
			cuenta2.reintegro(200);
			fail("No ha saltado la excepción");
		} catch (Exception e) {
			
		}
		cuenta2.reintegro(150);
		cuenta1.reintegro(200);
		cuenta2.ingreso(50);
		try {
			cuenta2.reintegro(100);
			fail("No ha saltado la excepción");
		} catch (Exception e) {
			
		}
		assertEquals(-250, cuenta1.getSaldo());
		assertEquals(-450, cuenta2.getSaldo());
	}

}
