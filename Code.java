import java.util.Scanner;

public class Code {
    // declare variables
    private boolean doClassDeclaration;
    private int indentSize = 4;
    private Scanner userInput = new Scanner(System.in);
    
    
    
    
    public Code() { // this is quick and dirty so constructer acts as main because I wanted to use a full class and am a silly goose
        // print instructions and information
        System.out.printf("%s%n%s%n    %s%n    %s%n    %s%n%n",
            "INSTRUCTIONS/INFORMATION: ",
            "((Y or true)/(N or false)/DAA) [or some combination] = input Y or N or DAA",
            "(Y or true) = yes",
            "(N or false)= no",
            "DAA = Don't Ask Again");

        System.out.print("have you read the instructions? If not, take your time. (Y)");
        userInput.next();

        // do... while loop to check if the user wants an input declaration.
        do {
            System.out.print("would you like to create a class declaration? (Y/N)");
            doClassDeclaration = userInput.nextBoolean();
        } while (doClassDeclaration != true && doClassDeclaration != false);
        if (doClassDeclaration) {
            createClassDeclaration();
        } else {
            addAttribute();
        }
    }


    // method for obtaining user input to create the class declaration
    public void createClassDeclaration() {

    }

    public void addAttribute() {

    }
}
