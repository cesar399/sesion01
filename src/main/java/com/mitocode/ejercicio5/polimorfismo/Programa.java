package com.mitocode.ejercicio5.polimorfismo;

public class Programa {
	
	public static void main(String[] args) {
		
//		Cuenta cuenta1 = new Cuenta("10", "Cesar", 0.0);
//		System.out.println(cuenta1);
//		
//		Cuenta cuenta2 = new CuentaNegocio("11", "Cesar2", 100.0, 500.0);//esto se conoce como upcasting
//		System.out.println(cuenta2);
		//del lado de la izquierda debe estar la super clase y de la derecha las subclases
		
		//CuentaNegocio cuenta3 = new cuenta();//no se debe hacer
		
		//asignacion ordinaria
//		CuentaNegocio cuentaNegocio = new CuentaNegocio("12", "cesar 4", 0.0, 500.0);
//		System.out.println(cuentaNegocio);
//		Cuenta cuenta4 = cuentaNegocio;
//		System.out.println(cuenta4);
		
		Cuenta cuenta5 = new CuentaNegocio("13", "cesar", 0.0, 200.0);
		Cuenta cuenta6 = new CuentaNegocio("14", "cesar", 50.0, 100.0);
		
		System.out.println(cuenta6.getClass());//asi sabemos a que clase pertenece
		//downcasting
		//CuentaNegocio cuenta7 = (CuentaNegocio)cuenta5;//se coloca el parentesis y se llama a la clase que se esta aasignando
		
		if(cuenta6 instanceof CuentaNegocio) {//aqui se valida la clase a la que pertenece
			System.out.println("ok");
			CuentaNegocio cuenta7 = (CuentaNegocio)cuenta6;
			cuenta7.prestamo(100);//el prestamo debe ser mayor a lo que resta el prestamo en este caso 10
			System.out.println(cuenta7);
		}
	}

}
