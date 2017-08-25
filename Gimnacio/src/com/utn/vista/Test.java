package com.utn.vista;

import com.utn.controlador.Organizador;
import com.utn.modelo.Aspirante;
import com.utn.modelo.Entrenadores;

public final class Test {

	public static void main(String[] args) {
		
		Entrenadores e1 = new Entrenadores();
		e1.nombre = "Amadeo";
		e1.categoria = "Mosca-Gallo";
		
		Entrenadores e2 = new Entrenadores();
		e2.nombre = "Armando";
		e2.categoria = "Pluma-Ligero";
		
		Entrenadores e3 = new Entrenadores();
		e3.nombre = "Alejandro";
		e3.categoria = "Welter-Mediano";
		
		Entrenadores e4 = new Entrenadores();
		e4.nombre = "Agustina";
		e4.categoria = "Mediopesado-Pesado";

		
		System.out.println("los que se vinieron a inscribir :");
		System.out.println(" ");

		Aspirante h = new Aspirante();
		h.nombre = "Laura";
		h.peso = 40;
		Organizador.asignaCategoria(h);
		
		Aspirante h1 = new Aspirante();
		h1.nombre = "Lucia";
		h1.peso = 45;
		Organizador.asignaCategoria(h1);

		Aspirante h2 = new Aspirante();
		h2.nombre = "Lorena";
		h2.peso = 50;
		Organizador.asignaCategoria(h2);
			
		Aspirante h3 = new Aspirante();
		h3.nombre = "Lautaro";
		h3.peso = 55;
		Organizador.asignaCategoria(h3);

		Aspirante h4 = new Aspirante();
		h4.nombre = "Lucas";
		h4.peso = 60;
		Organizador.asignaCategoria(h4);

		Aspirante h5 = new Aspirante();
		h5.nombre = "Luciano";
		h5.peso = 65;
		Organizador.asignaCategoria(h5);

		Aspirante h6 = new Aspirante();
		h6.nombre = "Lulu";
		h6.peso = 70;
		Organizador.asignaCategoria(h6);

		Aspirante h7 = new Aspirante();
		h7.nombre = "Lucho";
		h7.peso = 75;
		Organizador.asignaCategoria(h7);

		Aspirante h8 = new Aspirante();
		h8.nombre = "Lore";
		h8.peso = 80;
		Organizador.asignaCategoria(h8);

		Aspirante h9 = new Aspirante();
		h9.nombre = "Lasie";
		h9.peso = 85;
		Organizador.asignaCategoria(h9);

		Aspirante h10 = new Aspirante();
		h10.nombre = "Lampone";
		h10.peso = 90;
		Organizador.asignaCategoria(h10);

		Aspirante h11 = new Aspirante();
		h11.nombre = "Lucia";
		h11.peso = 95;
		Organizador.asignaCategoria(h11);

		Aspirante h12 = new Aspirante();
		h12.nombre = "Lito";
		h12.peso = 100;
		Organizador.asignaCategoria(h12);

		Aspirante a = new Aspirante();
		a.nombre = "Juares";
		a.peso= 43;
		Organizador.asignaCategoria(a);
		
		Aspirante a1 = new Aspirante();
		a1.nombre = "Juan";
		a1.peso= 47;
		Organizador.asignaCategoria(a1);

		Aspirante a2 = new Aspirante();
		a2.nombre = "Jorge";
		a2.peso= 53;
		Organizador.asignaCategoria(a2);

		Aspirante a3 = new Aspirante();
		a3.nombre = "Jose";
		a3.peso= 57;
		Organizador.asignaCategoria(a3);

		Aspirante a4 = new Aspirante();
		a4.nombre = "Javier";
		a4.peso= 63;
		Organizador.asignaCategoria(a4);

		Aspirante a5 = new Aspirante();
		a5.nombre = "Juanito";
		a5.peso= 67;
		Organizador.asignaCategoria(a5);

		Aspirante a6 = new Aspirante();
		a6.nombre = "Jaimito";
		a6.peso= 73;
		Organizador.asignaCategoria(a6);

		Aspirante a7 = new Aspirante();
		a7.nombre = "Juana";
		a7.peso= 77;
		Organizador.asignaCategoria(a7);

		Aspirante a8 = new Aspirante();
		a8.nombre = "Josefa";
		a8.peso= 83;
		Organizador.asignaCategoria(a8);

		Aspirante a9 = new Aspirante();
		a9.nombre = "Jimena";
		a9.peso= 87;
		Organizador.asignaCategoria(a9);

		Aspirante a10 = new Aspirante();
		a10.nombre = "Jasinta";
		a10.peso= 93;
		Organizador.asignaCategoria(a10);

		Aspirante a11 = new Aspirante();
		a11.nombre = "Jazmin";
		a11.peso= 97;
		Organizador.asignaCategoria(a11);

		Aspirante a12 = new Aspirante();
		a12.nombre = "Josias";
		a12.peso= 103;
		Organizador.asignaCategoria(a12);

		System.out.println(" ");
		System.out.println("==================================================================================");

		Entrenadores[] entrenadores = { e1, e2, e3, e4 };

		Aspirante[] estudiantes = { a, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, h, h1, h2, h3, h4, h5, h6, h7,
				h8, h9, h10, h11, h12 };

		Organizador.asignaEstudiantes(estudiantes, entrenadores);

	}

}
