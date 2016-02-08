import org.junit.*;
import java.util.*;
import static org.junit.Assert.*;

public class LsTest {

    List<String> files;

    @BeforeClass 
    public void initTest(){
        Ls ls = new Ls("lsTestData");
        files = ls.run();
    }
   
    @Test
    public void NumberOfFiles(){
        assertEquals(files.length(), 2);
    }

    @Test
    public void FilesName(){
        assertTrue(files.contains("file1.test") && files.contains("file2.test"));
    }
}
