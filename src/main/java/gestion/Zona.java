package gestion;
import java.util.ArrayList;
import zooAnimales.*;

public class Zona {
    // atributos
    private String nombre;
    private Zoologico zoo;
    private ArrayList<Animal> animales = new ArrayList<> ();

    //constructores
    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo = zoo;
    }

    public Zona(){    
    }

    //setter y getter
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setZoo(Zoologico zoo){
        this.zoo = zoo;
    }

    public Zoologico getZoo(){
        return this.zoo;
    }

    //métodos
    public void agregarAnimales(Animal animal){
        animales.add(animal);
    }

    public int cantidadAnimales(){
        return animales.size();
    }



}
