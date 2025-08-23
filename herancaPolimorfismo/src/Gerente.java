public non-sealed class Gerente extends Colaborador {

    private String login;

    private String senha;

    private double comicao;

    public String getLogin(){
        return this.login;
    }
    public void setLogin(String loginSet){
        this.login = loginSet;
    }

    public String getSenha(){
        return this.senha;
    }
    public void setSenha(String senhaSet){
        this.senha = senhaSet;
    }

    public double getComicao(){
        return this.comicao;
    }
    public void setComicao(double comicaoSet){
        this.comicao = comicaoSet;
    }

}
