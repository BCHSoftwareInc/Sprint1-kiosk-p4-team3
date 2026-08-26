import java.util.Scanner;

public class KioskApp
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|========================================|");
        System.out.println("|      BCH ENTERPRISE VISITOR KIOSK      |");
        System.out.println("|========================================|");
        System.out.println("Please enter your registration details.     ");
        System.out.println();

        // get info from user
        System.out.print("Enter First/Last Name: ");
        String name = scanner.nextLine().trim(); // trim() removes leading and trailing spaces, tabs, and return chars
        
        System.out.print("Enter Organization: ");
        String org = scanner.nextLine().trim();

        System.out.print("Enter Contact Email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Enter Access Level: ");
        String access = scanner.nextLine().trim();

        
        // print pass
        // %-29.29s |%n is what dynamically changes padding. println cant do that, hence why use printf
        System.out.println();
        System.out.println("+------------------------------------------+");
        System.out.println("|         APEX ENTERTAINMENT PASS          |");
        System.out.println("+------------------------------------------+");
        System.out.println("|                                          |");
        System.out.printf("| ATTENDEE : %-29.29s |%n", name);
        System.out.printf("| ORG      : %-29.29s |%n", org);
        System.out.printf("| CONTACT  : %-29.29s |%n", email);
        System.out.printf("| ACCESS   : %-29.29s |%n", access);
        System.out.println("| ISSUER   : BCH Software Terminal System  |");
        System.out.println("+------------------------------------------+");

        scanner.close();
    }
}
