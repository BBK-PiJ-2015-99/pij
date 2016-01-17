import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
	@Test
	public void PersonTest() {
		Person p = new Person("David",30);
		String output = p.getName();
		String expected = "David";
		assertEquals(output, expected);
	}
}
