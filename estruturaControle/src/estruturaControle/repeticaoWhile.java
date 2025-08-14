package estruturaControle;
import java.util.Scanner;

public class repeticaoWhile {
    public static void main(String[] args){
        var input = new Scanner(System.in);
        var name = "";

        while(!name.equals("exit")){
            System.out.println("Digite o seu nome:");
            name = input.next();
            System.out.println(name);
        }
        do{
            System.out.println("Digite o seu nome:");
            name = input.next();
            System.out.println(name);
        }while (!name.equals("exit"));
    }
}
