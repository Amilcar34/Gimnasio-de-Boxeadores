package com.utn.modelo;

public final class Reporte {

	public static void asignaPesoCategoria(Aspirante[] aspirante) {

		for (int i = 0; i < aspirante.length; i++) {

			if (aspirante[i].peso < 52.16) {
				aspirante[i].categoria = "Mosca";
				
			} else if (aspirante[i].peso < 55.33) {
				aspirante[i].categoria = "Gallo";
			
			} else if (aspirante[i].peso < 58.96) {
				aspirante[i].categoria = "Pluma";
			
			} else if (aspirante[i].peso < 63.50) {
				aspirante[i].categoria = "Ligero";
			
			} else if (aspirante[i].peso < 69.85) {
				aspirante[i].categoria = "Welter";
			
			} else if (aspirante[i].peso < 76.20) {
				aspirante[i].categoria = "Mediano";
			
			} else if (aspirante[i].peso < 91) {
				aspirante[i].categoria = "Mediopesado";
			
			} else if (aspirante[i].peso >= 91) {
				aspirante[i].categoria = "Pesado";
			}


		System.out.println(aspirante[i].nombre + " pertenece a la categoria " + aspirante[i].categoria 
							+ " porque pesa " + aspirante[i].peso + " kg.");

		}
	}
}
