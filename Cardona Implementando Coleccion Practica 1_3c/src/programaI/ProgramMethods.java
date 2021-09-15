package programaI;

import programaII.CiudadanoHash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public interface ProgramMethods
{
    static int menu() {
        return 0;
    }

    static void exploreData(ArrayList<Long> ines, ArrayList<String> nombres, ArrayList<String> partidos, String[] fileinfo) {}

    static void process() {}

    static void clearData(TreeSet<Ciudadano> votantesInfo, ArrayList<Long> ines, ArrayList<String> nombres, ArrayList<String> partidos, String[] fileinfo) {}

    static void clearDataHash(HashSet<CiudadanoHash> votantesInfoHash, ArrayList<Long> ines, ArrayList<String> nombres, ArrayList<String> partidos, ArrayList<CiudadanoHash> votantesInfo, String[] fileinfo) {

    }

}
