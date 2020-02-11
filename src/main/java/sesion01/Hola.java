package sesion01;

import java.util.Scanner;

public class Hola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//imprimir mensaje
		System.out.println("Bienvenido al curso");
		
		//capturar mensajes de consola
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿cual es el nombre?");
		
		String nombre = sc.nextLine();
		System.out.println("Bienvendio " + nombre);
		
		sc.close();
	}

}
