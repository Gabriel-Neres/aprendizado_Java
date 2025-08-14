public class operadoresBitWise2 {
    public static void main(String[] args){
        // Declara e inicializa a variável 'value1' com o valor decimal -8.
        int value1 = -8;

        // Converte o valor de 'value1' para sua representação binária e armazena em 'binary1'.
        // Para números negativos, 'toBinaryString' usa a representação de complemento de dois.
        // O valor -8 em binário de 32 bits é 11111111111111111111111111111000.
        var binary1 = Integer.toBinaryString(value1);

        System.out.printf("Primeiro número da operação: %d (representação binária %s)\n", value1, binary1);

        // --- Operação Bitwise de Negação (~) ---

        // O operador '~' (bitwise NOT) inverte todos os bits de 'value1'.
        // Na representação de complemento de dois, inverter os bits de 'N' resulta em '-(N+1)'.
        // Portanto, a negação de -8 (11111000) é -( -8 + 1) = -(-7) = 7.
        int result = ~value1;

        // Converte o resultado decimal (7) para sua representação binária.
        // O valor 7 em binário é 111.
        String binaryResult = Integer.toBinaryString(result);

        // Imprime o resultado da operação de negação.
        System.out.printf("~%d = %d (representação binária %s)\n", value1, result, binaryResult);

        //--- Operação de Deslocamento para a Direita com Sinal (Signed Right Shift) >> ---
        // Este operador '>>' move todos os bits de 'value1' para a direita, preservando o bit de sinal.
        System.out.println("\n--- Operação de Deslocamento para a Direita com Sinal (>>)");

        int value2 = 2; // Desloca 2 posições.
        var binary2 = Integer.toBinaryString(value2);

        System.out.printf("Primeiro número da operação: %d (representação binária %s)\n", value1, binary1);
        System.out.printf("Segundo número da operação: %d (representação binária %s)\n", value2, binary2);

        // -8 em binário (complemento de dois) é 11111111111111111111111111111000.
        // Deslocando 2 posições para a direita, com replicação do bit de sinal (1):
        // Resultado em binário: 11111111111111111111111111111110, que é -2.
        int result2 = value1 >> value2;

        var binaryResult2 = Integer.toBinaryString(result2);

        System.out.printf("%d >> %d = %d (representação binária %s)\n", value1, value2, result2 ,binaryResult2);

        //--- Operação de Deslocamento para a Direita sem Sinal (Unsigned Right Shift) >>> ---
        // Este operador '>>>' move todos os bits para a direita, preenchendo os espaços vazios à esquerda com '0'.
        // Ele não preserva o bit de sinal, tratando o número como um valor positivo.
        System.out.println("\n--- Operação de Deslocamento para a Direita sem Sinal (>>>)");

        // O valor inicial é o mesmo: -8 (11111111111111111111111111111000).
        // Deslocando 2 posições para a direita, preenchendo com zeros à esquerda:
        // O resultado em binário será: 00111111111111111111111111111110.
        // Isso resulta em um número positivo muito grande.
        int result3 = value1 >>> value2;

        var binaryResult3 = Integer.toBinaryString(result3);

        System.out.printf("%d >>> %d = %d (representação binária %s)\n", value1, value2, result3 ,binaryResult3);
    }
}