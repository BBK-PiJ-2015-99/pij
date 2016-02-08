import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

class Cat{
    
    public static void main(String[] args){
       
        if(args.length==0){
            System.out.println("Please supply at least one file name.");
            System.exit(1);
        }else{
            for(String fileName : args){
                File f = new File(fileName);
                if(!f.isDirectory()){
                    try (BufferedReader in = new BufferedReader(new FileReader(f))) {
                        System.out.println("The contents of:" + fileName);
                        String line;
                        while((line = in.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (FileNotFoundException ex){
                        System.out.println("The file does not exist:" + fileName);
                    } catch(IOException ex){
                        ex.printStackTrace();
                    } 
                }else{
                    System.out.println("This file is a folder:" + f.getName());
                    System.exit(2);
                }
            }
       } 

    }

}
