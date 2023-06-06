package selenium.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.core.driver.BasePage;

public class PesquisaCepPage extends BasePage {

    @FindBy(xpath = "//img[@alt='Imagem com o logo dos Correios']")
    private WebElement imgcorreio_logo;

    @FindBy(xpath = "//*[@id='mensagem-resultado-alerta']")
    private WebElement msg_resultado_alerta;

    @FindBy(xpath = "//*[@id='endereco']")
    private WebElement txt_endereco;

    @FindBy(xpath = "//*[@id='btn_pesquisar']")
    private WebElement btn_pesquisar;

    @FindBy(xpath = "//*[@data-th='Logradouro/Nome']/ancestor::tbody")
    private WebElement logradouro;

    @FindBy(xpath = "//*[@data-th='Localidade/UF']/ancestor::tbody")
    private WebElement localidade;

    @FindBy(xpath = "//*[@class='logo']")
    private WebElement logo;


    @FindBy(xpath = "//div[@style='order: 2']//form//div//i[@class='ic-busca-out']")
    private WebElement pesquisa_cep;


    @FindBy(xpath = "//*[@id='btn_nbusca']")
    private WebElement bnt_nova_busca;

    @FindBy(xpath = "//*[@id='relaxation']")
    private WebElement txt_cep_a;






    public boolean aguardarPaginaInicialCarregar(){
        super.tirarPrint(imgcorreio_logo);
        return super.verificaElementoPresenteTela(imgcorreio_logo);
    }

    public void clicarCampoCep(){
        super.verificaElementoPresenteTela(txt_cep_a);
        super.esperarElementoFicarClicavel(txt_cep_a);
        super.clicarElemento(pesquisa_cep);
    }

    public void digitarCep( String cep){
        super.mudarAba(1);
        super.verificaElementoPresenteTela(txt_endereco);
        super.digitarTexto(txt_endereco, cep);

    }

    public void clicarBntBuscar(){
        super.mudarAba(1);
        super.clicarElemento(btn_pesquisar);
        //super.verificaElementoPresenteTela(txt_endereco);
        //super.clicarElemento(txt_endereco);
        //super.clicarElemento(bnt_nova_busca);
    }
}
