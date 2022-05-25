package Mediator;

public class Central {

    private static Central instance = new Central();

    private Central() {}

    public static Central getInstance(){
        return instance;
    }

    public String receberProduto(){
        return "Mensagem da agência: .\n" +
                Agencia.getInstance().receberProduto();
    }

    public String enviarProduto(){
        return "Mensagem da agência: .\n" +
                Agencia.getInstance().enviarProduto();
    }

}
