package zooAnimales;
import java.util.*;
import gestion.*;

public class Ave extends Animal {
	private static List<Ave>listado=new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	Ave(String n,int e,String h,String g,Zona z, String c){
		super(n,e,h,g,z);
		colorPlumas=c;
		listado.add(this);
	}
	Ave(){
		
	}
	public static int cantidadAves() {
		return listado.size();
	}
	public String movimiento() {
		return "volar";
	}
	public void crearHalcon(String n,int e,String g) {
		new Ave(n,e,"montañas",g,null,"cafe glorioso");
		halcones++;
	}
	public void crearAguila(String n,int e,String g) {
		new Ave(n,e,"montanas",g,null,"blanco y amarillo");
		aguilas++;
	}
	public static List<Ave> getListado() {
		return listado;
	}
	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
}


