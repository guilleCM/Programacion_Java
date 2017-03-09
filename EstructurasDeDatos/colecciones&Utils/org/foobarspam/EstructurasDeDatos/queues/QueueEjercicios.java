package org.foobarspam.EstructurasDeDatos.queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEjercicios {
	public static void main(String[] args) {
		Queue<Alumno> colaAlumnos = new LinkedList<Alumno>();
		Alumno a = new Alumno("Manuel", "López");
		Alumno b = new Alumno("Luisa", "Menéndez");
		Alumno c = new Alumno("Miguel", "Martínez");

		colaAlumnos.add(a);
		colaAlumnos.add(b);
		colaAlumnos.add(c);

		while (!colaAlumnos.isEmpty()) {
			Alumno x = colaAlumnos.poll();
			System.out.println(x.getNombre());
			System.out.println(x.getApellidos());
			System.out.println("---------------");
		}
	}
}

class Alumno {
	private String nombre;
	private String apellidos;

	public Alumno(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
