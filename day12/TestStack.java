import org.junit.*;
import static org.junit.Assert.*;

public class TestStack {

    ArrayStringStack stack;

    @Before
    public void initTestStack(){
        stack = new ArrayStringStack();
    }
    @Test
    public void testStackIsEmpty() {
       assertTrue(stack.isEmpty()); 
    }
    @Test
    public void testStackHasOne(){
        stack.push("Value 1");
        stack.push("Value 2");
        String val2 = stack.pop();
        String val1 = stack.pop();
        stack.push("Value 1");
        stack.push("Value 2 ");
        System.out.println( val2 + "--" + val1);
      //  assertTrue( val2.equals("Value 2") && val1.equals("Value 1")  );
       
        //assertFalse(stack.isEmpty());
    }
}  
