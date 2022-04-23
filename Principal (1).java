import java.util.ArrayList;
import java.util.Scanner;
class Principal {
    public static ArrayList<Zombies> zombies;
    public static void main(String[] args)
    {
        zombies = new ArrayList<Zombies>();
        mostrarMenu();
    }

    public static void mostrarMenu()
    {
        Scanner teclado = new Scanner(System.in);
        int validacion = 0;
        boolean ciclo = true;
        while (ciclo) {

            System.out.println("|-|-|-|-|-|-|BIENVENIDO AL MENÚ|-|-|-|-|-|-|-|-|");
            System.out.println("|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            System.out.println("|-|    0 PARA CERRAR EL MENU                 |-|");
            System.out.println("|-|    1 PARA CREAR UN ZOMBIE                |-|");
            System.out.println("|-|    2 INFORMACIÓN DE ZOMBIES ALMACENADOS  |-|");
            System.out.println("|-|    3 CANTIDAD DE ZOMBIES                 |-|");
            System.out.println("|-|    4 COMPARACIÓN DE TIPO DE SANGRE       |-|");
            System.out.println("|-|    5 ZOMBIES NACIDOS DESPUES DEL 2000    |-|");
            System.out.println("|-|    6 DISMINUCIÓN DE SALUD                |-|");
            System.out.println("|-|    7 CREAR UBICACIONES                   |-|");
            System.out.println("|-|    8 UBICACIONES ALMACENADAS             |-|");
            System.out.println("|-|    9 UBICACIÓN MÁS SEGURA DE LA CIUDAD   |-|");
            System.out.println("|-|    10 UBICACIÓN ORDENADA POR DISTANCIA   |-|");
            System.out.println("|-|    11 FRASE ALEATORIA                    |-|");
            System.out.println("|-|    12 MUESTRA UN ARMA DESIGNADA          |-|");
            System.out.println("|-|-|-|-|-|-|-|-||-|-|-|-|-|-|-|-|-|-|-|-|-|-|-|");
            validacion = teclado.nextInt();
          switch (validacion) {
    case 0:
        System.out.println("Gracias por participar en el programa");
        ciclo = false;
        break;
    case 1:
        System.out.print(" Ingrese un nombre para el zombie:");
        String n = teclado.next();
        System.out.print(" Ingrese cuanta vida desea (numerico):");
        int s = teclado.nextInt();
        System.out.print(" Ingrese fecha de nacimiento (numerico,años):");
        int fn = teclado.nextInt();
        System.out.print(" Ingrese tipo de sangre (segun el ejemplo (a+, b+, ...)):");
        String ts = teclado.next();
        Zombies zetaUno = new Zombies(n,s,fn,ts);
        Principal.zombies.add(zetaUno);
        System.out.println("    SE HA CREADO TU ZOMBIE CON EXITO ;)");
        System.out.println("_______");
        break;
    case 2:
        System.out.println("Los zombies almacenados son:");
        for(int i = 0; i < zombies.size(); i++)
        {
            System.out.println("");
            System.out.println("Zombie "+(i+1));
            System.out.println("Nombre del zombie: "+ zombies.get(i).getNombre());
            System.out.println("Salud del zombie: " + zombies.get(i).getSalud());
            System.out.println("Fecha de nacimiento del zombie: " + zombies.get(i).getFecha());
            System.out.println("Tipo de sangre del zombie: " + zombies.get(i).getTipo());
            System.out.println("_______");
        }
        break;
    case 3:
        System.out.println("el numero de zombies creados es: ");
        System.out.println(zombies.size());
        System.out.println("_______");
        break;
    case 4:
    String tipo = "O+";
    String tipoDos = "AB+";
    System.out.println("Los Zombies con tipo de sangre O+ y AB+ son:");
    for(int o = 0; o < zombies.size(); o++){
        String tipoSangre = zombies.get(o).getTipo().toUpperCase();
        if(tipoSangre.equals(tipo))
        {
            System.out.println("");
            System.out.println("Zombie "+(o+1));
            System.out.println("Nombre del zombie: "+ zombies.get(o).getNombre());
            System.out.println("Salud del zombie: " + zombies.get(o).getSalud());
            System.out.println("Fecha de nacimiento del zombie: " + zombies.get(o).getFecha());
            System.out.println("Tipo de sangre del zombie: " + zombies.get(o).getTipo());
        }
        else if(tipoSangre.equals(tipoDos))
        {
            System.out.println("");
            System.out.println("Zombie "+(o+1));
            System.out.println("Nombre del zombie: "+ zombies.get(o).getNombre());
            System.out.println("Salud del zombie: " + zombies.get(o).getSalud());
            System.out.println("Fecha de nacimiento del zombie: " + zombies.get(o).getFecha());
            System.out.println("Tipo de sangre del zombie: " + zombies.get(o).getTipo());
        }
    }
    System.out.println("_______");
    break;
                    case 5:
                    ArrayList<Zombies> zombies2000 = Zombies.nacer2000(zombies);
                    System.out.println("Los zombies nacidos despues del 2000 son");
                    for(int i = 0; i<zombies2000.size(); i++){
                    System.out.println("Nombre del zombie " + (i+1) + " " + zombies2000.get(i).getNombre());
    }
                    System.out.println("_______");
                    break;
                   case 6:
                   for(int a = 0; a < zombies.size(); a++)
                   {
                   int salud = zombies.get(a).getSalud();
                   salud = salud/2;
                   zombies.get(a).setSalud(salud);
                   }
                   System.out.println("La salud de los zombies se redujo a la mitad!");
                   System.out.println("_______");
                   break;
              case 7:
                    System.out.print(" Ingrese el nombre de la ciudad: ");
                    String nombreU = teclado.next();
                    System.out.print(" Ingrese la ubicacion con respecto a Alexandria : ");
                    int dist= teclado.nextInt();
                    System.out.print(" Ingrese la cantidad de zombies en la ciudad: ");
                    int cantZombies= teclado.nextInt();
                    Ubicacion ub1 = new Ubicacion(nombreU, dist, cantZombies);
                    Ubicacion.menorCantZombies(ub1);
                    System.out.println("_______");
                    break;
                case 8:
                    System.out.println("las Ciudades almacenadas son:");
                    for (Ubicacion u: Ubicacion.ubicaciones)
                    {
                        System.out.println("Nombre Ciudad: " + u.getNombreU());
                        System.out.println("Distancia: " + u.getDistanciaA());
                        System.out.println("Cantidad de zombies : " + u.getCantZombies());
                        System.out.println("___");
                    }
                    System.out.println("_______");
                    break;
                case 9:
                    int cant = 100000;
                    Ubicacion segura = Ubicacion.ubicaciones.get(0);
                    for (int i = 0; i<Ubicacion.ubicaciones.size();i++)
                    {
                        if (Ubicacion.ubicaciones.get(i).getCantZombies() <= cant);
                        {
                            segura = Ubicacion.ubicaciones.get(i);
                        }
                    }
                    System.out.println("La ciudad mas segura es:");
                    System.out.println("Nombre Ciudad: " + segura.getNombreU());
                    System.out.println("Distancia: " + segura.getDistanciaA());
                    System.out.println("Cantidad de Zombies: " + segura.getCantZombies());
                    break;
                case 10:
                    Ubicacion[] ubiAlejandria = Ubicacion.distanciaAlexandria(Ubicacion.ubicaciones);
                    System.out.println("Ubicaciones mas cercanas a Alexandria:");
                    for (int i = 0; i<ubiAlejandria.length;i++){
                        System.out.println("Nombre Ciudad: " + ubiAlejandria[i].getNombreU());
                        System.out.println("Distancia: " + ubiAlejandria[i].getDistanciaA());
                        System.out.println("Cantidad de Zombies: " + ubiAlejandria[i].getCantZombies());
                    }
                    System.out.println("_______");
                    break;
                case 11:
                    int numeroFrase = (int)(Math.random()*5+1);
                    System.out.println("La frase aleatoria es:" + Zombies.frases(numeroFrase));
                    System.out.println("_______");
                    break;
                case 12:
                    int arArma = (int)(Math.random()*8+1);
                    System.out.println("Tu arma designanda para atacar es: " + Zombies.arma(arArma));
                    System.out.println("_______");
                    break;
            }
        }
    }
}