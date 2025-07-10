package MediaAluno;
import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = teclado.nextLine();

        System.out.println("Digite a nota 1: ");
        double nota1 = teclado.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = teclado.nextDouble();

        System.out.println("digite a nota 3: ");
        double nota3 = teclado.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("O nome do aluno é: " + nome + " e sua média foi: " + media);

        if (media >= 7){
            System.out.println("Aprovado!");
        }else {
            System.out.println("Reprovado!");
        }

        teclado.close();


    }




}
