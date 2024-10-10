package Dtos;

import java.time.LocalDateTime;

public class ventaDto {

	int idCliente;
	String fechaVenta;
	int importe;
	
	//Constructor con los parametros
	public ventaDto(int idCliente, String fechaVenta, int importe) {
		super();
		this.idCliente = idCliente;
		this.fechaVenta = fechaVenta;
		this.importe = importe;
	}
	
	
	
	//Getter and setters
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(String fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	public int getImporte() {
		return importe;
	}
	public void setImporte(int importe) {
		this.importe = importe;
	}
	
}
