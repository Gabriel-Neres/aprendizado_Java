import java.time.OffsetDateTime;
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
            System.out.print(">>");
            opcao = input.nextInt();

            if(opcao == 1){
                System.out.println("Digite o seu nome:");
                System.out.print(">>");
                userName = input.nextLine();userName = input.nextLine();
                System.out.println("Digite sua nova senha:");
                System.out.print(">>");
                userPass = input.nextInt();
                System.out.println("Para abrir a conta você precisa depositar um valor. Digite o valor que você irá depositar:");
                System.out.print(">>");
                final float dinheiroAbrirConta = input.nextFloat();

                //boolean clientePremium = dinheiroAbrirConta > 500 ? true:false;

                //cadastrando conta
                minhaConta.cadastroConta(userName,userPass,dinheiroAbrirConta);
                minhaConta.atualizarSaqueEspecial();

                System.out.println("Sua conta foi criada com sucesso!\n");

                do {
                    System.out.printf("\nOlá, %s! Tudo bem?\n\nOpções:\n" +
                            "1 - Consultar saldo\n" +
                            "2 - Consultar cheque especial\n" +
                            "3 - Depositar dinheiro\n" +
                            "4 - Sacar dinheiro\n" +
                            "5 - Pagar um boleto\n"+
                            "6 - Fechar", minhaConta.nomeUsuario);
                    System.out.print("\n>>");
                    opcao = input.nextInt();

                    if(opcao == 1){System.out.printf("Saldo conta corrente: R$ %.2f",minhaConta.consultarSaldo());}

                    else if(opcao == 2){System.out.printf("Saldo cheque especial: R$ %.2f",minhaConta.consultarChequeEspecial());}

                    else if(opcao == 3){
                        System.out.println("Digite o valor do depósito:");
                        System.out.print(">>");
                        dinheiro = input.nextFloat();

                        if(dinheiroAbrirConta > 500 && minhaConta.consultarChequeEspecial() < dinheiroAbrirConta/2 ){
                                valorComparacao = dinheiroAbrirConta/2 - minhaConta.consultarChequeEspecial();

                                if(valorComparacao - dinheiro <= 0){
                                    minhaConta.depositoChequeEspecial(valorComparacao);
                                    minhaConta.depositoConta(dinheiro - valorComparacao);
                                }else{
                                        minhaConta.depositoChequeEspecial(dinheiro);
                                }
                        }
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
                    else if(opcao == 4){
                        System.out.println("Digite o valor do saque:");
                        System.out.print(">>");
                        dinheiro = input.nextFloat();

                        if(minhaConta.consultarSaldo() - dinheiro > 0){
                            minhaConta.saqueConta(dinheiro);
                            System.out.printf("Saque realizado com sucesso!\nSaldo atual: R$ %.2f.\n",minhaConta.consultarSaldo());
                        }else if(minhaConta.consultarSaldo() - dinheiro < 0 && (minhaConta.consultarChequeEspecial() + minhaConta.consultarSaldo()) - dinheiro < 0){
                            System.out.printf("Saldo insuficiente.\n");
                        }else if(minhaConta.consultarSaldo() - dinheiro < 0 && (minhaConta.consultarChequeEspecial() + minhaConta.consultarSaldo()) - dinheiro > 0){
                            if(minhaConta.consultarSaldo() - dinheiro < 0){
                                System.out.println("O valor excede o saldo em conta. Deseja usar o cheque especial?\n1 - Sim\n2 - Não\n>>");
                                opcao = input.nextInt();
                                if(opcao == 1){
                                    if(minhaConta.consultarSaldo() == 0){
                                        minhaConta.saqueChequeEspecial(dinheiro);
                                        System.out.printf("Saque realizado com sucesso!\nSaldo conta: R$ %.2f.\nSaldo cheque especial:R$ %.2f.\n",minhaConta.consultarSaldo(),minhaConta.consultarChequeEspecial());
                                    }else if(minhaConta.consultarSaldo() > 0){
                                        dinheiro -= minhaConta.consultarSaldo();
                                        minhaConta.saqueConta(minhaConta.consultarSaldo());
                                        minhaConta.saqueChequeEspecial(dinheiro);
                                        System.out.printf("Saque realizado com sucesso!\nSaldo conta: R$ %.2f.\nSaldo cheque especial:R$ %.2f.\n",minhaConta.consultarSaldo(),minhaConta.consultarChequeEspecial());
                                    }

                                }else if (opcao == 2 ){
                                    System.out.printf("Voltando para o início.");
                                }

                            }
                        }
                    }
                    else if(opcao == 5){
                        System.out.println("Digite o valor do boleto:");
                        System.out.print(">>");
                        dinheiro = input.nextFloat();
                        System.out.println("Digite o código do boleto:");
                        System.out.print(">>");
                        var codBoleto = input.nextInt();

                        if(minhaConta.consultarSaldo() - dinheiro > 0){
                            minhaConta.saqueConta(dinheiro);
                            System.out.printf("Boleto cod: %s pago com sucesso!\nSaldo conta atual: R$ %.2f.\n",codBoleto,minhaConta.consultarSaldo());
                        }else if(minhaConta.consultarSaldo() - dinheiro < 0 && (minhaConta.consultarChequeEspecial() + minhaConta.consultarSaldo()) - dinheiro < 0){
                            System.out.printf("Saldo insuficiente.\n");
                        }else if(minhaConta.consultarSaldo() - dinheiro < 0 && (minhaConta.consultarChequeEspecial() + minhaConta.consultarSaldo()) - dinheiro > 0){
                            if(minhaConta.consultarSaldo() - dinheiro < 0){
                                System.out.printf("\nO valor do boleto cod: %s excede o saldo em conta. Deseja usar o cheque especial?\n 1 - Sim\n2 - Não\n>>",codBoleto);
                                opcao = input.nextInt();
                                if(opcao == 1){
                                    dinheiro -= minhaConta.consultarSaldo();
                                    minhaConta.saqueConta(minhaConta.consultarSaldo());
                                    minhaConta.saqueChequeEspecial(dinheiro);
                                    System.out.printf("Boleto cod: %s pago com sucesso!\nSaldo conta: R$ %.2f.\nSaldo cheque especial:R$ %.2f.\n",codBoleto,minhaConta.consultarSaldo(),minhaConta.consultarChequeEspecial());
                                }else if (opcao == 2 ){
                                    System.out.printf("Voltando para o início.");
                                }

                            }
                        }
                    }

                    //juros caso estiver usando o cheque especial
                    if(dinheiroAbrirConta > 500 && minhaConta.consultarChequeEspecial() < dinheiroAbrirConta/2 && minhaConta.valorMesPassado< OffsetDateTime.now().getMonthValue()){
                        valorComparacao = dinheiroAbrirConta/2 - minhaConta.consultarChequeEspecial();
                        minhaConta.jurosChequeEspecial(valorComparacao);
                    }else if(dinheiroAbrirConta <= 500 && minhaConta.consultarChequeEspecial() < 50 && minhaConta.valorMesPassado< OffsetDateTime.now().getMonthValue()){
                        valorComparacao = 50 - minhaConta.consultarChequeEspecial();
                        minhaConta.jurosChequeEspecial(valorComparacao);
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