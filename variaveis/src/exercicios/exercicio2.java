package exercicios;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float ladoQuadrado;

        System.out.println("Digite o lado do quadrado:");
        ladoQuadrado = input.nextFloat();

        System.out.printf("A área do quadrado é %s.", ladoQuadrado*ladoQuadrado);
    }
}
