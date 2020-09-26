package zooAnimales;
import java.util.*;
import gestion.*;

public class Reptil extends Animal {
	private static List<Reptil>listado=new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public Reptil(String n,int e,String h,String g, String ce, int lc){
		super(n,e,h,g);
		colorEscamas=ce;
		largoCola=lc;
		listado.add(this);
	}
	public static List<Reptil> getListado() {
		return listado;
	}
	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	public Reptil(){
		listado.add(this);
		
	}
	public static int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public static Reptil crearIguana(String n,int e,String g) {
		iguanas++;
		return new Reptil(n,e,"humedal",g,"verda",3);
	}
	public static Reptil crearSerpiente(String n,int e,String g) {
		serpientes++;
		return new Reptil(n,e,"jungla",g,"blanco",1);
	}
}