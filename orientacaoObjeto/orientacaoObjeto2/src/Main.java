public class Main {
    public static void main(String[] args) {
        var person = new Person("Gabriel");
        System.out.println(person.name()+" e "+person.age());
        System.out.println(person.getInfo());
        System.out.println(person.name());
    }
}