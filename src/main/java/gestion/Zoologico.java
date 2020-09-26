package gestion;
import java.util.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas= new ArrayList<Zona>();
	Zoologico(String n,String u, List<Zona> z){
		nombre=n;
		ubicacion=u;
		zonas=z;
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
	public List<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}
	Zoologico(){
		
	}
	public void agregarZonas(Zona z) {
		zonas.add(z);
	}
	public int cantidadTotalAnimales() {
		int total=0;
		for (int i=0; i<zonas.size();i++) {
			Zona z= zonas.get(i);
			total+= z.cantidadAnimales();
		}
		return total;
	}
}