package unico;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

/*Pedir 5 calificaciones de alumnos. El programa debe decir,
 * al final, si hay algún suspenso o no lo hay. Nota: cuidado,
 * si hay 2 suspensos, no debe decirlo dos veces.
 */
		
		final int TOPE = 5;
		
		int nota;
		int suspensos = 0;
		int aprobados = 0;
		int i;
		
		for (i=1; i <=TOPE; i++) {
			System.out.print("Introduce tus calificaciones [" + i + " - 5]: ");
			nota = Integer.parseInt(teclado.nextLine());
			
			if (nota < 5) {
				suspensos++;
			} else {
				aprobados++;
			}
		}
		System.out.println("Tienes " + suspensos + " suspensos.");
		System.out.println("Tienes " + aprobados + " aprobados.");
	}
}
