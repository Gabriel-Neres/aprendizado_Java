public class classContaBanco {

    private float valorRealConta;

    private float valorChequeEspecial;

    private float valorChequeEspecialRelativo;

    public String nomeUsuario;

    private int senhaUsuario;

    public void cadastroConta(String userName, int userPassword, float depositUser){
        this.nomeUsuario = userName;
        this.senhaUsuario = userPassword;
        this.valorRealConta = depositUser;
    }

    public void atualizarSaqueEspecial(){
        this.valorChequeEspecial = valorRealConta <= 500 ? 50 : valorRealConta / 2;
    }

    //Consultar saldo
    public float consultarSaldo(){
        return valorRealConta;
    }

    //consultar cheque especial
    public float consultarChequeEspecial(){
        return valorChequeEspecial;
    }

    //Sacar dinheiro;
    public void saqueConta(float sakeUser){
        this.valorRealConta -= sakeUser;
}
    //sacar chequeEspecial
    public void saqueChequeEspecial(float sakeUser){
        this.valorChequeEspecial -= sakeUser;
    }

    //Depositar dinheiro;
    public void depositoChequeEspecial(float moneyUser){
        this.valorChequeEspecial += moneyUser;
    }
    public void depositoConta(float moneyUser){
        this.valorRealConta += moneyUser;
    }
    //Pagar um boleto.

}
