import java.util.Locale;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();


        System.out.println("Entendido! Seu nome é " + nome);
    }
}
