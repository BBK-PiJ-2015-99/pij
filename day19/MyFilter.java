import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class MyFilter{
    public static <T> List<T> allMatches(List<T> toMatch, Predicate<T> pred){
        List<T> returnList = new ArrayList();
        for(T elem : toMatch){
            if(pred.test(elem))
               returnList.add(elem); 
        }    
        return returnList;
    }

}
