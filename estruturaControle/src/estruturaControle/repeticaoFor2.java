// Define o pacote (estrutura de diretórios) onde a classe se encontra.
package estruturaControle;

// Declara a classe pública 'repeticaoFor2'.
public class repeticaoFor2 {

    // Método principal, o ponto de entrada do programa.
    // 'String[] args' é um array de strings que pode receber argumentos da linha de comando.
    public static void main(String[] args){

        // --- Exemplo 1: Loop 'for' tradicional ---

        // Inicia um loop 'for' que itera sobre os elementos do array 'args'.
        // 'i' é o contador, começando de 0.
        // O loop continua enquanto 'i' for menor que o número de elementos no array 'args' (args.length).
        // 'i' é incrementado em 1 a cada iteração.
        for(var i = 0; i < args.length; i++){
            // Imprime o índice do elemento ('i') seguido do valor do elemento na posição 'i' (args[i]).
            System.out.println(i + " - " + args[i]);
        }

        // Imprime uma linha em branco para separar as saídas dos dois loops.
        System.out.println("\n");

        // --- Exemplo 2: Loop 'for-each' (Enhanced For Loop) ---

        // Inicia um loop 'for-each', uma forma mais simples de iterar sobre arrays e coleções.
        // A cada iteração, um elemento do array 'args' é atribuído à variável 'arg'.
        // Este loop não usa um contador de índice.
        for(var arg : args){
            // Imprime o valor do elemento atual ('arg').
            System.out.println(arg);
        }
    }
}