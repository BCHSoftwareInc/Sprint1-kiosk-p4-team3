// NOTE: Comments in this file were authored by an AI assistant. This is not to turn in, only to use as a reference in the future.

// Import the Scanner class from java.util package.
// Scanner is used to read input from the user (keyboard, in this case).
import java.util.Scanner;

// 'public class KiosApp' defines the main class of the program.
// The class name (KiosApp) must match the filename (KiosApp.java) when saved.
public class KiosApp
{
    // The main method is the entry point of any Java application.
    // The JVM (Java Virtual Machine) starts executing the program from here.
    // 'String[] args' is used to pass command-line arguments, though we don't use them here.
    public static void main(String[] args)
    {
        // Create a new Scanner object to read input from the standard input stream (System.in), 
        // which is typically the keyboard.
        Scanner scanner = new Scanner(System.in);

        // Print the welcome banner for the check-in system.
        // System.out.println prints the text and adds a new line after it.
        System.out.println("+------------------------------------------+");
        System.out.println("|          APEX VISITOR CHECK-IN           |");
        System.out.println("+------------------------------------------+");
        System.out.println("Please enter your registration details.     ");
        System.out.println(); // Print an empty line for spacing.

        // TODO(ethan): Look into and implement input sanitization methods.
        // The TODO note indicates future work: we should validate or clean the input 
        // to prevent issues like malicious data or formatting problems.

        // Prompt the user to enter their full name.
        System.out.print("Enter Full Name: "); // print() does not add a new line after the prompt.
        // Read the text the user enters until they press Enter, and store it as a String.
        String name = scanner.nextLine(); // nextLine() reads a full line of text.

        // Prompt the user to enter their organization.
        System.out.print("Enter Organization: ");
        // Read the organization name.
        String org = scanner.nextLine(); // Store the line of text in the variable 'org'.

        // Prompt the user to enter their contact email.
        System.out.print("Enter Contact Email: ");
        // Read the email address.
        String email = scanner.nextLine(); // Store the line of text in the variable 'email'.

        // Prompt the user to enter their access level.
        System.out.print("Enter Access Level: ");
        // Read the access level (e.g., "VIP", "Standard", "Staff").
        String access = scanner.nextLine(); // Store the line of text in the variable 'access'.

        // TODO(ethan): Figure out how to dynamically scale padding to keep formatting correct.
        // This note indicates future work: we want to adjust the spacing/padding of the pass
        // so it stays neatly formatted even if the entered names are different lengths.

        // Print a blank line before the pass for visual separation.
        System.out.println(); 

        // Print the header for the entertainment pass.
        System.out.println("+------------------------------------------+");
        System.out.println("|         APEX ENTERTAINMENT PASS          |");
        System.out.println("+------------------------------------------+");
        System.out.println("|                                          |");
        // Print the attendee's details on the pass.
        // We concatenate (connect together) the label and the variable value using the '+' operator.
        System.out.println("| ATTENDEE : " + name + " |"); // Display the name entered by the user.
        System.out.println("| ORG      :" + org + " |"); // Display the organization.
        System.out.println("| CONTACT  :" + email + " |"); // Display the email address.
        System.out.println("| ACCESS   :" + access + " |"); // Display the access level.
        System.out.println("| ISSUER   : BCH Software Terminal System  |"); // Display a fixed issuer line.
        System.out.println("+------------------------------------------+"); // Print the bottom border of the pass.
    }
}
