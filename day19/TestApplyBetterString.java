public class TestApplyBetterString{
    
    public static void main(String[] args){
        TwoStringPredicate pred = ( a, b) -> {
            return (a.compareTo( b ) < 0) ? false : true;
        };
       
        if(Apply.betterString("Sofa","Bed", pred ))
            System.out.println("This has worked!");
        
        System.out.println("Which one first: Sofa Bed" + Apply.betterString("Sofa", "Bed", pred));
        System.out.println("Which one first: School Work" + Apply.betterString("School", "Work", pred));

    }

}
