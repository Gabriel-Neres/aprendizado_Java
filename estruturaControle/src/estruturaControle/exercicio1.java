package estruturaControle;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){
        //exer dio.me formação em java - tabuada

        Scanner input = new Scanner(System.in);

        System.out.println("De qual número você quer receber a tabuada de 1 a 10?");
        var numTabuada = input.nextInt();
        int count = 1;
        while(count <= 10){
            var numMult = numTabuada*count;
            System.out.printf("%s * %s = %s\n",numTabuada,count,numMult);
            count++;
        }
    }



}
