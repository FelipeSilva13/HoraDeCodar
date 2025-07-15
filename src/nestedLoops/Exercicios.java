package nestedLoops;

public class Exercicios {
    public static void main(String[] args) {
        // Exercicio 1
        int somatorio = 0;

        for (int i = 1; i <= 100; i++) {
            somatorio += i;
        }
        System.out.println("Somatorio de 1 até 100: " + somatorio);

        //Exercicio

        int num = 1;

        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println("Numero par: " + num);
            }
            num++;

        }

    }
}