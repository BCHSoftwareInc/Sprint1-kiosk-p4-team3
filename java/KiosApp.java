// BCH Software Inc. - Sprint 1: Interactive Kiosk
// Track: Java / AP CSA Software Engineering
import java.util.Scanner;

public class KioskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========================================");
        System.out.println("      BCH ENTERPRISE VISITOR KIOSK      ");
        System.out.println("========================================");
        System.out.println("                                         ");
        System.out.println("-------------give info here--------------");
        System.out.println("full name-")
        String name = scanner.nextLine();
        System.out.println("email addr")
        String email = scanner.nextLine();
        System.out.println("info:")
        System.out.println(name)
        System.out.println(email)
        // SE: Use scanner.nextLine() to capture 4 data fields
        // SE: Use System.out.println() to render the ASCII badge
    }
}
