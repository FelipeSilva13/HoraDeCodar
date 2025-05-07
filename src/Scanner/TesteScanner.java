package Scanner;
import java.util.Scanner;
public class TesteScanner {
    public static void main(String[] args) {
        // 1 - Tetando Scanner
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Digite seu Nome: ");

        String nome = teclado.nextLine();

        System.out.println("Olá, " + nome + "!");
        //nextInt
        System.out.println("Digite sua Idade: ");

        int idade = teclado.nextInt();

        System.out.println("Sua idade é: " + idade + " anos.");

        System.out.println("Digite um número: ");
        int n = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Digite um texto qualquer: ");

        String txt = teclado.nextLine();
        System.out.println("Os dados são, n = " + n + " e txt = " + txt);



        teclado.close();

    }

}
