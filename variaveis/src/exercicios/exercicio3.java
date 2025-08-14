package exercicios;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        float ladoRetangulo1;
        float ladoRetangulo2;

        System.out.println("Digite o cumprimento do retangulo:");
        ladoRetangulo1 = input.nextFloat();
        System.out.println("Digite o altura do retangulo:");
        ladoRetangulo2 = input.nextFloat();
        var result = ladoRetangulo1*ladoRetangulo2;
        System.out.printf("A área do retangulo é %.2f", result);
    }
}
