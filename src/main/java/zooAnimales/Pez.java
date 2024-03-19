package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    //Atributos
    private static ArrayList<Pez> listado = new ArrayList<> ();
    public static int salmones;  
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    //constructores
    public Pez(String nombre, int edad, String habitat,String genero, String colorEscamas,int cantidadAletas){
        super(nombre, edad, habitat, genero);
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

    public static Pez crearSalmon(String nomb, int eda,String gen){
        Pez salmon = new Pez(nomb, eda, "oceano", gen, "rojo", 6);
        salmones++;
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nomb, int eda,String gen){
        Pez bacalao = new Pez(nomb, eda, "oceano", gen, "gris", 6);
        bacalaos++;
        listado.add(bacalao);
        return bacalao;
    }





}
