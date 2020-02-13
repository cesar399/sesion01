package com.mitocode.ejercicio1;

import java.util.Scanner;

public class programa {
	
	public static void main(String[] args) {
		//capturar datos
		Scanner sc= new Scanner(System.in);
		//ceando una instancia de la cuenta
		Cuenta cuenta;
		
		System.out.println("Ingrese numero de cuenta");
		String numeroCuenta = sc.nextLine();
		
		System.out.println("Ingrese el titular de la cuenta: ");
		String titular = sc.nextLine();
		
		System.out.println("Desea realizar un deposito inicial (y/n)? ");
		
		char respuesta = sc.nextLine().charAt(0);
		
		if (respuesta == 'y') {
			System.out.println("Ingrese el valor del deposito inicial: ");
			double monto = sc.nextDouble();
			
			cuenta = new Cuenta(numeroCuenta, titular, monto);
			
		}else {
			
			cuenta = new Cuenta(numeroCuenta, titular);
		}
		
		System.out.println("Datos de la cuenta: ");
		System.out.println(cuenta);
		//deposito
		System.out.println();
		System.out.println("Ingrese el valor de deposito: ");
		double monto = sc.nextDouble();
		cuenta.deposito(monto);
		System.out.println("Datos de la cuenta actualizados");
		System.out.println(cuenta);
		
		//retiro
		System.out.println();
		System.out.println("Ingrese el valor a retirar: ");
		double montoRetiro = sc.nextDouble();
		cuenta.retiro(montoRetiro);
		System.out.println("Datos de la cuenta actualizados");
		System.out.println(cuenta);
		
		sc.close();
		
		
		//cuenta.setNumeroCuenta(numeroCuenta);		
		
	}

}
