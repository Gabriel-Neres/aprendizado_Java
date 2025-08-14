import java.util.Scanner;

public class operadores4 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário a partir do console.
        Scanner input = new Scanner(System.in);

        // --- Leitura dos dados ---
        System.out.println("Informe o primeiro numero:");
        // Lê um número inteiro da entrada do usuário.
        int num1 = input.nextInt();

        System.out.println("Informe o segundo numero:");
        // Lê um número decimal (ponto flutuante) da entrada do usuário.
        float num2 = input.nextFloat();

        // --- Cálculos e exibição ---
        // Realiza a soma e imprime o resultado formatado.
        // O %.2f garante que o número float seja exibido com duas casas decimais.
        System.out.printf("A soma de %d + %.2f = %.2f\n", num1, num2, num1 + num2);

        // Armazena o resultado da soma em uma variável float para operações futuras.
        float value = num1 + num2;

        // Adiciona 10 ao valor da variável 'value'. É um operador de atribuição de adição.
        value += 10;

        // Subtrai 8 do valor de 'value'. É um operador de atribuição de subtração.
        value -= 8;

        // --- Exibição de resultados finais ---
        // Imprime o valor final da variável 'value'.
        System.out.printf("Variável 'value' depois das mudanças = %.2f\n", value);

        // Calcula e imprime a raiz quadrada de 'value' usando a função Math.sqrt().
        System.out.printf("A raiz quadrada de 'value' = %.2f\n", Math.sqrt(value));

        // Calcula e imprime a potência de 2 de 'value' usando a função Math.pow().
        System.out.printf("A potência de 2 de 'value' = %.2f\n", Math.pow(value, 2));

        // Fecha o objeto Scanner para liberar os recursos do sistema.
        input.close();
    }
}