package zooAnimales;
import java.util.*;
import gestion.*;

public class Reptil extends Animal {
	private static List<Reptil>listado=new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	Reptil(String n,int e,String h,String g,Zona z, String ce, int lc){
		super(n,e,h,g,z);
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
	Reptil(){
		
	}
	public static int cantidadReptiles() {
		return listado.size();
	}
	public String movimiento() {
		return "reptar";
	}
	public void crearIguana(String n,int e,String g) {
		new Reptil(n,e,"humedal",g,null,"verda",3);
		iguanas++;
	}
	public void crearSerpiente(String n,int e,String g) {
		new Reptil(n,e,"jungla",g,null,"blanco",1);
		serpientes++;
	}
}