import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una cadena de texto: ");
        String input = scanner.nextLine();

        System.out.println("Has escrito: " + input);

        scanner.close();
    }
}
