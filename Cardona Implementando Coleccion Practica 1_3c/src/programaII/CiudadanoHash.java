package programaII;

import programaI.Ciudadano;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CiudadanoHash extends Ciudadano implements Comparable
{

    public static void main(String[] args)
    {
        CiudadanoHash.process();
    }


    private HashSet<CiudadanoHash> votantesInfoHash = new HashSet<>();
    private int criterio;

    public CiudadanoHash(long noIne, String nombre, String partido)
    {
        super(noIne,nombre,partido);
    }

    public CiudadanoHash() {}

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

    public static int subMenu()
    {
        int op;
        String[] opciones = {"1", "2", "3", "4"};

        op = JOptionPane.showOptionDialog(null, """
                   1.- Numero INE ascendente
                   2.- Numero INE descendente
                   3.- Nombre ascendente
                   4.- Nombre descendente 
                    ""","Formas de Organizacion de Casilla",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        return op;
    }

    public static void process()
    {
        File file;
        CiudadanoHash ciudadanoHash = new CiudadanoHash();
        boolean isRunning = true;
        Scanner scanner;
        ArrayList<Long> ines = new ArrayList<>();
        ArrayList<String> nombres = new ArrayList<>(), partidos = new ArrayList<>();
        ArrayList<CiudadanoHash> aux = new ArrayList<>();


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
                        clearDataHash(ciudadanoHash.getVotantesInfoHash(),ines,nombres,partidos,aux,fileinfo);
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
                            ciudadanoHash.addToHashSet(ines.get(k),nombres.get(k),partidos.get(k));

                        aux = new ArrayList<>(ciudadanoHash.getVotantesInfoHash());
                        sortData(ciudadanoHash, aux, textVotantes);
                        long t2 = System.currentTimeMillis();
                        System.out.println((t2 - t1) + " ms");
                        break;

                    case 1:
                        clearDataHash(ciudadanoHash.getVotantesInfoHash(),ines,nombres,partidos,aux,fileinfo);
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
                            ciudadanoHash.addToHashSet(ines.get(k),nombres.get(k),partidos.get(k));

                        aux = new ArrayList<>(ciudadanoHash.getVotantesInfoHash());

                        sortData(ciudadanoHash,aux, textVotantes);
                        break;

                    case 2:
                        clearDataHash(ciudadanoHash.getVotantesInfoHash(),ines,nombres,partidos,aux,fileinfo);
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
                            ciudadanoHash.addToHashSet(ines.get(k),nombres.get(k),partidos.get(k));

                        aux = new ArrayList<>(ciudadanoHash.getVotantesInfoHash());

                        sortData(ciudadanoHash,aux, textVotantes);
                        break;

                    case 3:
                        clearDataHash(ciudadanoHash.getVotantesInfoHash(),ines,nombres,partidos,aux,fileinfo);
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
                            ciudadanoHash.addToHashSet(ines.get(k),nombres.get(k),partidos.get(k));

                        aux = new ArrayList<>(ciudadanoHash.getVotantesInfoHash());

                        sortData(ciudadanoHash,aux, textVotantes);
                        break;

                    case 4:
                        clearDataHash(ciudadanoHash.getVotantesInfoHash(),ines,nombres,partidos,aux,fileinfo);
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
                            ciudadanoHash.addToHashSet(ines.get(k),nombres.get(k),partidos.get(k));

                        aux = new ArrayList<>(ciudadanoHash.getVotantesInfoHash());

                        sortData(ciudadanoHash,aux, textVotantes);
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

    public static void clearDataHash(HashSet<CiudadanoHash> votantesInfoHash, ArrayList<Long> ines, ArrayList<String> nombres,
                                     ArrayList<String> partidos,ArrayList<CiudadanoHash> votantesInfo ,String[] fileinfo)
    {
        votantesInfoHash.clear();
        ines.clear();
        nombres.clear();
        partidos.clear();
        votantesInfo.clear();
        fileinfo = null;
    }

    public static void sortData(CiudadanoHash ciudadanoHash, ArrayList<CiudadanoHash> aux, String textVotantes) {

        switch (subMenu())
        {
            case 0:
                ciudadanoHash.setCriterio(1);
                JOptionPane.showMessageDialog(null,ciudadanoHash.showInfo(aux,textVotantes, ciudadanoHash.getCriterio()));
                break;
            case 1:
                ciudadanoHash.setCriterio(0);
                JOptionPane.showMessageDialog(null,ciudadanoHash.showInfo(aux,textVotantes, ciudadanoHash.getCriterio()));
                break;
            case 2:
                ciudadanoHash.setCriterio(2);
                JOptionPane.showMessageDialog(null,ciudadanoHash.showInfo(aux,textVotantes, ciudadanoHash.getCriterio()));
                break;
            case 3:
                ciudadanoHash.setCriterio(3);
                JOptionPane.showMessageDialog(null,ciudadanoHash.showInfo(aux,textVotantes, ciudadanoHash.getCriterio()));
                break;
        }
    }

    public String showInfo(ArrayList<CiudadanoHash> votantesInfo, String textVotantes, int criterio)
    {
        if(!votantesInfo.isEmpty())
        {
            for(CiudadanoHash c: votantesInfo)
            {
                c.setCriterio(criterio);
            }
            votantesInfo.sort(CiudadanoHash::compareTo);

            for(CiudadanoHash ch: votantesInfo)
            {
                textVotantes += ch.toString() + "\n";
            }
            return textVotantes;
        }
        else
            return "La lista de informacion de votantes esta vacia!";

    }


    public void addToHashSet(long noIne, String nombre, String partido)
    {
        votantesInfoHash.add(new CiudadanoHash(noIne,nombre,partido));
    }





    public HashSet<CiudadanoHash> getVotantesInfoHash()
    {
        return votantesInfoHash;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof CiudadanoHash)
        {
            CiudadanoHash ch = (CiudadanoHash) o;

            return switch (criterio){
                case 0 -> (int)(ch.getNoINE() - this.getNoINE());
                case 2 -> this.getNombre().compareToIgnoreCase(ch.getNombre());
                case 3 -> ch.getNombre().compareToIgnoreCase(this.getNombre());
                default -> (int)(this.getNoINE() - ch.getNoINE());
            };
        }
        else
            return 0;
    }

    public void setCriterio(int criterio) {
        this.criterio = criterio;
    }

    public int getCriterio()
    {
        return criterio;
    }

}
