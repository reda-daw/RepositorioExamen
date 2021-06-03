package Ejercicio2;

public class Covid {
public int calcularPrioridadVacunacion(int edad, int numeroDosis) {
		
		int prioridad=1;
		
		if(edad > 60 && numeroDosis==1) {
			prioridad = 2;
		}
		else if(edad > 40 && edad <=60 && numeroDosis==1) {
			prioridad = 3;
		}
		else {
			prioridad = 1;
		}
		
		return prioridad;
	}
}
