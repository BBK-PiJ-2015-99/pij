
public class StringUtils{

    public static int eChecker(String a, String b){
        boolean aHasE = a.indexOf('e') >= 0;
        boolean bHasE = b.indexOf('e') >= 0;
        if(aHasE && bHasE){
            return 0;
        }else if (aHasE && !bHasE){
            return -1;
        }else{
            return 1;
        } 

    }


}
