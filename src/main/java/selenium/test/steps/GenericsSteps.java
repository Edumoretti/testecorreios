package selenium.test.steps;

import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.E;
import org.junit.Assert;
import selenium.core.driver.BasePage;

public class GenericsSteps {
    BasePage base = new BasePage();

    @Então("validar a mensagem {string}")
    public void validar_a_mensagem(String mensagem) throws InterruptedException {
        base.verificaElementoPresenteTela(mensagem);
        Assert.assertEquals("Sucesso","Dados não encontrado", mensagem);
        base.tirarPrint();
    }

    @Então("validar a mensagem {string} esta sendo exibida")
    public void validar_a_mensagem_esta_sendo_exibida(String mensagem) throws InterruptedException {
        base.verificaElementoPresenteTela(mensagem);
        Assert.assertEquals("Sucesso","Rua Quinze de Novembro - lado ímpar", mensagem);
        base.tirarPrint();
    }

    @Então("validar o erro {string} esta sendo exibido")
    public void validar_o_erro_esta_sendo_exibido(String mensagem) throws InterruptedException {
        base.verificaElementoPresenteTela(mensagem);
        Assert.assertEquals("Sucesso","O CNPJ informado está inválido", mensagem);
        base.tirarPrint();
    }

    @E("validar localidade {string}")
    public void validar_localidade(String mensagem) {
        base.verificaElementoPresenteTela(mensagem);
        Assert.assertEquals("Sucesso","São Paulo/SP", mensagem);
        base.tirarPrint();
    }



}
