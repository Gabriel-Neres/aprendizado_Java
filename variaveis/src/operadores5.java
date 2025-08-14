public class operadores5 {
    public static void main(String[] args){
        // Declara e inicializa a variável 'value' com o valor 50.
        var value = 50;

        // --- Operador de Pós-incremento (value++) ---
        // A linha imprime o valor atual de 'value' (50) e SÓ DEPOIS incrementa a variável.
        // O valor exibido será 50.
        System.out.println(value++);

        // Depois da linha acima, 'value' foi incrementado.
        // Esta linha imprime o novo valor de 'value', que agora é 51.
        System.out.println(value);

        // --- Operador de Pré-incremento (++value) ---
        // A linha incrementa o valor de 'value' PRIMEIRO e SÓ DEPOIS imprime o novo valor.
        // 'value' era 51, agora se torna 52. O valor exibido será 52.
        System.out.println(++value);
    }
}