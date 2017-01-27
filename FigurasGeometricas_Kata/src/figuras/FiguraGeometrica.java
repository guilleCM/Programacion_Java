package figuras;

abstract class FiguraGeometrica {
	protected String nombre = "desconocido";
	
	String getNombre() {
		return this.nombre;
	}
	
	public abstract double area();
	
}