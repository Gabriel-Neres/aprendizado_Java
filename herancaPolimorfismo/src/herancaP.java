public class herancaP {
    public static void main(String[] args){

        //colaborador colaborador = new colaborador();

        printColaborador(new Gerente());
        printColaborador(new Vendedor());

    }

    public static void printColaborador(Colaborador userColaborador){
        System.out.printf("=======%s=======\n",userColaborador.getClass().getCanonicalName());

        if (userColaborador instanceof Gerente userGerente){
            userGerente.setNome("Gabriel");
            userGerente.setLogin("gabnss");
            userGerente.setSenha("123456");

            System.out.println(userColaborador.getNome());
            System.out.println(userGerente.getSenha());
            System.out.println(userGerente.getLogin());
        }
        System.out.println("==============");
    }
}