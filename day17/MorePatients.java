import java.util.ArrayList;
import java.util.List;
import java.io.Console;

class MorePatient{

    public static void main(String[] args){
        List<Patient> patientList = new ArrayList<Patient>(); 
        Console console = System.console();
        while(true){
            System.out.println("~~~Enter Patient Details~~~~");
            String userInputName = console.readLine("Input patient name:"); 
            String userInputAge = console.readLine("Input patient age:"); 
            Patient pte = new Patient(userInputName, Integer.parseInt(userInputAge));
        }

    }

}
