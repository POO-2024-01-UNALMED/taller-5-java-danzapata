package zooAnimales;
import java.util.ArrayList;


public class Mamifero extends Animal {
    //Atributos
    private static ArrayList<Mamifero> listado = new ArrayList<> ();
    public static int caballos;  
    public static int leones;
    private boolean pelaje;
    private int patas;

    //constructores
    public Mamifero(String nombre, int edad, String habitat,String genero, boolean pelaje,int patas){
        super(nombre, edad, habitat, genero);
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

    public boolean isPelaje(){
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

    public static Mamifero crearCaballo(String nomb, int eda,String gen){
        Mamifero caballo = new Mamifero(nomb, eda, "pradera", gen, true, 4);
        caballos++;
        listado.add(caballo);
        return caballo;
    }

    public static Mamifero crearLeon(String nomb, int eda,String gen){
        Mamifero leon = new Mamifero(nomb, eda, "selva", gen, true, 4);
        leones++;
        listado.add(leon);
        return leon;
    }

}

