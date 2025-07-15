package Project;

/**
 *
 * O usuarionprecisa acertar um número aleatório entre 1 e 100
 *
 * 1 - Criar o número aleatório entre 1 e 100
 * 2 - Pedir o palpite do usuário
 * 3 - Salvara as tentativas que foram erradas(contagem)
 * 4 - Enquanto o usuário não acertq, exibir se o número é maior ou menor que o palpite
 * 5 - Exibir mensagem de sucesso se ele acertar, com o número de
 *
 */

import java.util.Scanner;
import java.util.Random;

public class JogoAdivinha {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        //Obter o número aleatório

        int numeroSecreto = random.nextInt(100) + 1;

        int palpite = 0;
        int tentativas = 0;

        System.out.println(numeroSecreto);

        while (palpite != numeroSecreto){

            System.out.println("Digite seu palpite: ");
            palpite = teclado.nextInt();

            tentativas++;

            if (palpite < numeroSecreto){
                System.out.println("O número é maior que " + palpite + " Tente novamente!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor que " + palpite + " Tente novamente!");
            }else {
                System.out.println("Parabéns, o número secreto " + numeroSecreto + " Foi encontrado e você acertou com " + tentativas + " tentativas!");
            }

        }

        teclado.close();

    }
}
