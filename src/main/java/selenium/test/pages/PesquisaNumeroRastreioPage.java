package selenium.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.core.driver.BasePage;

public class PesquisaNumeroRastreioPage extends BasePage {

    @FindBy(xpath = "//*[@class='mensagem'][0]")
    private WebElement mensagem_error_cnpj;

    @FindBy(xpath = "//div[@style='order: 0']//form//div//i[@class='ic-busca-out']")
    private WebElement pesquisar;

    @FindBy(xpath = "//input[@id='objetos']")
    private WebElement objetos;

    @FindBy(xpath = "//a[@class='logo']")
    private WebElement imgcorreio_logo_a;

    @FindBy(xpath = "//button[@id='b-pesquisar']")
    private WebElement b_pesquisar;



    public void clinarCampoObjetos(){
        super.clicarElemento(objetos);
    }

    public void informarNumeroObjeto(String idObjeto){
        super.digitarTexto(objetos, idObjeto);
    }

    public void clicarPesquisarObjetos(){
        super.clicarElemento(pesquisar);
        super.mudarAba(1);
        super.verificaElementoPresenteTela(imgcorreio_logo_a);
        super.clicarElemento(b_pesquisar);


    }


}
