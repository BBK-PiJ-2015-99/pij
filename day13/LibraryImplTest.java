import org.junit.*;
import static org.junit.Assert.*;

public class LibraryImplTest {
	
	Library lib;
	
	@Before
	public void initTest(){
		lib = new LibraryImpl("Birkbeck Library");
	}
	
	@Test
	public void testConstName(){
		assertEquals(lib.getName(), "Birkbeck Library");
	}
	
	@Test
	public void testAtCreation(){
		assertEquals(lib.getMaxBooks(), 0);
		
	}
	
	@Test
	public void testSetGetMaxBookss(){
		lib.setMaxBooks(3);
		assertEquals(lib.getMaxBooks(), 3);
	}
	
}