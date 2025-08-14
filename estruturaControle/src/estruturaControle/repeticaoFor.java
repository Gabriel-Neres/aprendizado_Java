// Define o pacote (estrutura de diretórios) onde a classe se encontra.
package estruturaControle;

// Importa a classe Scanner para permitir a entrada de dados do usuário.
import java.util.Scanner;

// Declara a classe pública 'repeticaoFor'.
public class repeticaoFor {

    // Método principal, o ponto de entrada do programa.
    public static void main(String[] args){

        // Cria uma instância de Scanner para ler a entrada do teclado.
        var input = new Scanner(System.in);

        // Declara a variável 'name' do tipo String e a inicializa como uma string vazia.
        String name = "";

        // Inicia um loop 'for' que irá iterar 99 vezes (de 1 a 99).
        // 'i' é o contador, inicializado com 1.
        // O loop continua enquanto 'i' for menor que 100.
        // 'i' é incrementado em 1 a cada iteração.
        for(var i = 1; i < 100; i++){

            // Inicia um loop 'for' interno que é infinito, pois não tem condição de parada.
            // A sintaxe ';;' cria um loop que, por si só, nunca termina.
            for(;;){
                // Solicita ao usuário que digite um nome.
                System.out.println("Digite um nome:");

                // Lê a linha de texto completa digitada pelo usuário e armazena na variável 'name'.
                name = input.nextLine();

                // A instrução 'break' interrompe imediatamente o loop interno infinito.
                // Isso faz com que a execução volte para o loop 'for' externo.
                break;
            }

            // Imprime o valor atual do contador do loop externo ('i').
            // Essa linha é executada a cada vez que o loop interno é quebrado.
            System.out.println(i);
        }

        // O programa não tem um comando para fechar o Scanner, o que é uma boa prática.
        // O loop externo termina após 99 iterações.
    }
}