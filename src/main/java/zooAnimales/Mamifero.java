package zooAnimales;
import java.util.*;
import gestion.*;

public class Mamifero extends Animal {
	private static List<Mamifero>listado=new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	Mamifero(String n,int e,String h,String g,Zona z, boolean pe,int pa){
		super(n,e,h,g,z);
		pelaje=pe;
		patas=pa;
		listado.add(this);
	}
	Mamifero(){
		
	}
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public void crearCaballo(String n,int e,String g) {
		new Mamifero(n,e,"pradera",g,null,true,4);
		caballos++;
	}
	public void crearLeon(String n,int e,String g) {
		new Mamifero(n,e,"selva",g,null,true,4);
		leones++;
	}
	public static List<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
}
