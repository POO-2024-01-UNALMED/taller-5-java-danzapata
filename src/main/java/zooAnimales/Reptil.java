package zooAnimales;
import java.util.ArrayList;


public class Reptil extends Animal {
    //Atributos
    private static ArrayList<Reptil> listado = new ArrayList<> ();
    public static int iguanas;  
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    //constructores
    public Reptil(String nombre, int edad, String habitat,String genero, String colorEscamas,int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        listado.add(this);
    }

    public Reptil(){
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

    public void setLargoCola(int largo){
        this.largoCola = largo;
    }
    
    public int getLargoCola(){
        return this.largoCola;
    }

    //métodos
    @Override
    public String movimiento(){
        return "reptar";
    }
    
    public static int cantidadReptiles(){
        return listado.size();
    }
    
    public static Reptil crearIguana(String nomb, int eda,String gen){
        Reptil iguana = new Reptil(nomb, eda, "humedal", gen,  "verde", 3);
        iguanas++;
        listado.add(iguana);
        return iguana;
    }
    
    public static Reptil crearSerpiente(String nomb, int eda,String gen){
        Reptil serpiente = new Reptil(nomb, eda, "jungla", gen, "blanco", 1);
        serpientes++;
        listado.add(serpiente);
        return serpiente;
    }


    
}
