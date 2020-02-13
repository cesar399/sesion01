package com.mitocode.ejercicio2.staticos;

import java.util.Scanner;

public  class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		
		System.out.println("¿Cual es el precio del dolar");
		double precioDolar = sc.nextDouble();
		
		System.out.println("¿Cuantos dolares se compraran?");
		double monto = sc.nextDouble();
		
		//ConvertidorMoneda convertidor = new ConvertidorMoneda();
		
		double resultado = convertidor.dolarToNuevoSol(monto, precioDolar);
		System.out.println("Monto a pagar en soles: " + resultado);
		
		sc.close();
		
	}

}
