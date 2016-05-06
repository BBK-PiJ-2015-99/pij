
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class FunctStringSrt{


    private List<String> getList(){
        List<String> newList = new ArrayList();
        newList.add("Annabel");
        newList.add("John");
        newList.add("JB");
        newList.add("Roger");
        newList.add("David");
        newList.add("Xerxes");
        return newList;
    }

    public static void main(String[] args){
       
        FunctStringSrt fss = new FunctStringSrt();  
        //Shortest to longuest name
        List<String> toBeSorted = fss.getList();
        Collections.sort(toBeSorted, (String a, String b) -> a.length()-b.length());        
        System.out.println("Sorted values - shortest to longuest:");
        for(String s : toBeSorted){
            System.out.println(s);
        }   
        //Longuest to shortest 
        Collections.sort(toBeSorted, (String a, String b) -> b.length()-a.length());        
        System.out.println("Sorted values - longuest to shortest:");
        for(String s : toBeSorted){
            System.out.println(s);
        }  

        Collections.sort(toBeSorted, (String a, String b) -> {

                    Character c1 = new Character(a.toLowerCase().charAt(0) );    
                    Character c2 = new Character(b.toLowerCase().charAt(0));    
                    return a.compareTo(b);  
                }
             );        
        System.out.println("By first character");
        for(String s : toBeSorted){
            System.out.println(s);
        }  
        
        Collections.sort(toBeSorted, (String a, String b) -> { 
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
        );
        
        System.out.println("Sort by letter 'e'");
        for(String s : toBeSorted){
            System.out.println(s);
        }  
       //Collection already sorted so get a new one
       toBeSorted = fss.getList();
       Collections.sort(toBeSorted, StringUtils::eChecker);

        System.out.println("Sort by letter 'e' - use method reference");
        for(String s : toBeSorted){
            System.out.println(s);
        }  


    }
}
