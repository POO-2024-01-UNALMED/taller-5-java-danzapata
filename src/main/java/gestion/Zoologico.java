package gestion;
import java.util.ArrayList;

public class Zoologico {
    // Atributos
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<> ();

    //constructores
    public Zoologico(String nombre, String ubicacion, Zona zona){
        this.nombre= nombre;
        this.ubicacion= ubicacion;
        this.zonas.add(zona);
    }

    public Zoologico(String nombre, String ubicacion){
        this.nombre= nombre;
        this.ubicacion= ubicacion;
    }

    public Zoologico(){

    }

    //setter y getter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }

    public void setUbicacion(String ubi){
        this.ubicacion = ubi;
    }
    
    public String getUbicacion(){
        return this.ubicacion;
    }

    public ArrayList<Zona> getZona(){
        return zonas;
    }
    //métodos
    public void agregarZonas(Zona zona){
        zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        int suma = 0;
        for (int i = 1; i<=zonas.size(); i++){
            suma = suma+zonas.get(i).cantidadAnimales();
        }
        return suma;
    }
    

}
