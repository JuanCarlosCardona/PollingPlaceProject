package programaI;

import programaII.CiudadanoHash;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Ciudadano implements Comparable, ProgramMethods
{
    private long noINE;
    private String nombre;
    private String partido;

    private TreeSet<Ciudadano> votantesInfo = new TreeSet<>();

    public Ciudadano(long noINE, String nombre, String partido)
    {
        this.setNoINE(noINE);
        this.setNombre(nombre);
        this.setPartido(partido);
    }

    public Ciudadano() {}

    public static int menu()
    {
        int op;
        String[] opciones = {"C1", "C2", "C7", "C8", "C9", "S"};

           op = JOptionPane.showOptionDialog(null, """
                   C1.- Casilla 1
                   C2.- Casilla 2
                   C7.- Casilla 7
                   C8.- Casilla 8
                   C9.- Casilla 9
                   S.- Salir del programa""","Registro de Casillas",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        return op;
    }

    public static void process()
    {
        File file;
        Ciudadano ciudadano = new Ciudadano();
        boolean isRunning = true;
        Scanner scanner;
        ArrayList<Long> ines = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>(), partidos = new ArrayList<>();


        String path = ",", text = "",textVotantes = "";
        String[] fileinfo = null;


       try
       {
           while(isRunning)
           {
               switch (menu())
               {
                   case 0:
                       long t1 = System.currentTimeMillis();
                       clearData(ciudadano.getVotantesInfo(),ines,nombres,partidos,fileinfo);
                       textVotantes = "";
                       text = "";
                       file = new File("C:/Users/marcu/OneDrive/Documentos/Estructura de Datos/Casilla1.txt");
                       scanner = new Scanner(file);
                       while(scanner.hasNextLine())
                       {
                           text += scanner.nextLine() + "\n";
                       }

                       text = text.replace("\n", ",");
                       fileinfo = text.split(path);

                       exploreData(ines, nombres, partidos, fileinfo);
                       for(int k = 0; k < ines.size();k++)
                           ciudadano.addToTreeSet(ines.get(k),nombres.get(k),partidos.get(k));

                       for (Ciudadano elemento : ciudadano.getVotantesInfo()) {
                           textVotantes += elemento.toString() + "\n";
                       }

                       long t2 = System.currentTimeMillis();
                       System.out.println((t2 - t1) + " ms");
                       JOptionPane.showMessageDialog(null,textVotantes,"Casilla 1", JOptionPane.INFORMATION_MESSAGE);
                       break;

                   case 1:
                       clearData(ciudadano.getVotantesInfo(),ines,nombres,partidos,fileinfo);
                       textVotantes = "";
                       text = "";
                       file = new File("C:/Users/marcu/OneDrive/Documentos/Estructura de Datos/Casilla2.txt");
                       scanner = new Scanner(file);
                       while(scanner.hasNextLine())
                       {
                           text += scanner.nextLine() + "\n";
                       }

                       text = text.replace("\n", ",");
                       fileinfo = text.split(path);

                       exploreData(ines, nombres, partidos, fileinfo);

                       for(int k = 0; k < ines.size();k++)
                           ciudadano.addToTreeSet(ines.get(k),nombres.get(k),partidos.get(k));

                       for (Ciudadano elemento : ciudadano.getVotantesInfo()) {
                           textVotantes += elemento.toString() + "\n";
                       }

                       JOptionPane.showMessageDialog(null,textVotantes,"Casilla 2", JOptionPane.INFORMATION_MESSAGE);
                       break;

                   case 2:
                       clearData(ciudadano.getVotantesInfo(),ines,nombres,partidos,fileinfo);
                       textVotantes = "";
                       text = "";
                       file = new File("C:/Users/marcu/OneDrive/Documentos/Estructura de Datos/Casilla7.txt");
                       scanner = new Scanner(file);
                       while(scanner.hasNextLine())
                       {
                           text += scanner.nextLine() + "\n";
                       }

                       text = text.replace("\n", ",");
                       fileinfo = text.split(path);

                       exploreData(ines, nombres, partidos, fileinfo);

                       for(int k = 0; k < ines.size();k++)
                           ciudadano.addToTreeSet(ines.get(k),nombres.get(k),partidos.get(k));

                       for (Ciudadano elemento : ciudadano.getVotantesInfo()) {
                           textVotantes += elemento.toString() + "\n";
                       }

                       JOptionPane.showMessageDialog(null,textVotantes,"Casilla 7", JOptionPane.INFORMATION_MESSAGE);
                       break;

                   case 3:
                       clearData(ciudadano.getVotantesInfo(),ines,nombres,partidos,fileinfo);
                       textVotantes = "";
                       text = "";
                       file = new File("C:/Users/marcu/OneDrive/Documentos/Estructura de Datos/Casilla8.txt");
                       scanner = new Scanner(file);
                       while(scanner.hasNextLine())
                       {
                           text += scanner.nextLine() + "\n";
                       }

                       text = text.replace("\n", ",");
                       fileinfo = text.split(path);

                       exploreData(ines, nombres, partidos, fileinfo);

                       for(int k = 0; k < ines.size();k++)
                           ciudadano.addToTreeSet(ines.get(k),nombres.get(k),partidos.get(k));

                       for (Ciudadano elemento : ciudadano.getVotantesInfo()) {
                           textVotantes += elemento.toString() + "\n";
                       }

                       JOptionPane.showMessageDialog(null,textVotantes,"Casilla 8", JOptionPane.INFORMATION_MESSAGE);
                       break;

                   case 4:
                       clearData(ciudadano.getVotantesInfo(),ines,nombres,partidos,fileinfo);
                       textVotantes = "";
                       text = "";
                       file = new File("C:/Users/marcu/OneDrive/Documentos/Estructura de Datos/Casilla9.txt");
                       scanner = new Scanner(file);
                       while(scanner.hasNextLine())
                       {
                           text += scanner.nextLine() + "\n";
                       }

                       text = text.replace("\n", ",");
                       fileinfo = text.split(path);

                       exploreData(ines, nombres, partidos, fileinfo);

                       for(int k = 0; k < ines.size();k++)
                           ciudadano.addToTreeSet(ines.get(k),nombres.get(k),partidos.get(k));

                       for (Ciudadano elemento : ciudadano.getVotantesInfo()) {
                           textVotantes += elemento.toString() + "\n";
                       }

                       JOptionPane.showMessageDialog(null,textVotantes,"Casilla 9", JOptionPane.INFORMATION_MESSAGE);
                       break;
                   case 5:
                       isRunning = false;
                       break;

               }
           }
       }
       catch (FileNotFoundException e)
       {
           e.printStackTrace();
       }

    }

    public static void exploreData(ArrayList<Long> ines, ArrayList<String> nombres, ArrayList<String> partidos, String[] fileinfo) {
        for (int i = 0; i < fileinfo.length; i++)
        {

            if(fileinfo[i].matches(".*[\\d].*") && fileinfo[i].length() == 8)
            {
                if(Long.parseLong(fileinfo[i]) > 10)
                    ines.add(Long.parseLong(fileinfo[i]));
            }
            else if(fileinfo[i].matches(".*\\S.*") && fileinfo[i].contains(" "))
                nombres.add(fileinfo[i]);
            else
            {
                if(fileinfo[i].matches(".*\\d.*"))
                    fileinfo[i] = "null";
                partidos.add(fileinfo[i]);
            }
        }
    }

    public static void clearData(TreeSet<Ciudadano> votantesInfo,ArrayList<Long> ines, ArrayList<String> nombres, ArrayList<String> partidos, String[] fileinfo)
    {
        votantesInfo.clear();
        ines.clear();
        nombres.clear();
        partidos.clear();
        fileinfo = null;
    }


    public void addToTreeSet(long noINE, String nombre, String partido)
    {
        votantesInfo.add(new Ciudadano(noINE,nombre,partido));
    }


    public static void main(String[] args) {
        Ciudadano.process();
    }




    @Override
    public int compareTo(Object o) {
        if(o instanceof Ciudadano)
        {
            Ciudadano c = (Ciudadano) o;
            return (int) (this.getNoINE() - c.getNoINE());
        }
        else
            return 0;
    }


    @Override
    public String toString() {
        return "Ciudadano{" +
                "noINE=" + noINE +
                ", nombre='" + nombre + '\'' +
                ", partido='" + partido + '\'' +
                '}';
    }

    public long getNoINE() {
        return noINE;
    }

    public void setNoINE(long noINE) {
        this.noINE = noINE;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre()
    {
        return nombre;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public TreeSet<Ciudadano> getVotantesInfo()
    {
        return votantesInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ciudadano ciudadano = (Ciudadano) o;
        return getNoINE() == ciudadano.getNoINE();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNoINE());
    }
}
