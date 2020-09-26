package zooAnimales;

import java.util.*;
import gestion.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitad;
	private String genero;
	private Zona zona;
	Animal(String n,int e,String h,String g,Zona z){
		nombre=n;
		edad=e;
		habitad=h;
		genero=g;
		zona=z;
	}
	Animal(){
		
	}
	public void totalPorTipo() {
		System.out.println("Mamiferos: "+zooAnimales.Mamifero.cantidadMamiferos()+"\n"
				+ "Aves: "+ zooAnimales.Ave.cantidadAves() + "\n"
				+ "Reptiles: "+ zooAnimales.Reptil.cantidadReptiles() + "\n"
				+ "Peces: "+ zooAnimales.Pez.cantidadPeces() + "\n"
				+ "Anfibios: "+ zooAnimales.Anfibio.cantidadAnfibios());
	}
	public String movimiento() {
		return "desplazarse";
	}
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitad() {
		return habitad;
	}
	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public String toString() {
		if (this.zona==null) {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitad+" y mi genero es "+this.genero;
		}
		else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitad+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona+", en el "+this.zona.getZoo();
		}
	}

}
