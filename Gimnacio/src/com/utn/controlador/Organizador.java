package com.utn.controlador;

import com.utn.modelo.*;

public final class Organizador {
	
	static int limite = 5;


	public static void asignaCategoria(Aspirante aspirante) {

		if (aspirante.peso < 52.16) {
			aspirante.categoria = "Mosca";

		} else if (aspirante.peso < 55.33) {
			aspirante.categoria = "Gallo";

		} else if (aspirante.peso < 58.96) {
			aspirante.categoria = "Pluma";

		} else if (aspirante.peso < 63.50) {
			aspirante.categoria = "Ligero";

		} else if (aspirante.peso < 69.85) {
			aspirante.categoria = "Welter";

		} else if (aspirante.peso < 76.20) {
			aspirante.categoria = "Mediano";

		} else if (aspirante.peso < 91) {
			aspirante.categoria = "Mediopesado";

		} else if (aspirante.peso >= 91) {
			aspirante.categoria = "Pesado";
		}

		System.out.println(aspirante.nombre + " pertenece a la categoria " + aspirante.categoria + " porque pesa "
				+ aspirante.peso + " kg.");
		
	}

	public static void asignaEstudiantes(Aspirante[] aspi, Entrenadores[] entrena) {

		for (int i = 0; i < entrena.length; i++) {
			
			int h = 0;

			for (int j = 0; j < aspi.length; j++) {

				if ((aspi[j].categoria.equals("Mosca") || aspi[j].categoria.equals("Gallo")) && entrena[i].categoria.equals("Mosca-Gallo")) {

					if(h < limite){
						entrena[i].asignaBoxiadores(aspi[j]);
						h++;
					}else{
						System.out.println(aspi[j].nombre + " no cursa por falta de cupos en la categoria " + entrena[i].categoria );
					}
					
					
				} else if ((aspi[j].categoria.equals("Pluma") || aspi[j].categoria.equals("Ligero")) && entrena[i].categoria.equals("Pluma-Ligero")) {

					if(h < limite){
						entrena[i].asignaBoxiadores(aspi[j]);
						h++;
					}else{
						System.out.println(aspi[j].nombre + " no cursa por falta de cupos en la categoria " + entrena[i].categoria );
					}
				} else if ((aspi[j].categoria.equals("Welter") || aspi[j].categoria.equals("Mediano")) && entrena[i].categoria.equals("Welter-Mediano")) {
					
					if(h < limite){
						entrena[i].asignaBoxiadores(aspi[j]);
						h++;
					}else{
						System.out.println(aspi[j].nombre + " no cursa por falta de cupos en la categoria " + entrena[i].categoria );
					}
				} else if ((aspi[j].categoria.equals("Mediopesado") || aspi[j].categoria.equals("Pesado")) && entrena[i].categoria.equals("Mediopesado-Pesado")) {
					
					if(h < limite){
						entrena[i].asignaBoxiadores(aspi[j]);
						h++;
					}else{
						System.out.println(aspi[j].nombre + " no cursa por falta de cupos en la categoria " + entrena[i].categoria );
					}
				}

			}

		}
	}
}
