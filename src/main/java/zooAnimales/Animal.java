package zooAnimales;

import java.util.*;
import gestion.*;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	public Animal(String n,int e,String h,String g){
		nombre=n;
		edad=e;
		habitat=h;
		genero=g;
	}
	public Animal(){
		
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+zooAnimales.Mamifero.cantidadMamiferos()+"\n"
				+ "Aves: "+ zooAnimales.Ave.cantidadAves() + "\n"
				+ "Reptiles: "+ zooAnimales.Reptil.cantidadReptiles() + "\n"
				+ "Peces: "+ zooAnimales.Pez.cantidadPeces() + "\n"
				+ "Anfibios: "+ zooAnimales.Anfibio.cantidadAnfibios();
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
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitad) {
		this.habitat = habitad;
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
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero;
		}
		else {
			return "Mi nombre es "+this.nombre+", tengo una edad de "+this.edad+", habito en "+this.habitat+" y mi genero es "+this.genero+", la zona en la que me ubico es "+this.zona+", en el "+this.zona.getZoo();
		}
	}

}
