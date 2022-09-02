package classroom;
public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30); // falta un metodo para Tipo(int)
	
	private int codigo;
	private String nombre;
	Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
	Tipo(int codigo){
		this.codigo=codigo;
	}
}
