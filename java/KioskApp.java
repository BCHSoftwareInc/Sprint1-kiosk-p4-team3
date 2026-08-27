import java.util.Scanner;

public class KioskApp
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|==========================================|");
        System.out.println("|       BCH ENTERPRISE VISITOR KIOSK       |");
        System.out.println("|==========================================|");
        System.out.println("| Please enter your registration details.  |");
        System.out.println();

        // get info from user
        System.out.print("Enter First/Last Name: ");
        String name = scanner.nextLine().trim(); // trim() removes leading and trailing whitespaces
        
        System.out.print("Enter Organization: ");
        String org = scanner.nextLine().trim();

        System.out.print("Enter Contact Email: ");
        String email = scanner.nextLine().trim();

        System.out.println("Access Levels:");
        System.out.println("  1 - VIP");
        System.out.println("  2 - Speaker");
        System.out.println("  3 - Attendee");
        System.out.println("  4 - Vendor");
        System.out.println("  5 - Staff");
        System.out.print("Enter Access Level (1-5): ");
        String access = scanner.nextLine().trim();


        // heres where do sanitization pass 1 to take out tab chars which break formatting
        // also all whitespaces (\t, \n, \r, space, etc) in emails
        // this simply replaces tabs and multiple spaces with single spaces
        name = name.replaceAll("\\s+", " "); // regex is funky
        org = org.replaceAll("\\s+", " ");
        email = email.replaceAll("\\s+", ""); // remove all whitespace from emails

        // sanitization pass 2 to remove special chars from their fields
        name = name.replaceAll("[$%#@^&*+=?<>{}\\[\\]\\\\|~`]", "");
        org = org.replaceAll("[$%^*<>{}\\[\\]\\\\|~`]", ""); // kind of grey zone, some orgs are silly with chars
        email = email.replaceAll("[ ()<>{}\\[\\]\\\\,]", ""); // strip all but valid in rfc 5322

        // a way to select access tier instead of manually typing it out (issue 10)
        // idea is: take numerical input, strip out any and all other chars, then strip to one number and replace with proper access
        // bit janky but without if/else statements its the best can do
        access = access.replaceAll("[^0-9]", ""); // keep digits only
        access = access.replaceAll("(?<=.).", ""); // keep first digit only (cant use "12" to get "VIPSpeaker")
        // map digit to access level
        access = access.replaceAll("^1$", "VIP")
            .replaceAll("^2$", "Speaker")
            .replaceAll("^3$", "Attendee") // note the missing semicolons and access = access at the beginning
            .replaceAll("^4$", "Vendor")   // java interprets all this as a chained line of replaceAll() 
            .replaceAll("^5$", "Staff");
        // anything left after this point is invalid, declare as such
        access = access.replaceAll("^[0-9]*$", "INVALID ACCESS");
        
        // print pass
        // %-29.29s |%n is what dynamically changes padding. println cant do that, hence why use printf. could use string.format but that is clunky and i already wrote this
        System.out.println();
        System.out.println("|==========================================|");
        System.out.println("|         APEX ENTERTAINMENT PASS          |");
        System.out.println("|==========================================|");
        System.out.println("|                                          |");
        System.out.printf("| ATTENDEE : %-29.29s |%n", name);
        System.out.printf("| ORG      : %-29.29s |%n", org);
        System.out.printf("| CONTACT  : %-29.29s |%n", email);
        System.out.printf("| ACCESS   : %-29.29s |%n", access);
        System.out.println("| ISSUER   : BCH Software Terminal System  |");
        System.out.println("|==========================================|");

        scanner.close(); // good practice to close unused resources
    }
}
