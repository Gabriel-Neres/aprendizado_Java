import java.util.Scanner;


public class aula1 {

    //declarando uma variavel global
    private final static String WELCOME_MESSAGE = "Olá, informe o seu nome:";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(WELCOME_MESSAGE);
        String name = input.next();
        System.out.println("Informe seu nome:");
        int age = input.nextInt();
        System.out.printf("Olá %s sua idade é %s \n", name, age);
    }
}
/** primeiro aprendizado com JAVA */
//ola mundo com java