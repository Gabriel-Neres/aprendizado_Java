package exercicios;
import java.util.Scanner;


public class exercicio4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome1;
        int idade1;
        String nome2;
        int idade2;

        System.out.println("Olá, primeiro usuário, digite o seu nome:");
        nome1 = input.nextLine();
        System.out.println("Agora digite sua idade:");
        idade1 = input.nextInt();
        input.nextLine(); // Adicione esta linha para consumir a quebra de linha pendente

        System.out.println("Olá, segundo usuário, digite o seu nome:");
        nome2 = input.nextLine();
        System.out.println("Agora digite sua idade:");
        idade2 = input.nextInt();
        input.nextLine(); // Boa prática: adicione também aqui se houver mais entradas

        // Exemplo de como você poderia usar as variáveis depois
        System.out.println("Nomes lidos: " + nome1 + " e " + nome2);
        System.out.println("Idades lidas: " + idade1 + " e " + idade2);

        var result = idade1 - idade2;

        if(result < 0){
            result *= -1;
        };

        System.out.printf("%s e %s, a diferença da idade de vocês é %s.", nome1,nome2,result);
    }
}
