import java.nio.file.Files;
import java.io.File;
import java.io.Console;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

class Cp {

    public static void main(String[] args){
        if(args.length <=1){
            System.out.println("Please supply at least two arguments."); 
            System.exit(1);
        } else if (args.length ==2){
            File file1 = new File(args[0]);
            File file2 = new File(args[1]);
 
            if(file1.exists()){
                boolean file2Exists =  file2.exists();
                boolean overwrite=false;
                if (file2Exists){
                    Console console = System.console();
                    System.out.println("The second file already exists: " + file2.getName() );
                    char resp = '\0';
                    int counter=0;
                    while( ( resp != 'y' && resp != 'n')  && counter <= 2) {
                        System.out.print("Overwrite file y/n:");
                        String user_resp = console.readLine();
                        if( user_resp.length() >= 1){
                            resp = user_resp.charAt(0);            
                        }else{
                            System.out.println("Please submit a valid response.");
                            counter++;
                        }   
                        counter++;
                    }
                    if(resp == 'y'){
                        overwrite=true;
                    } else if (resp == 'n'){
                        overwrite=false;
                    }else {
                        System.out.println("You've tried to answer a simple questions 3 times and you failed\n You're clearly being a dick about this... Goodbye");
                        System.exit(3);
                    }
                }
                /*Path p1 = Paths.get(file1.getAbsolutePath())
                Path p2 = Paths.get(file1.getAbsolutePath())*/
                try {
                    Files.move(Paths.get(file1.getAbsolutePath()),Paths.get(file2.getAbsolutePath()), StandardCopyOption.REPLACE_EXISTING);
                } catch(IOException e) {
                    e.printStackTrace();
                }
            } else{
                System.out.println("The first file does not exists. Please supply a valid file.");
            }
        } else {
            System.out.println("I don't know how to deal with more than 2 arguments yet.");
            System.exit(2);
        } 
   } 


}
