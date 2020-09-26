package gestion;
import java.util.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zona= new ArrayList<Zona>();
	public Zoologico(String n,String u){
		nombre=n;
		ubicacion=u;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Zona> getZona() {
		return zona;
	}
	public void setZona(List<Zona> zona) {
		this.zona = zona;
	}
	public Zoologico(){
		
	}
	public void agregarZonas(Zona z) {
		zona.add(z);
	}
	public int cantidadTotalAnimales() {
		int total=0;
		for (int i=0; i<zona.size();i++) {
			Zona z= zona.get(i);
			total+= z.cantidadAnimales();
		}
		return total;
	}
}