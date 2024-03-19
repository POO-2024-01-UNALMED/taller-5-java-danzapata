package zooAnimales;
import gestion.*;

public class Animal {
    //Atributos 
    private static int totalAnimales;
    private String nombre;
    private int edad;   
    private String habitat;
    private String genero;
    private Zona zona;

    //constructor
    public Animal(String nombre, int edad, String habitat,String genero){ 
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        totalAnimales++;
    }

    public Animal(){
        totalAnimales++;
    }

    //setter y gettter
    public Zona getZona(){
        return this.zona;
    }

    public void setZona(Zona zona){
        this.zona = zona;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setTotalAnimales(int total){
        Animal.totalAnimales = total;
    }

    public int getTotalAnimales(){
        return Animal.totalAnimales;
    }

    public void setedad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setHabitat(String habi){
        this.habitat = habi;
    }

    public String getHabitat(){
        return this.habitat;
    }

    public void setGenero(String gen){
        this.genero = gen;
    }

    public String getGenero(){
        return this.genero;
    }

    //métodos
    public static String totalPorTipo(){
        return "Mamiferos: "+Mamifero.cantidadMamiferos()+"\n"+
               "Aves: "+Ave.cantidadAves()+"\n"+
               "Reptiles: "+Reptil.cantidadReptiles()+"\n"+
               "Peces: "+Pez.cantidadPeces()+"\n"+
               "Anfibios: "+Anfibio.cantidadAnfibios();
    }

    public String toString(){
        if (getZona() != null){
            return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero+", la zona en la que me ubico es "+zona+", en el "+zona.getZoo();}
        else {
            return "Mi nombre es " + getNombre() + ", tengo una edad de "+ getEdad() + ", habito en "+ getHabitat()+ " y mi genero es " + getGenero();}
    }

    public String movimiento(){
        return "desplazarse";
    }


}
