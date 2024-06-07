package Operation;

public class calculusRatiocinator {

    static int checkValueTruth = 0;
    static int checkValueLie = 0;
    static int total = 0;
    public static int checkingIfTruthOrMissing(){
        String TAS = searchOfTheAffirmation.truthAffirmationSearch("Lou est beau");
        if(TAS.equals("truth")){
                checkValueTruth ++;
                total+=checkValueTruth;
        }
        return total;
    }
    public static int checkingIfLieOrMissing(){
        String LAS = searchOfTheAffirmation.lieAffirmationSearch("Lou est pauvre");
        if(LAS.equals("lie")){
                checkValueLie --;
                total+=checkValueLie;
        }
        return total;
    }

    public static String et(){
        if(total==2){
            return "vrai";
        }
        else if(total==0 || total==-2){
            return "fausse";
        }
        else{
            return "missing";
        }
    }

    public static String ou(){
        if(total==2 || total==0){
            return "vrai";
        }
        else if(total==-2){
            return "fausse";
        }
        else{
            return "missing";
        }
    }

    public static String donc(){
        if(total==0){
            return "fausse";
        }
        else if(total==-2 || total==2){
            return "vrai";
        }
        else{
            return "missing";
        }
    }
}
