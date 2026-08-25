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
        System.out.println("|email address:                          |");
        String email = scanner.nextLine();
        System.out.println("|org:                                    |");
        String org = scanner.nextLine();
        System.out.println("|acess:                                  |");
        String acess = scanner.nextLine();
        System.out.println("|issuer:                                 |");
        String issuer = scanner.nextLine();
        System.out.println("-------------------------------");
        System.out.println("|   Apex Entertaninment pass  |");
        System.out.println("-------------------------------");
        System.out.println("| Attendee:" + name +"        |");
        System.out.println("| Contact :" + email +"       |");
        System.out.println("| Org     :" + org +"         |");
        System.out.println("| Acess   :" + acess +"       |");
        System.out.println("| Issuer  :" + issuer +"      |");
        System.out.println("_______________________________");
}
}