package org.foobarspam.FigurasGeometricas.figura;

public interface Drawable {
	// Las sublases deber�n implementar el m�todo drawable.
	void draw();
	default void aplicarTema() {
		throw new UnsupportedOperationException("No se puede aplicar tema");
	}
}
