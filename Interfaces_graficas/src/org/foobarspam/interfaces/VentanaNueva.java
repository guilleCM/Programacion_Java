package org.foobarspam.interfaces;
import java.awt.*;

public class VentanaNueva extends Frame{
	
	//constructor
	public VentanaNueva() {
		Dimension d =  Toolkit.getDefaultToolkit().getScreenSize();
		//generamos una ventana de 1/3 de la pantalla
		int ancho = d.width/3;
		int alto = d.height/3;
		this.setSize(ancho, alto);
		
		//posicion de la ventana centrada
		this.setLocation(d.width/2-ancho/2, d.height/2-alto/2);
		
		//color de fondo y letra
		this.setBackground(new Color(20,140,10));
		this.setForeground(Color.blue);
		Font fuente = new Font("Arial", Font.PLAIN, 20);
		//nombre fuente + aspecto + tamaño
		this.setFont(fuente);
		this.setTitle("Ejemplo de ventana ");
	}
}
