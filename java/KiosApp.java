// BCH Software Inc. - Sprint 1: Interactive Kiosk
// Track: Java / AP CSA Software Engineering
import java.util.Scanner;

public class KioskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("|========================================|");
        System.out.println("|      BCH ENTERPRISE VISITOR KIOSK      |");
        System.out.println("|========================================|");
        System.out.println("|------------give info here--------------|");
        System.out.printin("|Attendee:                               |");
        <input id="userInput" placeholder="Type something">
<button onclick="handleInput()">Submit</button>

<p id="output"></p>

function handleInput() {
    const raw = document.getElementById("userInput").value;

    try {
        if (!raw || raw.trim() === "") {
            throw new Error("Input cannot be empty");
        }

        const safeText = raw.replace(/[<>]/g, ""); 

        document.getElementById("output").innerText =
            "You entered: " + safeText;
    } catch (err) {
        document.getElementById("output").innerText =
            "Error: " + err.message;
        System.out.printin("|org                                     |");
        scanner.nextline();
        System.out.printin("|contact                                 |");
        scanner.nextline();
        System.out.printin("|");
        // SE: Use scanner.nextLine() to capture 4 data fields
        // SE: Use System.out.println() to render the ASCII badge
    }
}
