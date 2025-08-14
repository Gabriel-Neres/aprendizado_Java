public class operadoresBitWise {
    public static void main(String[] args) {
        // --- Configuração das variáveis ---

        // Declara e inicializa a primeira variável com o valor decimal 6.
        int value1 = 6;
        // Converte o valor 6 para sua representação binária (110).
        String binary1 = Integer.toBinaryString(value1);
        System.out.printf("Primeiro número da operação: %d (representação binária %s)\n", value1, binary1);

        // Declara e inicializa a segunda variável com o valor decimal 2.
        int value2 = 2;
        // Converte o valor 2 para sua representação binária (10).
        String binary2 = Integer.toBinaryString(value2);
        System.out.printf("Segundo número da operação: %d (representação binária %s)\n", value2, binary2);

        // --- Operação Bitwise OR (`|`) ---

        // Realiza a operação "OU" bitwise. Se um ou ambos os bits forem 1, o resultado é 1.
        // Binário de 6: 110
        // Binário de 2: 010
        // -----------------
        // Resultado:    110 (decimal 6)
        int orResult = value1 | value2;
        String orBinaryResult = Integer.toBinaryString(orResult);
        System.out.printf("%d | %d = %d (representação binária %s)\n", value1, value2, orResult, orBinaryResult);

        // --- Operação Bitwise AND (`&`) ---

        // Realiza a operação "E" bitwise. O bit de resultado é 1 apenas se AMBOS os bits forem 1.
        // Binário de 6: 110
        // Binário de 2: 010
        // -----------------
        // Resultado:    010 (decimal 2)
        int andResult = value1 & value2;
        String andBinaryResult = Integer.toBinaryString(andResult);
        System.out.printf("%d & %d = %d (representação binária %s)\n", value1, value2, andResult, andBinaryResult);

        // --- Operação Bitwise XOR (`^`) ---

        // Realiza a operação "OU Exclusivo" bitwise. O bit de resultado é 1 apenas se OS BITS FOREM DIFERENTES.
        // Binário de 6: 110
        // Binário de 2: 010
        // -----------------
        // Resultado:    100 (decimal 4)
        int xorResult = value1 ^ value2;
        String xorBinaryResult = Integer.toBinaryString(xorResult);
        System.out.printf("%d ^ %d = %d (representação binária %s)\n", value1, value2, xorResult, xorBinaryResult);
    }
}