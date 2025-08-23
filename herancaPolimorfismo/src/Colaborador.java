public sealed abstract class Colaborador permits Gerente, Vendedor {

    private String nome;

    private String codigo;

    private String endereco;

    private int age;

    private double salario;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nomeSet){
        this.nome = nomeSet;
    }

    public String getCodigo(){
        return this.codigo;
    }
    public void setCodigo(String codigoSet){
        this.codigo = codigoSet;
    }

    public String getEndereco(){
        return this.endereco;
    }
    public void seteEdereco(String enderecoSet){
        this.endereco = enderecoSet;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int ageSet){
        this.age = ageSet;
    }

    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salarioSet){
        this.salario = salarioSet;
    }


}
