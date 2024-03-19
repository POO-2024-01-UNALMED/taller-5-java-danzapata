package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal {
    //atributos
    private static ArrayList<Ave> listado = new ArrayList<> ();
    public int halcones;  
    public int aguilas;
    private String colorPlumas;

    //constructores
    public Ave(String nombre, int edad, String habitat,String genero, Zona zona, String colorPlumas){
        super(nombre, edad, habitat, genero, zona);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave(){
        listado.add(this);
    }

    //setter y getter
    public static int getListado(){
        return listado.size();
    }

    public void setColorPlumas(String color){
        this.colorPlumas = color;
    }
    
    public String getColorPlumas(){
        return this.colorPlumas;
    }

    //métodos
    @Override
    public String movimiento(){
        return "volar";
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public Ave crearHalcon(String nomb, int eda,String gen, Zona zon){
        Ave halcon = new Ave(nomb, eda, "montañas", gen, zon, "cafe glorioso");
        halcones++;
        listado.add(halcon);
        return halcon;
    }

    public Ave crearAguila(String nomb, int eda,String gen, Zona zon){
        Ave halcon = new Ave(nomb, eda, "montañas", gen, zon, "blanco y amarillo");
        halcones++;
        listado.add(halcon);
        return halcon;
    }

    
}
