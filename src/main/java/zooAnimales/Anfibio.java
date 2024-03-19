package zooAnimales;
import java.util.ArrayList;


public class Anfibio extends Animal {
    //atributos
    private static ArrayList<Anfibio> listado = new ArrayList<> ();
    public static int ranas;  
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    //constructores
    public Anfibio(String nombre, int edad, String habitat,String genero, String colorPiel,boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        listado.add(this);
    }

    public Anfibio(){
        listado.add(this);
    }

    //setter y getter
    public static int getListado(){
        return listado.size();
    }

    public void setColorPiel(String colorPiel){
        this.colorPiel = colorPiel;
    }

    public String getColorPiel(){
        return this.colorPiel;
    }

    public void setVenenoso(boolean ven){
        this.venenoso = ven;
    }

    public boolean isVenenoso(){
        return this.venenoso;
    }

    //métodos
    @Override
    public String movimiento(){
        return "saltar";
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }
    
    public static Anfibio crearRana(String nomb, int eda,String gen){
        Anfibio rana = new Anfibio(nomb, eda, "selva", gen, "rojo", true);
        ranas++;
        listado.add(rana);
        return rana;
    }
    
    public static Anfibio crearSalamandra(String nomb, int eda,String gen){
        Anfibio salamandra = new Anfibio(nomb, eda, "selva", gen, "negro y amarillo", false);
        salamandras++;
        listado.add(salamandra);
        return salamandra;
    }


}
