/**
 * Clase que define Bicicleta
 */
package com.zubiri.parking;

import java.util.Scanner;


public final class Bicicleta extends Vehiculo {

	//Atributos
	int numPiñones = 0;
	String tipo = null; //Donde los tipos posibles son "montaña", "paseo" o "carreras"
	
	//Constructor 1
	public Bicicleta(int _numRuedas, boolean _motor, String _marca, int _numPiñones, String _tipo) {
		super(_numPiñones, _motor, _marca);
		this.numPiñones=_numPiñones;
		this.tipo=_tipo;
	}
	
	//Constructor 2
	public Bicicleta(Scanner sc) {
		super(sc);
		System.out.println("Introduce número de piñones: ");
		this.setNumPiñones(sc.nextInt());
		System.out.println("Introduce tipo de bicicleta: (montaña/paseo/carrera)");
		this.setTipo(sc.next());
	}
	
	//Métodos getter y setter
	public void setNumPiñones(int numPiñones) {
		this.numPiñones = numPiñones;
	}
	
	public int getNumPiñones() {
		return numPiñones;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
			
	//Método formatted
	@Override
	public String formatted() {
		String bicicletaformatted=
				super.formatted()+
				"Número de piñones: "+getNumPiñones()+"\n"+
				"Tipo: "+getTipo();
		return bicicletaformatted;
	}
		
	//Método que obtiene valores de coche a partir de un String y un caracter separador.
    public void split(String bicicletaString, char separator) {
    	String [] arrayStrings=bicicletaString.split(bicicletaString.valueOf(separator));
    	this.setNumRuedas(Integer.parseInt(arrayStrings[0]));
    	this.setMotor(Boolean.parseBoolean(arrayStrings[1]));
    	this.setMarca(arrayStrings[2]);
    	this.setNumPiñones(Integer.parseInt(arrayStrings[3]));
    	this.setTipo(arrayStrings[4]);    	
	}
    
	//Metodo que me devuelve un string para identificar tipo vehiculo
	@Override
	public String tipoVehiculo() {
		return "bicicleta";
	}
	
}
