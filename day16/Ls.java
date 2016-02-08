import java.util.*;
import java.io.File;

class Ls{

    private String dir;

    static public void main(String[] args ){
        String curDir = System.getProperty("user.dir");
        System.out.println("Current Dir:" + curDir);
        File folder = new File(curDir);
        for (File fileEntry : folder.listFiles()){
            System.out.println(fileEntry.getName());
        }
    }
    
}
