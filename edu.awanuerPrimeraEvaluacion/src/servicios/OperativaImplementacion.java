package servicios;

import java.awt.SystemTray;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Dtos.clienteDto;
import Dtos.ventaDto;
import controladores.inicio;

public class OperativaImplementacion implements OperativaInterfaz {

	Scanner sc = new Scanner(System.in);

	// Metodo que se encarga de la creacion de un nuevo cliente
	public void crearNuevoCliente() {

		int id = 0;
		boolean seguir = false;
		while (!seguir) {

			id = id + 1;
			System.out.println("Nombre del Cliente:");
			String nombre = sc.next();
			System.out.println("Apellidos del cliente:");
			String apellidosff = sc.nextLine();
			String apellidos = sc.nextLine();

			clienteDto nuevoCliente = new clienteDto();
			nuevoCliente.setNombreCliente(nombre);
			nuevoCliente.setApellidosCliente(apellidos);
			nuevoCliente.setIdCliente(id);

			inicio.listaClientes.add(nuevoCliente);

			System.out.println("¿Desea seguir añadiendo?, si = 1, no = 2");
			int seleccion = sc.nextInt();
			if (seleccion != 1) {
				seguir = true;
			}
		}
	}

	// Metodo que permite crear las compras
	public void AñadirCompraCliente() {
		System.out.println("Mostrando los clientes disponibles");
		for (clienteDto buscarClientes : inicio.listaClientes) {
			System.out.println(buscarClientes.getIdCliente() + " | " + buscarClientes.getNombreCliente() + " | "
					+ buscarClientes.getApellidosCliente());
		}

		System.out.println("Importe: ");
		int importe = sc.nextInt();
		System.out.println("Id del cliente");
		int id = sc.nextInt();
		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String fechaCambiada = formato.format(fecha);

		ventaDto nueVenta = new ventaDto(id, fechaCambiada, importe);
	}

	// Metodo con la operativa que mostrara las ventas del mes
	public void calculoMensual() {
		System.out.println("¿Que fecha quiere?, (MM-yyyy) ");
		String fechaSolicitada = sc.next();
		for (ventaDto ventaDto : inicio.listaVentas) {
			if (ventaDto.getFechaVenta() == fechaSolicitada) {
				System.out.println(
						ventaDto.getIdCliente() + " | " + ventaDto.getFechaVenta() + " | " + ventaDto.getImporte());
			}
		}
	}
}
