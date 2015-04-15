/**
 * Clase que define Coche
 */
package com.zubiri.parking;

import java.util.Scanner;

public class Coche extends Vehiculo {

	boolean automatico = false;
	int consumo100km = 0;
	
	//Constructor 1
	public Coche(int _numRuedas, boolean _motor, String _marca, boolean _automatico, int _consumo100km) {
		super(_numRuedas,_motor, _marca);
		this.automatico=_automatico;
		this.consumo100km=_consumo100km;
	}
	
	//Constructor 2
	public Coche (Scanner sc) {
		super(sc);
		System.out.println("¿Es automático? (si/no)");
			switch (sc.next()) {
			case "si":
				this.setAutomatico(true);
				break;
			case "no":
				this.setAutomatico(false);
				break;
			}
		System.out.println("Introduce el consumo de 100km");
		this.setConsumo100km(sc.nextInt());
	}
	
	//Métodos getter y setter
	public void setAutomatico(boolean automatico) {
		this.automatico = automatico;
	}
	
	public boolean getAutomatico() {
		return this.automatico;
	}
	
	public void setConsumo100km(int consumo100km) {
		this.consumo100km = consumo100km;
	}
	
	public int getConsumo100km() {
		return this.consumo100km;
	}
				
	//Método que calcula el consumo por kilometros
    public double calcConsumo(int numKm, double precioGasoil) {
    	
    	double consumoTotal = 0;
    	consumoTotal=precioGasoil*numKm;    	
    	return consumoTotal;
    }
    
    //Método que calcula el consumo por 100km
    public int calculaConsumo100(double consumoTotal) {
    	consumo100km=(int) (consumoTotal*100);
    	return consumo100km;
    }
    
    //Método formatted
    @Override
    public String formatted() {
    	String cocheformatted=super.formatted();
    			if (getAutomatico() == true) {
					cocheformatted+="Automatico: si\n";
				}
    			else {
					cocheformatted+="Automatico: no\n";
				}
    	cocheformatted+="Consumo por 100 km: "+getConsumo100km();
    	return cocheformatted;
    }

	
	//Método que obtiene valores de coche a partir de un String y un caracter separador.
    public void split(String cocheString, char separator) {
    	String [] arrayStrings=cocheString.split(cocheString.valueOf(separator));
    	this.setNumRuedas(Integer.parseInt(arrayStrings[0]));
    	this.setMotor(Boolean.parseBoolean(arrayStrings[1]));
    	this.setMarca(arrayStrings[2]);
    	this.setAutomatico(Boolean.parseBoolean(arrayStrings[3]));
    	this.setConsumo100km(Integer.parseInt(arrayStrings[4]));
    	
	}
    
    
	//Metodo que me devuelve un string para identificar tipo vehiculo
	@Override
    public String tipoVehiculo() {
		return "coche";
	}
    
    
}
