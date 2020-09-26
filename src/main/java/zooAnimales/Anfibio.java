package zooAnimales;
import java.util.*;
import gestion.*;

public class Anfibio extends Animal {
	private static List<Anfibio>listado=new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	Anfibio(String n,int e,String h,String g,Zona z, String c,boolean v){
		super(n,e,h,g,z);
		colorPiel=c;
		venenoso=v;
		listado.add(this);
	}
	Anfibio(){
		
	}
	public static int cantidadAnfibios() {
		return listado.size();
	}
	public String movimiento() {
		return "saltar";
	}
	public static List<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	public void crearRana(String n,int e,String g) {
		new Anfibio(n,e,"salva",g,null,"rojo",true);
		ranas++;
	}
	public void crearSalamandra(String n,int e,String g) {
		new Anfibio(n,e,"salva",g,null,"negro y amarillo",false);
		salamandras++;
	}
}