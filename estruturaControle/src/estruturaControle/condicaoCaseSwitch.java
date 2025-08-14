// Define o pacote (estrutura de diretórios) onde a classe se encontra.
package estruturaControle;
// Importa a classe Scanner do pacote java.util para ler a entrada do usuário.
import java.util.Scanner;

// Declara a classe pública 'condicaoCaseSwitch'.
public class condicaoCaseSwitch {
    // Método principal, ponto de entrada para a execução do programa.
    public static void main(String[] args){
        // Cria um objeto Scanner para ler dados do console.
        var input = new Scanner(System.in);

        // --- Exemplo 1: Switch Statement (Formato Tradicional) ---

        // Imprime uma mensagem para o usuário.
        System.out.println("Digite um numero de 1 a 7:");
        // Lê o próximo número inteiro e armazena na variável 'option'.
        var option = input.nextInt();

        // Inicia a estrutura de controle 'switch' com a variável 'option'.
        switch (option){
            // Agrupa os casos 1 e 7, pois a ação é a mesma para ambos.
            case 1 :
            case 7 :
                // Se a opção for 1 ou 7, imprime "Fim de Semana!".
                System.out.println("Fim de Semana!");
                // Usa 'break' para sair do switch e evitar que o código continue para o próximo caso.
                break;
            case 2 :
                // Se a opção for 2, imprime "Segunda".
                System.out.println("Segunda");
                break;
            case 3 :
                // Se a opção for 3, imprime "Terça-Feira".
                System.out.println("Terça-Feira");
                break;
            case 4 :
                // Se a opção for 4, imprime "Quarta-Feira".
                System.out.println("Quarta-Feira");
                break;
            case 5 :
                // Se a opção for 5, imprime "Quinta-Feira".
                System.out.println("Quinta-Feira");
                break;
            case 6 :
                // Se a opção for 6, imprime "Sexta-Feira".
                System.out.println("Sexta-Feira");
                break;
            default:
                // Se a opção não corresponder a nenhum dos casos anteriores, executa esta linha.
                System.out.println("Opção inválida");
        }

        // --- Exemplo 2: Switch Expression (Formato Moderno com Seta) ---

        // Imprime uma mensagem para o usuário.
        System.out.println("Digite uma vogal e descubra a palavra:");
        // Lê a próxima palavra (String) e armazena em 'option2'.
        var option2 = input.next();

        // Inicia uma 'switch expression' (que retorna um valor).
        // Converte 'option2' para minúsculo para a comparação ser insensível a maiúsculas.
        var message = switch (option2.toLowerCase()) {
            // Se a opção for "a", retorna a string "Abelha".
            case "a" -> "Abelha";
            case "e" -> "Escola";
            case "i" -> "Igreja";
            case "o" -> "Ouvido";
            case "u" -> "Util";
            // Se a opção não corresponder, retorna "Opção inválida.".
            default -> "Opção inválida.";
        };
        // Imprime o valor retornado pela 'switch expression'.
        System.out.println(message);

        // --- Exemplo 3: Switch Expression (com Bloco de Código e yield) ---

        // Imprime uma mensagem para o usuário.
        System.out.println("Digite um numero de 1 a 7:");
        // Lê o próximo número inteiro e armazena em 'option3'.
        var option3 = input.nextInt();

        // Inicia outra 'switch expression'.
        var message3 = switch (option3) {
            // Agrupa os casos 1 e 7. O bloco de código '{...}' permite mais de uma instrução.
            case 1, 7 -> {
                // Usa o operador ternário para atribuir "Domingo" ou "Sábado" à variável 'day'.
                var day = option3 == 1 ? "Domingo" : "Sábado";
                // Usa 'yield' para retornar a string formatada para a 'switch expression'.
                yield String.format("Hoje é %s, fim de semana uhhul\\o/", day);
            }
            case 2 -> "Segunda";
            case 3 -> "Terça-Feira";
            case 4 -> "Quarta-Feira";
            case 5 -> "Quinta-Feira";
            case 6 -> "Sexta-Feira";
            default -> "Opção inválida.";
        };
        // Imprime o valor retornado.
        System.out.println(message3);

        // Fecha o objeto Scanner para liberar recursos.
        input.close();
    }
}