package org.foobarspam.FigurasGeometricas.figura;

public interface Drawable {
	// Las sublases deberán implementar el método drawable.
	void draw();
	default void aplicarTema() {
		throw new UnsupportedOperationException("No se puede aplicar tema");
	}
}
