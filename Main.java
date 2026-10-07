import java.util.Scanner;

public class Main{
// ANSI escape codes for coloring the console output
    public static final String RESET = "\033[0m";  // Reset color
        public static final String BLUE_BG = "\033[44m";   // Red color
        public static final String WHITE_TEXT = "\033[97m"; // Green color 
        public static final String CYAN_TEXT = "\033[96m"; // Black color  
        public static final String CLEAR = "\033[H\033[2J"; // Clear the console
        
    /**
     * @param args
     */
// Main function
    public static void main(String[] args) {
            System.out.println(CLEAR);
            System.out.print("----------------------"+BLUE_BG + WHITE_TEXT + "Welcome to the Function Calculator!" + RESET);
            System.out.println("----------------------");
            System.out.println(CYAN_TEXT + "Type 'exit' to quit the program." + RESET);
//  while loop for the calculator to keep running until the user decides to exit
        while(true){
            System.out.print(" --Calculator >>> ");
            Scanner scanner = new Scanner(System.in);
            String function ;
            function = scanner.nextLine();
// Check if the user wants to exit the program 
        if(function.equalsIgnoreCase("exit")){
        System.out.println("Exiting the program. Goodbye!");
        break;
        }
// Split the input into command and arguments
        String[] thefunc = function.split(" ");
        String command = thefunc[0];
// Clear the CMD

        if (command.equalsIgnoreCase("CLEAR")){
        System.out.print(CLEAR);
        System.out.print("----------------------"+BLUE_BG + WHITE_TEXT + "Welcome to the Function Calculator!" + RESET);
        System.out.println("----------------------");
        System.out.println(CYAN_TEXT + "Type 'exit' to quit the program." + RESET);
        }
// Add functions for basic arithmetic operations and other functions like factorial, absolute value, etc.
        if(thefunc[0].equalsIgnoreCase("add")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    double num2 = Double.parseDouble(thefunc[2]);
                    functions.add(num1, num2);
                
        }
                
        if(thefunc[0].equalsIgnoreCase("multply")){
               
                         double num1 = Double.parseDouble(thefunc[1]);
                    double num2 = Double.parseDouble(thefunc[2]);
                    functions.multply(num1, num2);
                
                        
                }
                   
                
        if(thefunc[0].equalsIgnoreCase("sub")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    double num2 = Double.parseDouble(thefunc[2]);
                    functions.sub(num1, num2);
                
                }
        if(thefunc[0].equalsIgnoreCase("divid")){
                
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    double num2 = Double.parseDouble(thefunc[2]);
                    functions.divid(num1, num2);
               
                }
        if(thefunc[0].equalsIgnoreCase("factorial")){
                
        
                int num1 = Integer.parseInt(thefunc[1]);
                functions.factorial(num1);
        
        }
        if(thefunc[0].equalsIgnoreCase("abs")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    functions.abs(num1);
                
                }
        if(thefunc[0].equalsIgnoreCase("powerFunction")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    long num2 = Long.parseLong(thefunc[2]);
                    functions.powerFunction(num1, num2);
                
                }
                // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("C")){
                
                        long num1 = Long.parseLong(thefunc[1]);
                    long num2 = Long.parseLong(thefunc[2]);
                    functions.C(num1, num2);
        }
        // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("P")){
                
                        long num1 = Long.parseLong(thefunc[1]);
                    long num2 = Long.parseLong(thefunc[2]);
                    functions.P(num1, num2);}
        if(thefunc[0].equalsIgnoreCase("convertDegToRad")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    functions.convertDegToRad(num1);
        }
        if(thefunc[0].equalsIgnoreCase("convertRadToDeg")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    functions.convertRadToDeg(num1);}
            // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("sin")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    functions.sin(num1);
        }
           // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("cos")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    functions.cos(num1);}
                    // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("tan")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    functions.tan(num1);}
                    // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("cot")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                    functions.cot(num1);}
                    // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("sec")){
                
                        double num1 = Double.parseDouble(thefunc[1]);
                        functions.sec(num1);}
                        // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("csc")){
                double num1 = Double.parseDouble(thefunc[1]);
                    functions.csc(num1);}
                    // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("sqrt")){
                double num1 = Double.parseDouble(thefunc[1]);
                    functions.sqrt(num1);}
                    // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("percentage")){
                double num1 = Double.parseDouble(thefunc[1]);
                    double num2 = Double.parseDouble(thefunc[2]);
                    functions.percentage(num1, num2);}
        if(thefunc[0].equalsIgnoreCase("square")){
                double num1 = Double.parseDouble(thefunc[1]);
                    functions.square(num1);}
                    // ERRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRROOOOOOOOOOOOOOOOORRRRRRRRRRRRRRRRRR
        if(thefunc[0].equalsIgnoreCase("twodegequa")){
                double num1 = Double.parseDouble(thefunc[1]);
                    double num2 = Double.parseDouble(thefunc[2]);
                    double num3 = Double.parseDouble(thefunc[3]);
                    functions.twodegequa(num1, num2, num3);}
     

        
        }}}

