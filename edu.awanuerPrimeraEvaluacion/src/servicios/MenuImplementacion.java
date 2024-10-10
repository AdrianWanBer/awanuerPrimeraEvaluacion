package servicios;

import java.io.Console;
import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz {

	Scanner scanner = new Scanner(System.in);

	// Metodo que Muestra el menu principal
	public int menuPrincipal() {
		int seleccion;

		System.out.println("0.Cerrar");
		System.out.println("1.Menu empleado");
		System.out.println("2.Menu gerencia");
		seleccion = scanner.nextInt();

		return seleccion;
	}

	// Metodo del menu empleado
	public int menuEmpleado() {

		int seleccion;
		System.out.println("0.Cerrar");
		System.out.println("1.Añadir compra");
		System.out.println("2.Calculo total de ventas mensual");
		seleccion = scanner.nextInt();

		return seleccion;
	}

}
