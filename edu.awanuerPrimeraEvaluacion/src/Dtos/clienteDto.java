package Dtos;

public class clienteDto {

	
	int idCliente;
	String nombreCliente;
	String apellidosCliente;
	
	//Construcctor formado
	public clienteDto(int idCliente, String nombreClienteString, String apellidosClienteeString) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreClienteString;
		this.apellidosCliente = apellidosClienteeString;
	}
	
	//Constructor vacio
	public clienteDto() {
		
	}
	
	//Getter and setters
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
}
