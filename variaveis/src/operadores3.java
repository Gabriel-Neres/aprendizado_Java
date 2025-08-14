/**import java.util.Scanner;

public class operadores3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        var result = input.nextLine();
        System.out.println(result);
    }
}*/
import java.util.Scanner;

public class operadores3 {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler a entrada do usuário
        var input = new Scanner(System.in);

        // --- Pergunta sobre idade e emancipação para verificar a condição de dirigir ---

        // Imprime uma pergunta sobre a idade
        System.out.println("\nQual sua idade?");
        // Lê um número inteiro (a idade) digitado pelo usuário
        var age = input.nextInt();

        // Imprime uma pergunta para saber se a pessoa é emancipada
        System.out.println("\nVocê é emancipado?");
        // Lê um valor booleano ('true' ou 'false') digitado pelo usuário
        var isEmancipated = input.nextBoolean();

        // Cria uma variável booleana 'result1' que armazena o resultado da expressão lógica.
        // A expressão verifica se a pessoa pode dirigir usando duas condições:
        // 1. `age > 17`: A pessoa é maior de 17 anos (idade padrão para dirigir).
        //    OU
        // 2. `(isEmancipated == true && age > 15)`: A pessoa é emancipada E tem mais de 15 anos.
        // O operador `||` (OR) significa que se **qualquer uma** das duas condições for verdadeira, o resultado será `true`.
        // O operador `&&` (AND) significa que **ambas** as sub-condições devem ser verdadeiras.
        var result1 = age > 17 || (isEmancipated == true && age > 15);

        // Imprime a resposta formatada, informando se a pessoa tem condições de dirigir.
        // O (%s) será substituído pelo valor da variável 'result1' (true ou false).
        System.out.printf("Você tem condições para dirigir? (%s)", result1);

        // É uma boa prática fechar o Scanner para liberar recursos
        input.close();
    }
}
