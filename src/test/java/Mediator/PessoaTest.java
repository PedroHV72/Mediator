package Mediator;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PessoaTest {
    @Test
    void deveRetornarProdutoEnviado() {
        Pessoa pessoa = new Pessoa();
        assertEquals("Produto enviado pela agência", pessoa.postarProduto());
    }

    @Test
    void deveRetornarProdutoRecebido() {
        Pessoa pessoa = new Pessoa();
        assertEquals("Produto recebido pela agência", pessoa.receberProduto());
    }
}
