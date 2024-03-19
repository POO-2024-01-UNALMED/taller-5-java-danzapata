package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Reptil extends Animal {
    //Atributos
    private static ArrayList<Reptil> listado = new ArrayList<> ();
    public int iguanas;  
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    //constructores
    public Reptil(String nombre, int edad, String habitat,String genero, Zona zona, String colorEscamas,int largoCola){
        super(nombre, edad, habitat, genero, zona);
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
    
    public Reptil crearIguana(String nomb, int eda,String gen, Zona zon){
        Reptil iguana = new Reptil(nomb, eda, "humedal", gen, zon, "verde", 3);
        iguanas++;
        listado.add(iguana);
        return iguana;
    }
    
    public Reptil crearSerpiente(String nomb, int eda,String gen, Zona zon){
        Reptil serpiente = new Reptil(nomb, eda, "jungla", gen, zon, "blanco", 1);
        serpientes++;
        listado.add(serpiente);
        return serpiente;
    }


    
}
