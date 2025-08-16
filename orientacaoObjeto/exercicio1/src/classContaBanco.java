import java.lang.reflect.Method;
import java.time.OffsetDateTime;

public class classContaBanco {

    private float valorRealConta;

    private float valorChequeEspecial;

    private float valorChequeEspecialRelativo;

    public String nomeUsuario;

    private int senhaUsuario;

    private int valorMesPassado = OffsetDateTime.now().getMonthValue();
    //public classContaBanco(){};

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
    public String saqueChequeEspecial(float sakeUser){
        this.valorChequeEspecial -= sakeUser;
        return null;
    }

    //Depositar dinheiro;
    public void depositoChequeEspecial(float moneyUser){
        this.valorChequeEspecial += moneyUser;
    }
    public void depositoConta(float moneyUser){
        this.valorRealConta += moneyUser;
    }
    //Pagar um boleto.

    //juros cheque especial
    public void jurosChequeEspecial(float valorUsado){

        if(this.valorMesPassado < OffsetDateTime.now().getMonthValue())return;

            var dinheiro = (float) (valorUsado * 0.2);
            classContaBanco.this.saqueChequeEspecial(dinheiro);

            this.valorMesPassado = OffsetDateTime.now().getMonthValue();

    }
}
