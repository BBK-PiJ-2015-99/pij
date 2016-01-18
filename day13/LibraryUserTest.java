import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserTest {
	
	LibraryUser lu;
	
	@Before
	public void testSetup(){
		lu = new LibraryUserImpl("I rode a tank");
	}
	
	@Test
	public void testNameGetter(){
		assertEquals(lu.getName(), "I rode a tank");
	}
	
	@Test
	public void testIDSetterGetter(){
		lu.setID(666);
		assertEquals(lu.getID(), 666);
	}
}