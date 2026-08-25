import java.util.Scanner;

public class KioskApp
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
        System.out.println("-------------------------------------");
        System.out.println("|   Apex Entertaninment pass        |");
        System.out.println("-------------------------------------");
        System.out.println("| Attendee:" + String.format("%-25s", name) +"|");
        System.out.println("| Contact :" + String.format("%-25s", email) +"|");
        System.out.println("| Org     :" + String.format("%-25s", org) +"|");
        System.out.println("| Acess   :" + String.format("%-25s", acess) +"|");
        System.out.println("| Issuer  :" + String.format("%-25s", issuer)+"|");
        System.out.println("_____________________________________");
}
}
