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
        String name = scanner.nextLine().trim(); // trim() removes leading and trailing whitespaces
        
        System.out.print("Enter Organization: ");
        String org = scanner.nextLine().trim();

        System.out.print("Enter Contact Email: ");
        String email = scanner.nextLine().trim();

        System.out.print("Enter Access Level: ");
        String access = scanner.nextLine().trim();


        // heres where do sanitization pass 1 to take out tab chars which break formatting
        // also all whitespaces (\t, \n, \r, space, etc) in emails
        // this simply replaces tabs and multiple spaces with single spaces
        name = name.replaceAll("\t| {2,}", " "); // regex is funky
        org = org.replaceAll("\t| {2,}", " ");
        email = email.replaceAll("\s+", ""); // remove all whitespace from emails

        // sanitization pass 2 to remove special chars from their fields
        name = name.replaceAll("[$%#@^&*+=?<>{}\\[\\]\\\\|~`]", "");
        org = org.replaceAll("[$%^*<>{}\\[\\]\\\\|~`]", ""); // kind of grey zone, some orgs are silly with chars
        email = email.replaceAll("[ ()\\<\\>{}\\[\\]\\\\,]", ""); // strip all but valid in rfc 5322

        // TODO(ethan): resolve issue 10, maybe via replaceAll()
        
        // print pass
        // %-29.29s |%n is what dynamically changes padding. println cant do that, hence why use printf. could use string.format but that is clunky
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
