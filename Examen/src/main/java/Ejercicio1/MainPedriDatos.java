package Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainPedriDatos {
	private static final Logger log = LogManager.getLogger(Nodo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		do {
			System.out.println("Introduzca un valor: (0 para salir)");
			valor = teclado.nextInt();
			Nodo nodo = new Nodo(valor);
			if(valor!=0) {
				if (valor%2==0) {
					log.info("Se ha introducido un valor par a las ");
				}else {
					log.info("Se ha introducido un valor impar el dia");
				}
				lista.add(nodo);
			}
		}while(valor!=0);
	}

	}


