
public class Alumno extends Usuario{
	
	public double nota1, nota2, nota3;
	
	public Alumno (String nombre, double nota1, double nota2, double nota3)
	{
		super(nombre);
		this.nota1= nota1;
		this.nota2= nota2;
		this.nota3= nota3;
	}
	
	public double obtenerPromedio()
	{
		return (nota1+nota2+nota3)/3;
	}

}
