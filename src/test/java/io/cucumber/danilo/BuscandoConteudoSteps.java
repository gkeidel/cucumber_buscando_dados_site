package io.cucumber.danilo;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;


public class BuscandoConteudoSteps {

  @Dado("digito no campo busca a palavra {string}")
  public void digito_no_campo_busca_a_palavra(String string) {
    WebElement input = Configuracao.browser.findElement(By.cssSelector(".form-pesquisa"));
    input.sendKeys(string);
    Configuracao.browser.findElement(By.cssSelector(".btn-pesquisa")).click();
  }

  @Então("eu devo ver o resultado na busca")
  public void eu_devo_ver_o_resultado_na_busca() {
    assertEquals(true, Configuracao.browser.findElements(By.cssSelector(".div-card-aulas")).size() > 0);
    Configuracao.fechar();
  }
}
