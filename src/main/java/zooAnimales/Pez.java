package zooAnimales;
import java.util.*;
import gestion.*;

public class Pez extends Animal {
	private static List<Pez>listado=new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	Pez(String n,int e,String h,String g,Zona z, String ce,int ca){
		super(n,e,h,g,z);
		colorEscamas=ce;
		cantidadAletas=ca;
		listado.add(this);
	}
	public static List<Pez> getListado() {
		return listado;
	}
	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	Pez(){
		
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public void crearSalmon(String n,int e,String g) {
		new Pez(n,e,"oceano",g,null,"rojo",6);
		salmones++;
	}
	public void crearBacalao(String n,int e,String g) {
		new Pez(n,e,"oceano",g,null,"gris",6);
		bacalaos++;
	}
}