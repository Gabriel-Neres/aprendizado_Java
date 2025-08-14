import java.time.OffsetDateTime;

// A palavra-chave 'public' torna a classe acessível de qualquer lugar.
// A classe 'Person' é a "planta" ou o "molde" para criar objetos do tipo pessoa.
public class Person {

    // --- Atributos (Características do Objeto) ---
    // 'private' restringe o acesso direto a estas variáveis apenas aos métodos dentro desta classe (encapsulamento).
    private String name;

    private int age;

    // 'static' significa que esta variável pertence à classe, não a um objeto específico.
    // Todos os objetos 'Person' compartilham a mesma instância de 'test'.
    private static String test;

    // --- Construtores ---
    // Construtor padrão (sem argumentos).
    // Cria um objeto 'Person' sem inicializar 'name' ou 'age' com valores específicos.
    public Person() {}

    // Construtor que recebe um nome como argumento.
    // Inicializa o atributo 'name' com o valor passado e 'age' com 1.
    public Person(String name) {
        this.name = name;
        this.age = 1;
    }

    // Variável de instância inicializada com o ano atual no momento em que o objeto é criado.
    // 'private' garante que só pode ser modificada por métodos da classe.
    private int lastYearAgeInc = OffsetDateTime.now().getYear();

    // --- Métodos (Comportamentos do Objeto) ---

    // Método para incrementar a idade, mas apenas uma vez por ano.
    // 'void' indica que o método não retorna nenhum valor.
    public void incAge() {
        // Verifica se o ano atual é igual ou menor que o ano da última atualização.
        // Se a idade já foi incrementada neste ano, o método 'return' para sua execução.
        if (this.lastYearAgeInc >= OffsetDateTime.now().getYear()) return;

        // Incrementa a idade.
        this.age += 1;

        // Atualiza a variável 'lastYearAgeInc' com o ano atual para evitar múltiplas atualizações no mesmo ano.
        this.lastYearAgeInc = OffsetDateTime.now().getYear();
    }

    // Este é um método "getter". Ele retorna o valor atual do atributo 'name'.
    // A palavra-chave 'public' permite que outras classes acessem este método.
    // 'String' é o tipo de dado que este método retorna.
    public String getName() {
        return name;
    }

    // Este é um método "setter". Ele permite definir um novo valor para o atributo 'name'.
    // 'void' significa que o método não retorna nenhum valor.
    // '(String name)' é o parâmetro que o método recebe.
    // 'this.name' se refere ao atributo da classe, enquanto 'name' se refere ao parâmetro.
    public void setName(String name) {
        this.name = name;
    }

    // Método "getter" para o atributo 'age'.
    public int getAge() {
        return age;
    }

    // O código abaixo está comentado e não é executado.
    // 'static' significa que este método pertence à classe em si, e não a um objeto específico.
    // Ele poderia ser chamado diretamente pela classe (ex: Person.teste()).
    // public static String teste(){
    //     return "teste";
    // }

    // Método "setter" para o atributo 'age'.
    // Ele recebe um novo valor para a idade e o atribui ao atributo 'age' do objeto.
    public void setAge(int age) {
        this.age = age;
    }

    // Método estático para definir o valor da variável 'test'.
    // Como 'test' é estática, este método também deve ser.
    public static void setTest(String testParam) {
        test = testParam;
    }

    // Método estático para obter o valor da variável 'test'.
    // Acessa a variável estática 'test' para retornar seu valor.
    public static String getTest() {
        return test;
    }
}