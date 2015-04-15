/**
 * Clase que recoge todo tipo de vehiculos
 */

package com.zubiri.parking;

import java.util.ArrayList;
import java.util.Scanner;

public class ParkingVehiculos {
	
	static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
	
	//Constructor 1
	public ParkingVehiculos() {}
	
	//Constructor 2
	public ParkingVehiculos(ArrayList<Vehiculo> v) {
		vehiculos=v;
	}
	
	//Constructor 3
	public ParkingVehiculos(Scanner sc) {
		System.out.println("¿Cuántos vehículos quieres rellenar?");
		int count=sc.nextInt();
		for (int i = 0; i < count; i++) {
			System.out.println("¿Qué quieres rellenar? (coche/vehiculo)");
			switch (sc.next()) {
			case "coche":
				vehiculos.add(new Coche(sc));
				break;

			case "bicicleta":
				vehiculos.add(new Bicicleta(sc));
				break;
			}
		}		
	}
	
	//Setter y getter
	public static void setVehiculos(ArrayList<Vehiculo> _vehiculos) {
		ParkingVehiculos.vehiculos = _vehiculos;
	}
	
	public static ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}
	
	//Método que añade un vehiculo de tipo coche
	public void addCoche(Coche coche) {
		vehiculos.add(coche);
	}
	
	//Método que añade un vehiculo de tipo bicicleta
	public void addCoche(Bicicleta bicicleta) {
		vehiculos.add(bicicleta);
	}
	
	//Método para añadir un vehiculo
	public void addVehiculo(Vehiculo v) {
		vehiculos.add(v);
	}
	
	//Método para eliminar un vehiculo
	public void deleteVehiculo(Vehiculo v) {
		vehiculos.remove(v);
	}
	
	//Método para buscar un vehiculo por número de ruedas
	public void findVehiculo(int ruedas) {
		int aux;
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculos.get(i).

		}
	}
	
	//Método para devolver un String formateado
	public String formattedParking() {
		String vehiculosformatted="=========== Parking de Vehiculos================\n";
		for (int i = 0; i < vehiculos.size(); i++) {
			vehiculosformatted+=vehiculos.get(i).formatted();
		}
		vehiculosformatted+="\n======================";
		return vehiculosformatted;
	}
	
	/*Método que obtiene valores de parkingvehiculos a partir de un String y un caracter separador.
	public void splitVehiculos(String vehiculosSt, char separator) {
		String [] arrayStrings=vehiculosSt.split(vehiculosSt.valueOf(separator));
		int i=0;
		while (i< arrayStrings.length) {
			
			this.addVehiculo();
			
		}
	}*/
	
}
