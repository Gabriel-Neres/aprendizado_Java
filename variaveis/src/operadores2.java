import java.util.Scanner;

public class operadores2 {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler a entrada do usuário
        var input = new Scanner(System.in);

        // --- Primeira parte: Verificando uma resposta ---

        // Imprime uma pergunta para o usuário
        System.out.println("Quanto é 2 + 2 ?");
        // Lê um número inteiro digitado pelo usuário e armazena na variável 'result'
        var result = input.nextInt();

        // Cria uma variável booleana 'boolResult'.
        // Ela recebe 'true' se o valor de 'result' for igual a 4, e 'false' caso contrário.
        boolean boolResult = result == 4;

        // Imprime a resposta formatada, mostrando se o usuário acertou ou não.
        // O (%s) será substituído pelo valor da variável 'boolResult' (true ou false).
        System.out.printf("O resultado é 4, você acertou? (%s)", boolResult);

        // --- Segunda parte: Verificando a idade ---

        // Pula para a próxima linha para organizar a saída
        System.out.println("\nQual sua idade?");
        // Lê um número inteiro (a idade) digitado pelo usuário
        var age = input.nextInt();

        // Cria uma variável booleana 'result1'.
        // Ela recebe 'true' se a idade for maior que 17, e 'false' caso contrário.
        var result1 = age > 17;

        // Imprime a resposta formatada, informando se a pessoa pode dirigir ou não.
        // O (%s) será substituído pelo valor da variável 'result1' (true ou false).
        System.out.printf("Você tem idade para dirigir? (%s)", result1);

        // É uma boa prática fechar o Scanner para liberar recursos.
        input.close();
    }
}