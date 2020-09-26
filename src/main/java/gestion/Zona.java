package gestion;
import zooAnimales.*;
import java.util.*;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private List<Animal> animales= new ArrayList<Animal>();
	public Zona(String n,Zoologico z){
		nombre=n;
		zoo=z;
	}
	public Zona(){
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	public List<Animal> getAnimales() {
		return animales;
	}
	public void setAnimales(List<Animal> animales) {
		this.animales = animales;
	}
	public void agregarAnimales(Animal a) {
		animales.add(a);
		a.setZona(this);
	}
	public int cantidadAnimales() {
		return animales.size();
	}

}
