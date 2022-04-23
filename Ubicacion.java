import java.util.ArrayList;
import java.util.Collections;
public class Ubicacion
{
    private String nombreU;
    private int distanciaA;
    private int cantZombies;
    static ArrayList<Ubicacion> ubicaciones = new ArrayList();
    public Ubicacion(String nombreU, int distanciaA, int cantZombies)
    {
        this.nombreU = nombreU;
        this.distanciaA = distanciaA;
        this.cantZombies = cantZombies;
    }

    public static void menorCantZombies(Ubicacion ubi)
    {
        ubicaciones.add(ubi);
    }

    public static Ubicacion[] distanciaAlexandria(ArrayList<Ubicacion> ubicaciones)
    {
        Ubicacion[] ubiAlexandria = new Ubicacion[ubicaciones.size()];
        for(int i = 0; i<ubicaciones.size(); i++){
            ubiAlexandria[i] = ubicaciones.get(i);
        }
        for (int i = 0; i < ubiAlexandria.length; i++) {
            for (int j = 1; j < (ubiAlexandria.length - i); j++) {
                if (ubiAlexandria[j - 1].getDistanciaA() > ubiAlexandria[j].getDistanciaA()) {
                    Ubicacion temporal = ubiAlexandria[j - 1];
                    ubiAlexandria[j - 1] = ubiAlexandria[j];
                    ubiAlexandria[j] = temporal;
                }
            }
        }
        return ubiAlexandria;
    }

    public String getNombreU()
    {
        return this.nombreU;
    }

    public void setNombre(String nombreU)
    {
        this.nombreU = nombreU;
    }

    public int getDistanciaA()
    {
        return distanciaA;
    }

    public void setDistanciaA(int distanciaA)
    {
        this.distanciaA = distanciaA;
    }

    public int getCantZombies()
    {
        return cantZombies;
    }

    public void setCantZombies(int cantZombies)
    {
        this.cantZombies = cantZombies;
    }

    public static ArrayList<Ubicacion> mostrarUbi()
    {
        return ubicaciones;
    }
}