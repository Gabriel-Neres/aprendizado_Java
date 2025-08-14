public class Main {
    public static void main(String[] args) {

        var male = new Person("Gabriel");
        male.incAge();
        Person.setTest("123456");

        final String test = "teste";

        var female = new Person();
        female.setName("Luciana");
        female.incAge();

        System.out.printf("Male name: %s and Male age: %s. Teste: %s.", male.getName(),male.getAge(),Person.getTest());
    }
}