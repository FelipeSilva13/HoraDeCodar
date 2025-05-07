package Project;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Didite o número que você deseja ver a tabuada: ");
        int numero = teclado.nextInt();

        System.out.println("Tabuada de " + numero + ": ");

        System.out.println(numero + " * 1 = " + (numero * 1));
        System.out.println(numero + " * 2 = " + (numero * 2));
        System.out.println(numero + " * 3 = " + (numero * 3));
        System.out.println(numero + " * 4 = " + (numero * 4));
        System.out.println(numero + " * 5 = " + (numero * 5));
        System.out.println(numero + " * 6 = " + (numero * 6));
        System.out.println(numero + " * 7 = " + (numero * 7));
        System.out.println(numero + " * 8 = " + (numero * 8));
        System.out.println(numero + " * 9 = " + (numero * 9));
        System.out.println(numero + " * 10 = " + (numero * 10));





        teclado.close();
    }
}
