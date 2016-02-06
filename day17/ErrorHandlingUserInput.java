import java.io.Console;
class ErrorHandlingUserInput {

        public static void main(String args[]){
            int counter=0;
            double cumSum=0;
            double numbersToRead;
            System.out.println("How many numbers do you want to read?");
            numbersToRead = get_double();
            while(counter<=numbersToRead-1){
                try {
                    cumSum += get_double();
                    counter+=1;
                }catch (NumberFormatException nfe) {

                }
            }
            System.out.println("The average is:" + cumSum / 10);
        }


        public static double get_double(){
            String userInput;
            Double inputDouble;
            while(true){
                try {
                    Console console = System.console();
                    userInput = console.readLine("Input a number:");
                    inputDouble = Double.parseDouble(userInput);
                    break;
                }catch( NumberFormatException nfe){
                    
                }
            }
            return inputDouble;
        }
    


}
