import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class MyFilter{
    public static List<String> allMatches(List<String> toMatch, Predicate<String> pred){
        List<String> returnList = new ArrayList();
        for(String elem : toMatch){
            if(pred.test(elem))
               returnList.add(elem); 
        }    
        return returnList;
    }

}
