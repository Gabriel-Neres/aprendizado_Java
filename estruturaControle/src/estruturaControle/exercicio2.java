package estruturaControle;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        //calcular o imc do usuário
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, digite o seu nome:");
        var name = input.nextLine();
        System.out.printf("%s, digite sua altura:", name);
        var height = input.nextFloat();
        System.out.printf("%s, digite o seu peso:", name);
        var weight = input.nextFloat();

        float userIMC = weight/(height*height);

        var message = "";
        if(userIMC == 18.5) {
            message = "abaixo do peso";
        }else if(userIMC>18.5 && userIMC < 24.9){
            message = "peso ideal";
        }else if(userIMC>25 && userIMC < 29.9){
            message = "levemente acima do peso";
        }else if(userIMC>30 && userIMC < 34.9){
            message = "Obesidade grau 1";
        }else if(userIMC>35 && userIMC < 39.9){
            message = "obesidade grau 2 (severa)";
        }else if(userIMC>40){
            message = "obesidade grau 3 (mórbida)";
        }else{
            message = "peso digitado incorretamente";
        }
    System.out.printf("Olá, %s. Seu imc é de %.2f e este é o resultado: %s",name,userIMC,message);

    }
}
