package estruturaControle;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite um numero:");
            var num1 = input.nextInt();
            System.out.println("Digite um número maior que o anterior:");
            var num2 = input.nextInt();

            System.out.println("Deseja receber os números impares (1) ou pares (2)?\n1\n2 ");
            var numTest = input.nextInt();

            var count = num1;
            if (numTest == 1){
                System.out.println("Segue abaixo a lista de números impares:");
                while(count != num2){
                    if (count % 2 != 0) {
                        // Se não for o primeiro número, adicione uma vírgula antes
                        // println quebra linha e o print não quebra
                        System.out.print(count);
                        if (count >= num1 && count != num2) {
                            System.out.print(", ");
                        }
                    }
                    count++;
                }
            }else if(numTest==2 ){
                System.out.println("Segue abaixo a lista de números pares:");
                while(count <= num2){
                    if (count % 2 == 0) {
                        // Se não for o primeiro número, adicione uma vírgula antes
                        // println quebra linha e o print não quebra
                        System.out.print(count);
                        if (count >= num1 && count != num2) {
                            System.out.print(", ");
                        }
                    }
                    count++;
                }
            }
        }
    }

