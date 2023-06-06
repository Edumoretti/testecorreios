package selenium.test.steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import selenium.test.pages.PesquisaCepPage;
import selenium.test.pages.PesquisaNumeroRastreioPage;

public class PesquisaStep {

    protected PesquisaCepPage pesquisaCepPage = new PesquisaCepPage();
    protected PesquisaNumeroRastreioPage pesquisaNumRastPage = new PesquisaNumeroRastreioPage();

    @Dado("que eu acesso o site")
    public void que_eu_acesso_o_site() throws InterruptedException {
        Assert.assertTrue(pesquisaCepPage.aguardarPaginaInicialCarregar());
    }

    @Dado("procure pelo CEP {string}")
    public void procure_pelo_CEP(String cep) throws InterruptedException {
        pesquisaCepPage.clicarCampoCep();
        pesquisaCepPage.digitarCep(cep);

    }

    @Quando("clicar em buscar")
    public void clicar_em_buscar() throws InterruptedException {
        pesquisaCepPage.clicarBntBuscar();

    }

    @Dado("procure pelo rastreamento {string}")
    public void procure_pelo_rastreamento(String string) throws InterruptedException {
    }

    @E("procuro pelo rastreamento {string}")
    public void procuro_pelo_rastreamento(String numero) throws InterruptedException {
        pesquisaNumRastPage.informarNumeroObjeto(numero);
    }

    @Quando("clicar em buscar numero de rastreamento")
    public void clicar_em_buscar_numero_de_rastreamento() throws InterruptedException {
        pesquisaNumRastPage.clicarPesquisarObjetos();
    }



}
