package zooAnimales;
import java.util.*;
import gestion.*;

public class Mamifero extends Animal {
	private static List<Mamifero>listado=new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public Mamifero(String n,int e,String h,String g, boolean pe,int pa){
		super(n,e,h,g);
		pelaje=pe;
		patas=pa;
		listado.add(this);
	}
	public Mamifero(){
		listado.add(this);
		
	}
	public static int cantidadMamiferos() {
		return listado.size();
	}
	public static Mamifero crearCaballo(String n,int e,String g) {
		caballos++;
		return new Mamifero(n,e,"pradera",g,true,4);
		}
	public static Mamifero crearLeon(String n,int e,String g) {
		leones++;
		return new Mamifero(n,e,"selva",g,true,4);
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
