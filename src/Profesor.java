
public class Profesor extends Usuario {
	
	private String correo;
	
	public Profesor(String nombre, String correo)
	{
		super(nombre);
		this.correo= correo;
	}
	
	public String getCorreo()
	{
		return correo;
	}
	
	public void setCorreo(String Correo)
	{
		this.correo= Correo;
	}
}
