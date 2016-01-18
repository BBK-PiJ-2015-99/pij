import org.junit.*;
import static org.junit.Assert.*;

public class BookTest {
	
	//ask if i should instantiate BookImpl or Book
	Book bk;
	
	@Before 
	public void initTest(){
		bk = new BookImpl("gabriel garcia marquez","chronicle of a death foretold");
	}
	
	@Test
	public void authorGetter(){
		assertEquals(bk.getAuthor(),"gabriel garcia marquez");
	}

	@Test
	public void titleGetter(){
		assertEquals(bk.getTitle(),"chronicle of a death foretold");
	}
	
}
