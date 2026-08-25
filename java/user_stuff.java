import java.util.Scanner;

public class user_stuff
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|========================================|");
        System.out.println("|      BCH ENTERPRISE VISITOR KIOSK      |");
        System.out.println("|========================================|");
        System.out.println("|------------give info here--------------|");
        System.out.println("|Attendee:                               |");
        String name = scanner.nextLine();
        System.out.println("|Email address:                          |");
        String email = scanner.nextLine();
        System.out.println("|Org:                                    |");
        String org = scanner.nextLine();
        System.out.println("|Acess:                                  |");
        String acess = scanner.nextLine();
        System.out.println("|Issuer:                                 |");
        String issuer = scanner.nextLine();
        System.out.println("-------------------------------");
        System.out.println("|   Apex Entertaninment pass  |");
        System.out.println("-------------------------------");
        System.out.println("| Attendee:" + String.format("%-19s", name) +"|");
        System.out.println("| Contact :" + String.format("%-19s", email) +"|");
        System.out.println("| Org     :" + String.format("%-19s", org) +"|");
        System.out.println("| Acess   :" + String.format("%-19s", acess) +"|");
        System.out.println("| Issuer  :" + String.format("%-19s", issuer)+"|");
        System.out.println("_______________________________");
}
}
