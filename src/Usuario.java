
public class Usuario {
	private String nombre;
	
	protected  Usuario (String usuario)
	{
		this.nombre= usuario;
	}
	
	protected  String getNombre()
	{
		return nombre;
	}
	
	protected void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

}
