public class TestApplyBetterString{
    
    public static void main(String[] args){
        TwoStringPredicate pred = ( a, b) -> {
            return (a.compareTo( b ) < 0) ? false : true;
        };
       
        TwoElementPredicate predGen = ( a, b) -> {
            String a1 = (String) a;
            String b1 = (String) b;
            return ( a1.compareTo( b1 ) < 0) ? false : true;
        };
        if(Apply.betterString("Sofa","Bed", pred ))
            System.out.println("This has worked!");
        
        System.out.println("Which one first: Sofa Bed:" + Apply.betterString("Sofa", "Bed", pred));
        System.out.println("Which one first: School Work:" + Apply.betterElem("School", "Work", predGen));

    }

}
