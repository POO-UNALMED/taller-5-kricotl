package zooAnimales;
import java.util.*;
import gestion.*;

public class Pez extends Animal {
	private static List<Pez>listado=new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public Pez(String n,int e,String h,String g, String ce,int ca){
		super(n,e,h,g);
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
	public Pez(){
		listado.add(this);
		
	}
	public static int cantidadPeces() {
		return listado.size();
	}
	public String movimiento() {
		return "nadar";
	}
	public static Pez crearSalmon(String n,int e,String g) {
		salmones++;
		return new Pez(n,e,"oceano",g,"rojo",6);
		}
	public static Pez crearBacalao(String n,int e,String g) {
		bacalaos++;
		return new Pez(n,e,"oceano",g,"gris",6);
	}
}