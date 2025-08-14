// Define o pacote (estrutura de diretórios) onde a classe se encontra.
package estruturaControle;
// Importa a classe Scanner do pacote java.util para ler a entrada do usuário.
import java.util.Scanner;

// Declara a classe pública 'condicaoifelse'.
public class condicaoifelse {
    // Método principal, ponto de entrada para a execução do programa.
    public static void main(String[] args){
        // Cria um objeto Scanner para ler dados do console.
        Scanner input = new Scanner(System.in);

        // Imprime uma mensagem para o usuário.
        System.out.println("Infome o seu nome:");
        // Lê a linha de texto digitada pelo usuário e armazena na variável 'name'.
        var name = input.nextLine();
        // Imprime uma mensagem para o usuário.
        System.out.println("Infome a sua idade:");
        // Lê o próximo número inteiro digitado e armazena na variável 'age'.
        var age = input.nextInt();
        // Imprime uma mensagem para o usuário.
        System.out.println("Você é emancipado? (s/n)") ;
        // Lê a próxima palavra (token) digitada e armazena na variável 'isEmancipated'.
        String isEmancipated = input.next();

        // Início da estrutura de decisão 'if-else if-else'.
        // Verifica se a idade é maior ou igual a 18.
        if (age >= 18 ) {
            // Se a condição for verdadeira, imprime uma mensagem formatada.
            System.out.printf("%s, você tem %s anos e pode dirigir.\n", name,age);
        }
        // Se a primeira condição for falsa, verifica se a idade é maior ou igual a 16 E a string 'isEmancipated' (convertida para minúscula) é igual a "s".
        else if (age >= 16 && isEmancipated.toLowerCase().equals("s")){
            // Se a segunda condição for verdadeira, imprime uma mensagem formatada.
            System.out.printf("%s, você tem %s anos e pode dirigir.\n", name,age);
        }
        // Se nenhuma das condições anteriores for verdadeira.
        else{
            // Imprime a mensagem padrão para quem não pode dirigir.
            System.out.printf("%s, você tem %s anos e não pode dirigir.\n",name,age);
        }

        // --- Simplificando a lógica de decisão com operador ternário ---

        // Cria uma variável booleana 'canDrive'.
        // A lógica é: (idade >= 18) OU (idade >= 16 E resposta de emancipação é "s", ignorando maiúsculas).
        var canDrive = (age>=18) || (age>=16 && isEmancipated.equalsIgnoreCase("s"));

        // Usa o operador ternário para atribuir um valor à variável 'message' baseado na condição 'canDrive'.
        // Se 'canDrive' for verdadeiro, a primeira string é atribuída; caso contrário, a segunda.
        var message = canDrive ?
                name + ", você tem "+age+" anos e pode dirigir." :
                name + ", você tem "+age+" anos e não pode dirigir." ;

        // Imprime a mensagem final.
        System.out.println(message);

        // Imprime uma mensagem de finalização do programa.
        System.out.println("Finish of app.");

        // Fecha o objeto Scanner para liberar recursos.
        input.close();
    }
}