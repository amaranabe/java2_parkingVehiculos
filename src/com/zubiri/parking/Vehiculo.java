/**
 * Clase que define Vehiculo
 */
package com.zubiri.parking;

import java.util.Scanner;

public abstract class Vehiculo {

	int numRuedas = 0;
	boolean motor = false;
	String marca = null;

	//Constructor 1
	public Vehiculo(int _numRuedas, boolean _motor, String _marca) {
		// TODO Auto-generated constructor stub
		this.numRuedas=_numRuedas;
		this.motor=_motor;
		this.marca=_marca;
	}
	
	//Constructor 2
	public Vehiculo(Scanner sc) {
		System.out.println("Introduce número de ruedas: ");
		this.setNumRuedas(sc.nextInt());
		System.out.println("¿Tiene motor? (si/no)");
			switch (sc.next()) {
			case "si":
				this.setMotor(true);
				break;
			case "no":
				this.setMotor(false);
				break;
			}
		System.out.println("Introduce marca del vehiculo: ");
		this.setMarca(sc.next());
	}
	
	//Métodos getter y setter
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	public boolean getMotor() {
		return motor;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getMarca() {
		return marca;
	}
	
	abstract String tipoVehiculo();
				
	//Método que devuelve un String formateado
	public String formatted() {
		String formatted = null;
		formatted="Número de ruedas: "+getNumRuedas()+"\n";
			if (motor==true) {
				formatted+="Motor: Sí\n";
			}
			else {
				formatted+="Motor: No\n";
			}
		formatted+="Marca: "+getMarca();
		return formatted;
	}
}
