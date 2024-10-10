package controladores;

import java.util.ArrayList;
import java.util.List;

import Dtos.clienteDto;
import Dtos.ventaDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class inicio {
	
	//Declaracion de listas globales
	public static List<clienteDto> listaClientes = new ArrayList<clienteDto>();
	public static List<ventaDto> listaVentas = new ArrayList<ventaDto>();
	
	//Fichero Log
	public static final String RUTACOMPLETALOG = "C:\\Users\\adrian\\eclipse-workspace\\java\\edu.awanuerPrimeraEvaluacion\\src\\auditoria\\".concat(utiles.utilidades.crearNombreLog());

	
	public static void main(String[] args) {
		
		//Declaracion de variables
		MenuInterfaz mi = new MenuImplementacion();
		OperativaInterfaz oi = new OperativaImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion();
		boolean cerrarMenu = false;
		while (!cerrarMenu) {

			int seleccion = mi.menuPrincipal();

			switch (seleccion) {
			case 0:
				fi.ficheroLog("Menu Cerrado");
				cerrarMenu = true;
				break;
			case 1:
				fi.ficheroLog("Menu emplado abierto");
				int seleccionEmpleado = mi.menuEmpleado();
				switch (seleccionEmpleado) {
				case 0:
					fi.ficheroLog("Menu empleado cerrado");
					break;
				case 1:
					fi.ficheroLog("Añadir compra");
					oi.AñadirCompraCliente();
					break;
				case 2:
					fi.ficheroLog("Calculo Mensual");
					oi.calculoMensual();
					break;
				}
				break;
			case 2:
				fi.ficheroLog("Crear nnuevo cliente");
				oi.crearNuevoCliente();
				break;
			default:
				fi.ficheroLog("Opcion no valida");
				System.out.println("Opcion no valida");
			}

		}
	}
}