import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;

public class TestMyFilter{
    public static void main(String[] args){
        List<String> example = new ArrayList();
        example.add("Cat");        
        example.add("Dog");        
        example.add("Notebook");        
        example.add("Computer");        
        example.add("Success");        
        example.add("Birkbeck");
        Predicate<String> moreThan4Characters = (s) -> {
            if(s.length()>4)
                return true;
            else
                return false;
        };        
        List<String> bigWords = MyFilter.allMatches( example  , moreThan4Characters);
        for(String s: bigWords)
            System.out.println("The words:" + s);
    }

}
