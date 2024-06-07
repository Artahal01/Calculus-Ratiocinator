package Operation;

import entity.mensonge;
import interfaceDAOImplementation.mensongeDAOImpl;

import java.util.Arrays;
import java.util.List;

public class searchOfTheAffirmation {
    mensongeDAOImpl mensongeDAO = new mensongeDAOImpl();
    List<mensonge> mensongeList = mensongeDAO.getMensongeList();
    static String [] truth = veritesList;
    static String [] lie = mensongesList;
    public static String truthAffirmationSearch (String truthPhrase){
        if(Arrays.asList(truth).contains(truthPhrase)){
            return "truth";
        }
        else{
            return "missing";
        }
    }

    public static String lieAffirmationSearch (String liePhrase){
        if(Arrays.asList(lie).contains(liePhrase)){
            return "lie";
        }
        else{
            return "missing";
        }
    }
}
