package com.mitocode.ejercicio4.modificadores;

public class Programa {
	
	public static void main(String[] args) {
		
		CuentaNegocio cuentaNegocio = new CuentaNegocio("10", "Cesar", 30.0, 500.0);
		
		double monto = 100.0;
		
		System.out.println(cuentaNegocio);
		cuentaNegocio.prestamo(monto);
		System.out.println(cuentaNegocio);
		
	}

}
