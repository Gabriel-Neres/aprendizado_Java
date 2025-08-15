import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        classContaBanco minhaConta = new classContaBanco();
        Scanner input = new Scanner(System.in);
        var controlador = true;
        var opcao = 0;
        var userName = "";
        var userPass = 0;
        float valorComparacao = 0;
        float dinheiro = 0;



        do{

            System.out.println("Bem vindo ao iLaú!\n");
            System.out.println("Deseja criar sua conta?");
            System.out.println("1 - Sim");
            System.out.println("2 - Não");
            opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("Digite o seu nome:\n");
                System.out.print(">>");
                userName = input.nextLine();userName = input.nextLine();
                System.out.println("Digite sua nova senha:\n");
                System.out.print(">>");
                userPass = input.nextInt();
                System.out.println("Para abrir a conta você precisa depositar um valor. Digite o valor que você irá depositar:\n");
                System.out.print(">>");
                final float dinheiroAbrirConta = input.nextInt();

                //boolean clientePremium = dinheiroAbrirConta > 500 ? true:false;

                //cadastrando conta
                minhaConta.cadastroConta(userName,userPass,dinheiroAbrirConta);
                minhaConta.atualizarSaqueEspecial();

                System.out.println("Sua conta foi criada com sucesso!");

                do {
                    System.out.printf("Olá, %s! Tudo bem?\n\nOpções:\n" +
                            "1 - Consultar saldo\n" +
                            "2 - Consultar cheque especial\n" +
                            "3 - Depositar dinheiro\n" +
                            "4 - Sacar dinheiro\n" +
                            "5 - Pagar um boleto\n"+
                            "6 - Fechar", minhaConta.nomeUsuario);

                    opcao = input.nextInt();

                    if(opcao == 1){System.out.printf("Saldo conta corrente: R$ %.2f",minhaConta.consultarSaldo());}

                    else if(opcao == 2){System.out.printf("Saldo cheque especial: R$ %.2f",minhaConta.consultarChequeEspecial());}

                    else if(opcao == 3){
                        System.out.println("Digite o valor do depósito:");
                        System.out.print(">>");
                        dinheiro = input.nextFloat();

                        if(dinheiroAbrirConta > 500 && minhaConta.consultarChequeEspecial() < dinheiroAbrirConta/2 ){
                                valorComparacao = dinheiroAbrirConta/2 - minhaConta.consultarChequeEspecial();
                                minhaConta.depositoChequeEspecial(dinheiroAbrirConta/2);}
                            else if (dinheiroAbrirConta > 500 && minhaConta.consultarChequeEspecial() == dinheiroAbrirConta/2 ){
                                minhaConta.depositoConta(dinheiro);}
                            else if(dinheiroAbrirConta <= 500 && minhaConta.consultarChequeEspecial() < 50){
                                valorComparacao = 50 - minhaConta.consultarChequeEspecial();
                                minhaConta.depositoChequeEspecial(50);
                                minhaConta.depositoConta(dinheiro - valorComparacao);}
                            else if (dinheiroAbrirConta > 500 && minhaConta.consultarChequeEspecial() == 50 ){
                                minhaConta.depositoConta(dinheiro);}

                        System.out.printf("Valores atualizados!\nSaldo conta: R$%.2f\nSaldo cheque especial:R$%.2f\n",minhaConta.consultarSaldo(),minhaConta.consultarChequeEspecial());

                    }

                }while(controlador);






            }else if(opcao == 2){
                controlador = false;
            }
            else{
                System.out.println("Opção incorreta.\n");
                continue;
            }


        }while(controlador);

    }
}