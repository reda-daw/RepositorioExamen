package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCovid {

	@Test
	void test() {
		Covid covid1 = new Covid();
		int calcularPrioridadVacunacion = covid1.calcularPrioridadVacunacion(55, 1);
		int valor_esperado =  3;
		
		Assertions.assertEquals(valor_esperado,calcularPrioridadVacunacion);
		
	}

}

