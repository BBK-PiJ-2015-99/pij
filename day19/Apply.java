public class Apply{

    public static boolean betterString(String s1, String s2, TwoStringPredicate pred){
           return pred.bestest(s1, s2);
    }
    public static <T>  boolean betterElem(T s1, T s2, TwoElementPredicate pred){
           return pred.bestest(s1, s2);
    }
}
