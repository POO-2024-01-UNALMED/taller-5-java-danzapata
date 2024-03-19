package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal {
    //Atributos
    private static ArrayList<Mamifero> listado = new ArrayList<> ();
    public int caballos;  
    public int leones;
    private boolean pelaje;
    private int patas;

    //constructores
    public Mamifero(String nombre, int edad, String habitat,String genero, Zona zona, boolean pelaje,int patas){
        super(nombre, edad, habitat, genero, zona);
        this.pelaje = pelaje;
        this.patas = patas;
        listado.add(this);
    }

    public Mamifero(){
        listado.add(this);
    }

    //setter y getter
    public static int getListado(){
        return listado.size();
    }

    public void setPelaje(boolean pelo){
        this.pelaje = pelo;
    }

    public boolean getPelaje(){
        return this.pelaje;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }

    public int getPatas(){
        return this.patas;
    }

    //métodos
    public static int cantidadMamiferos(){
        return listado.size();
    }

    public Mamifero crearCaballo(String nomb, int eda,String gen, Zona zon){
        Mamifero caballo = new Mamifero(nomb, eda, "pradera", gen, zon, true, 4);
        caballos++;
        listado.add(caballo);
        return caballo;
    }

    public Mamifero crearLeon(String nomb, int eda,String gen, Zona zon){
        Mamifero leon = new Mamifero(nomb, eda, "selva", gen, zon, true, 4);
        leones++;
        listado.add(leon);
        return leon;
    }

}

