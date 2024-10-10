package utiles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class utilidades {

	public static String crearNombreLog() {

		LocalDate fecha = LocalDate.now();
		DateTimeFormatter formatoDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String fechaCambiada = formatoDateTimeFormatter.format(fecha);

		String nombreCompleto = "log-".concat(fechaCambiada).concat(".txt");

		return nombreCompleto;
	}
}
