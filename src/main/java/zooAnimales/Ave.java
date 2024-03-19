package zooAnimales;
import java.util.ArrayList;


public class Ave extends Animal {
    //atributos
    private static ArrayList<Ave> listado = new ArrayList<> ();
    public static int halcones;  
    public static int aguilas;
    private String colorPlumas;

    //constructores
    public Ave(String nombre, int edad, String habitat,String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        listado.add(this);
    }

    public Ave(){
        listado.add(this);
    }

    //setter y getter
    public static int getListado(){
        return listado.size();
    }

    public void setColorPlumas(String color){
        this.colorPlumas = color;
    }
    
    public String getColorPlumas(){
        return this.colorPlumas;
    }

    //métodos
    @Override
    public String movimiento(){
        return "volar";
    }

    public static int cantidadAves(){
        return listado.size();
    }

    public static Ave crearHalcon(String nomb, int eda,String gen){
        Ave halcon = new Ave(nomb, eda, "montañas", gen, "cafe glorioso");
        halcones++;
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nomb, int eda,String gen){
        Ave halcon = new Ave(nomb, eda, "montañas", gen, "blanco y amarillo");
        halcones++;
        listado.add(halcon);
        return halcon;
    }

    
}
