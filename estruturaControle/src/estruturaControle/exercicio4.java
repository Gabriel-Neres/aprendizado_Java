package estruturaControle;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1,num2;
        String message = "";
        System.out.print("Digite um número:\n");
        num1 = input.nextInt();
        do {
            System.out.println("Digite mais um número:");
            num2 = input.nextInt();

            if(num2<num1){
                continue;
            }
            else{
                if(num2 % num1 == 0){
                    message = "O código parou pois o resto da divisão é zero.";
                } else{
                    message = "O código continua pois o resto da divisão não é zero.";
                }
                System.out.printf("%s / %s = %s e o restante dessa divisão é %s. %s\n",num2,num1,num2/num1,num2%num1,message);
            }
        } while (num2 % num1 != 0);

        input.close();

    }
}