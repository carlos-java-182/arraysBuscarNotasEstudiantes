package arreglos;

import java.util.Scanner;

public class Estudiantes {

	public static void main(String[] args) {

		float primer[] = new float[5];
		float segundo[] = new float[5];
		float tercer[] = new float[5];
		float suma1 = 0, suma2 = 0, suma3 = 0;
		float promedio1, promedio2, promedio3;
		float promedioalumno;

		int alumno;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {

			System.out.print("Digita las notas del alumno " + (i + 1) + ".- del primer semestre :");
			primer[i] = entrada.nextFloat();

			suma1 += primer[i];
		}

		for (int i = 0; i < 5; i++) {

			System.out.print("Digita las notas del alumno " + (i + 1) + ".- del segundo semestre :");
			segundo[i] = entrada.nextFloat();
			suma2 += segundo[i];
		}

		for (int i = 0; i < 5; i++) {

			System.out.print("Digita las notas del alumno " + (i + 1) + ".- del tercer semestre :");
			tercer[i] = entrada.nextFloat();
			suma3 += tercer[i];
		}

		promedio1 = suma1 / primer.length;
		promedio2 = suma2 / segundo.length;
		promedio3 = suma3 / tercer.length;

		
		do {
		System.out.println("Digita un número entre el 1-5 para promediar ese alumno :");
		alumno = entrada.nextInt();
		}while(alumno<0 || alumno>5);

		promedioalumno = (primer[(alumno-1)] + segundo[(alumno-1)] + tercer[(alumno-1)]) / 3;
		
		System.out.println("El promedio del primer semestre es: "+ promedio1);
		System.out.println("El promedio del segundo semestre es: "+ promedio2);
		System.out.println("El promedio del tercer semestre es: "+ promedio3);
		
		System.out.println("El promedio del alumno "+ alumno + "  es: " + promedioalumno);
	}
}
