/**
 * Ruben Bernal Ramos, CSI1
 */

package controladores;

import java.time.LocalDate;

/**
 * Clase controladora de la aplicacion
 * @author rbr - 151224
 *
 */
public class Inicio {

	/**
	 * Metodo de entrada de la aplicacion
	 * rbr - 151224
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Creo las dos fechas
		LocalDate fecha1 = LocalDate.of(2024, 06, 15);
		LocalDate fecha2 = LocalDate.now();

		//Verifico si la Fecha1 es anterior, posterior o igual a la fecha actual
		boolean esAntes = fecha1.isBefore(fecha2);
		boolean esDespues = fecha1.isAfter(fecha2);
		boolean esIgual = fecha1.isEqual(fecha2);

		//Imprimo el resultado de cada comparación
		System.out.println("¿Fecha1 es antes? " + esAntes);
		System.out.println("¿Fecha1 es después? " + esDespues);
		System.out.println("¿Fecha1 es igual? " + esIgual);

	}

}
