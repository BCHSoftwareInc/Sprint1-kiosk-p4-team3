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
