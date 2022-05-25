package Mediator;

public class Agencia implements Destinatario{
    private static Agencia instance = new Agencia();

    private Agencia(){}

    public static Agencia getInstance(){ return instance; }

    public String enviarProduto(){
        return "Produto enviado pela agência";
    }

    public String receberProduto(){
        return "Produto recebido pela agência";
    }
}