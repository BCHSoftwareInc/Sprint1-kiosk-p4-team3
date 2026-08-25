import java.util.Scanner;

public class KiosApp
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("+------------------------------------------+");
        System.out.println("|          APEX VISITOR CHECK-IN           |");
        System.out.println("+------------------------------------------+");
        System.out.println("Please enter your registration details.     ");
        System.out.println();

        System.out.print("Enter Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Organization: ");
        String org = scanner.nextLine();

        System.out.print("Enter Contact Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Access Level: ");
        String access = scanner.nextLine();

        // first pass of input sanitization, removes tab characters and replaces them with a space.
        // TODO(ethan): implement sanitization that removes special chars in applicable fields.
        name = name.replace("\t", " ")
        org = org.replace("\t", " ")
        email = email.replace("\t", " ")
        access = access.replace("\t", " ")
        
        // TODO(ethan/daniel): Figure out how to dynamically scale padding to keep formatting correct.
        System.out.println();
        System.out.println("+------------------------------------------+");
        System.out.println("|         APEX ENTERTAINMENT PASS          |");
        System.out.println("+------------------------------------------+");
        System.out.println("|                                          |");
        System.out.println("| ATTENDEE : " + name + " |");
        System.out.println("| ORG      :" + org + " |");
        System.out.println("| CONTACT  :" + email + " |");
        System.out.println("| ACCESS   :" + access + " |");
        System.out.println("| ISSUER   : BCH Software Terminal System  |");
        System.out.println("+------------------------------------------+");

        scanner.close();
    }
}
