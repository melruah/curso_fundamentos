import java.util.ArrayList;
public class Zombies
{
    private String nombre;
    private int salud;
    private int fechaNacimiento;
    private String tipoSangre;
    public static ArrayList<Zombies> nacer2000(ArrayList<Zombies> zombies)
    {
        ArrayList<Zombies> zombies2000 = new ArrayList<Zombies>();
        for(int i = 0; i<zombies.size();i++)
        {
            if(zombies.get(i).getFecha() > 2000)
            {
                zombies2000.add(zombies.get(i));
            }
        }
        return zombies2000;
    }

    public static String frases(int numero)
    {
        String[] frases = new String[5];
        frases[0] = "Cada ser humano que salvamos es un zombi menos que combatir.";
        frases[1] = "Viven para la noche, viven para matar, y ... viven siempre.";
        frases[2] = "¡No pienso seguir hablando hasta que no te coloques la cabeza!";
        frases[3] = "¡Odio los zombies, nunca juegan limpio!";
        frases[4] = "los zombies están al poder";
        return frases[numero-1];
    }

    public static String arma (int ar)
    {
        String[] arma = new String[8];
        arma[0] = "escopeta";
        arma[1] = "navaja";
        arma[2] = "pistola de corto alcance";
        arma[3] = "fúsil de presión";
        arma[4] = "metralleta";
        arma[5] = "ametralladora";
        arma[6] = "fúsil automatico";
        arma[7] = "puño";
        return arma[ar-1];
    }

    public Zombies(String n, int s, int fn, String ts)
    {
        this.nombre=n;
        this.salud=s;
        this.fechaNacimiento=fn;
        this.tipoSangre=ts;
    }

    public String getNombre()
    {
        return this.nombre;
    }

    public int getSalud()
    {
        return this.salud;
    }

    public int getFecha()
    {
        return this.fechaNacimiento;
    }

    public String getTipo()
    {
        return this.tipoSangre;
    }

    public void setNombre(String n)
    {
        this.nombre = n;
    }

    public void setSalud(int s)
    {
        this.salud = s;
    }

    public void setFecha(int fn)
    {
        this.fechaNacimiento = fn;
    }

    public void setTipo(String ts)
    {
        this.tipoSangre = ts;
    }
}