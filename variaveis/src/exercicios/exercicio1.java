package exercicios;
import java.util.Scanner;
import java.time.LocalDate;

public class exercicio1 {
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            String nome;
            int anoNascimento;
            LocalDate anoAtual = LocalDate.now();

            System.out.println("Digite o seu nome:");
            nome = input.nextLine();
            System.out.println("Digite o ano que você nasceu:");
            anoNascimento = input.nextInt();

            var resultIdade = anoAtual.getYear() - anoNascimento;
            System.out.printf("Olá, %s! Você tem %s anos.", nome, resultIdade);
        }
}
