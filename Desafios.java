package ar.com.educacionit.universidad;
import java.util.Scanner;
public class Desafios {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese el día en el siguiente formato dd: ");
		int dia = teclado.nextInt();
		
		System.out.println("Ingrese el mes en el siguiente formato mm: ");
		int mes = teclado.nextInt();
		
		System.out.println("Ingrese el año en el siguiente formato yyyy: ");
		int anio = teclado.nextInt();
		
		boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
		
		//dentro de mes valido el dia
		if(mes>=1 && mes<=12) {
			switch(mes) {
				case 1: 
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					dia = validacion31(teclado, dia);
	                break;
				case 4:
	            case 6:
	            case 9:
	            case 11:
	                dia = validacion30(teclado, dia);
	                break;  
	            case 2:
	            	dia = validacion28(teclado,dia,anio);
	            	
			}	
		
		}else {
			System.out.println("Mes invalido. Ingrese el mes: ");
			int mesN = teclado.nextInt();
			mes = mesN;
			
		}
		
		//validacion mes		
		if(mes>=1 && mes<=12) {
						
		}else {
			System.out.println("Mes invalido. Ingrese el mes: ");
			int mesN = teclado.nextInt();
			mes = mesN;
			
		}
		
		//validacion anio	
		if(anio >= 1990 && anio<= 2099) {
			
		}else {
			System.out.println("Año invalido. Ingrese el año entre 1900 y 2099: ");
			int anioN = teclado.nextInt();
			anio = anioN;
		} 
		 
		 
		 
		 if (esBisiesto) {
			    System.out.println("Es año bisiesto");
			} else {
			    System.out.println("El año no es bisiesto");
			}

		 
		
		System.out.println("La fecha ingresada es: " + dia + "/" + mes+ "/" + anio);
		teclado.close();
	}
	
	//funciones 
	public static int validacion31(Scanner teclado, int dia) {
		int diaN; 
		while(dia < 1 || dia > 31) {
			System.out.println("Día no válidoooooooo. Debe estar entre 1 y 31.");
			System.out.println("Ingrese el día en el siguiente formato dd: ");
            diaN = teclado.nextInt();
            dia=diaN;
		}
			return dia;
		}
	public static int validacion30(Scanner teclado, int dia) {
		int diaN; 
		while(dia < 1 || dia > 30) {
			System.out.println("Día no válidoooooooo. Debe estar entre 1 y 30.");
			System.out.println("Ingrese el día en el siguiente formato dd: ");
            diaN = teclado.nextInt();
            dia=diaN;
		}
			return dia;
		}

	public static int validacion28(Scanner teclado, int dia,int anio) {
		int diaN;
		if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
			while(dia < 1 || dia > 29) {
				System.out.println("Día no válidoooooooo. Debe estar entre 1 y 29.");
				System.out.println("Ingrese el día en el siguiente formato dd: ");
	            diaN = teclado.nextInt();
	            dia=diaN;
			}
				return dia;
			} else {
				while(dia < 1 || dia > 28) {
					System.out.println("Día no válidoooooooo. Debe estar entre 1 y 28.");
					System.out.println("Ingrese el día en el siguiente formato dd: ");
		            diaN = teclado.nextInt();
		            dia=diaN;
				}
					return dia;
			}
		
		
	}
	
	
	
	
	