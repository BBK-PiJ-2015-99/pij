import java.io.File;
import java.io.Console;

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
                if (file2Exists){
                    Console console = System.console();
                    System.out.println("The second file already exists: " + file2.getName() );
                    char resp = '\0';
                    int counter=0;
                    boolean overwrite;
                    while( ( resp != 'y' && resp != 'n')  && counter <= 2) {
                        System.out.print("Overwrite file y/n:");
                        String user_resp = console.readLine();
                        if( user_resp.length() >= 1){
                            System.out.println("Running here");
                            resp = user_resp.charAt(0);            
                        }else{
                            System.out.println("Please submit a valid response.");
                            counter++;
                        }   
                        System.out.println(resp);
                        counter++;
                    }
                    if(resp != 'y' && resp != 'n'){
                        System.out.println("You've tried to answer a simple questions 3 times and you failed\n You're clearly being a dick about this... Goodbye");
                        System.exit(3);
                    }
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
