package nestedLoops;

public class Loops {
    public static void main(String[] args){
    //nested loops
        for(int m = 1; m <= 3; m++){
        System.out.println("EXTERNO!");

            for (int n = 1; n <= 3; n++) {
            System.out.println("INTERNO!");
            System.out.println(m + " x " + n + " = " + (m * n));
            }
        }
        //Padrão de estrelas
        for(int i = 1; i <= 15; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}