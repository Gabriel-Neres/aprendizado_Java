// 'record' é uma nova funcionalidade do Java (a partir da versão 16)
// que serve como um tipo de classe especial para criar classes imutáveis de forma concisa.
// Ele automaticamente gera construtores, getters, os métodos equals(), hashCode() e toString().
// Por padrão, todos os atributos ('name' e 'age') são 'private final'.
public record Person(String name, int age) {

    // --- Construtores (Compacto e Canônico) ---

    // Este é o construtor "compacto".
    // Ele não tem uma lista de parâmetros explicitamente declarada.
    // O Java assume que os parâmetros são os mesmos que os componentes do record ('name' e 'age').
    // Ele é usado principalmente para validações antes que os campos sejam inicializados.
    // Neste caso, não há validação, então ele não faz nada, mas é uma demonstração de sua sintaxe.
    public Person {
        // Exemplo de validação:
        // if (age < 0) {
        //     throw new IllegalArgumentException("A idade não pode ser negativa.");
        // }
    }

    // Este é um construtor "secundário" ou "customizado".
    // Ele permite criar um objeto 'Person' fornecendo apenas o 'name'.
    // A palavra-chave 'this' é usada para chamar o construtor principal (o canônico)
    // passando o 'name' recebido e um valor padrão para a 'age' (1, neste exemplo).
    public Person(String name) {
        this(name, 1);
    }

    // --- Métodos Adicionais ---

    // Este é um método de instância customizado.
    // Ele retorna uma string formatada com as informações do nome e da idade.
    // Os campos 'name' e 'age' podem ser acessados diretamente (porque o record cria getters automáticos).
    public String getInfo() {
        // O record já tem métodos "getters" implícitos, como 'name()' e 'age()'.
        // No entanto, aqui estamos acessando os campos diretamente para ilustrar o uso.
        return "Nome = " + name + ", Idade = " + age;
    }
}