package desafios;

import java.util.Scanner;


	public class MainAlumnos {
		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("Ingrese la cantidad de alumnos: ");
			int cantidadAlumnos = teclado.nextInt();

			Alumno[] alumnos = new Alumno[cantidadAlumnos];

			for (int i = 0; i < cantidadAlumnos; i++) {
				System.out.println("Ingreso de datos para el alumno " + (i + 1));

				System.out.print("Nombre: ");
				String nombre = teclado.next();

				System.out.print("Apellido: ");
				String apellido = teclado.next();

				System.out.print("Número de examen: ");
				int numeroExamen = teclado.nextInt();

				int sumaNotas = 0;
				
				for (int j = 0; j < numeroExamen; j++) {
					System.out.print("Nota " + (j + 1) + ": ");
					int nota = teclado.nextInt();
					sumaNotas += nota;
				}

				double promedio = (double) sumaNotas / numeroExamen;
								
				alumnos[i] = new Alumno(nombre, apellido, numeroExamen, promedio); // creo un objeto Alumno y lo agrego
																					// al array
			}

			int notaMax = obtenerNotaMax(alumnos);
			int notaMin = obtenerNotaMin(alumnos);

			System.out.println("----------------------------------");
			System.out.println("Alumno con la nota mas alta:");
			alumnos[notaMax].mostrar();
			System.out.println("Alumno con la nota mas baja:");
			alumnos[notaMin].mostrar();

			System.out.println("----------------------------------");
			System.out.println("Alumnos que promocionan:");
			alumnosQuePromocionan(alumnos);
			
			
			System.out.println("Alumnos que no promocionan:");
			alumnosQueNoPromocionan(alumnos);
		}
		

		private static int obtenerNotaMax(Alumno[] alumnos) {
			int max = 0;
			for (int i = 1; i < alumnos.length; i++) {
				if (alumnos[i].getPromedio() > alumnos[max].getPromedio()) {
					max = i;
				}
			}
			return max;
		}

		private static int obtenerNotaMin(Alumno[] alumnos) {
			int min = 0;
			for (int i = 1; i < alumnos.length; i++) {
				if (alumnos[i].getPromedio() < alumnos[min].getPromedio()) {
					min = i;
				}
			}
			return min;
		}

		private static void alumnosQuePromocionan(Alumno[] alumnos) {
			for (Alumno alumno : alumnos) {
				if (alumno.getPromedio() >= 7) {
					System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
					System.out.println("Promedio: " + alumno.getPromedio());
					System.out.println("----------------------------------");
				}

			}

		}
		private static void alumnosQueNoPromocionan(Alumno[] alumnos) {
			for (Alumno alumno : alumnos) {
				if (alumno.getPromedio() < 7) {
					System.out.println("Nombre: " + alumno.getNombre() + " " + alumno.getApellido());
					System.out.println("Promedio: " + alumno.getPromedio());
					System.out.println("----------------------------------");
				}

			}

		}
}

