package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal {
    //Atributos
    private static ArrayList<Pez> listado = new ArrayList<> ();
    public int salmones;  
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    //constructores
    public Pez(String nombre, int edad, String habitat,String genero, Zona zona, String colorEscamas,int cantidadAletas){
        super(nombre, edad, habitat, genero, zona);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        listado.add(this);
    }

    public Pez(){
        listado.add(this);
    }

    //setter y getter
    public static int getListado(){
        return listado.size();
    }

    public void setColorEscamas(String color){
        this.colorEscamas = color;
    }

    public String getColorEscamas(){
        return this.colorEscamas;
    }

    public void setCantidadAletas(int cant){
        this.cantidadAletas = cant;
    }

    public int getCantidadAletas(){
        return this.cantidadAletas;
    }

    //métodos
    @Override
    public String movimiento(){
        return "nadar";
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    public Pez crearSalmon(String nomb, int eda,String gen, Zona zon){
        Pez salmon = new Pez(nomb, eda, "oceano", gen, zon, "rojo", 6);
        salmones++;
        listado.add(salmon);
        return salmon;
    }

    public Pez crearBacalao(String nomb, int eda,String gen, Zona zon){
        Pez bacalao = new Pez(nomb, eda, "oceano", gen, zon, "gris", 6);
        bacalaos++;
        listado.add(bacalao);
        return bacalao;
    }





}
