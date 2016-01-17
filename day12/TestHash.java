import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class TestHash {
	
	/*
	@Test
	ppp{
		assertNotNul()
		assertTrue(<1000)
		
	}*/

	@Test
	public void testsHashRange() {
		int randomInt, hashedInt;
		Random randomGenerator = new Random();
		for(int i = 0; i<2000; i++){
			randomInt = randomGenerator.nextInt(10000);
			hashedInt = HashUtilities.shortHash(randomInt);
			assertTrue(hashedInt>= 0 && hashedInt<= 999);
		}
	}
}
