package Mediator;

public class Pessoa {

    public String postarProduto() {
        return Agencia.getInstance().enviarProduto();
    }

    public String receberProduto() {
        return Agencia.getInstance().receberProduto();
    }
}
