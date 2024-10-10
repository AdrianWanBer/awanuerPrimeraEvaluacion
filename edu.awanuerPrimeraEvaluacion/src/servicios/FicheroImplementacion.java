package servicios;

import java.io.FileWriter;

import controladores.inicio;

public class FicheroImplementacion implements FicheroInterfaz {

	// Implementacion y metodos relacionados con los ficheros log

	// Metodo encargado de escribir en el ficherro log
	public void ficheroLog(String mensaje) {

		FileWriter fw = null;

		try {

			fw = new FileWriter(inicio.RUTACOMPLETALOG, true);

			fw.write(mensaje.concat("\n"));

			fw.close();

		} catch (Exception e) {

		}

	}

}
