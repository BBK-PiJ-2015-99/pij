import java.util.*;
import java.io.File;

class Mkdir {

        
    public static void main(String[] args){
        
        if(args.length==1){
            String folderName = args[0];
            File dir = new File(folderName);
            System.out.println("Creating folder:" + folderName);
            dir.mkdir();
        }else{
            System.out.println("Please supply one argument to this program.");
            System.exit(1);
       } 
    
    }

}

