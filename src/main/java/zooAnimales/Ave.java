package zooAnimales;
import java.util.*;
import gestion.*;

public class Ave extends Animal {
	private static List<Ave>listado=new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	public Ave(String n,int e,String h,String g, String c){
		super(n,e,h,g);
		colorPlumas=c;
		listado.add(this);
	}
	public Ave(){
		listado.add(this);
		
	}
	public static int cantidadAves() {
		return listado.size();
	}
	public String movimiento() {
		return "volar";
	}
	public static Ave crearHalcon(String n,int e,String g) {
		halcones++;
		return new Ave(n,e,"montañas",g,"cafe glorioso");
	}
	public static Ave crearAguila(String n,int e,String g) {
		aguilas++;
		return new Ave(n,e,"montanas",g,"blanco y amarillo");
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


