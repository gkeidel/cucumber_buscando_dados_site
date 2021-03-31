package io.cucumber.danilo;

import org.openqa.selenium.By;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.*;

public class BuscandoConteudoDeCacheSteps {
  
  @Dado("clico no curso de Cache")
  public void clico_no_curso_de_Cache() {
    Configuracao.browser.findElement(By.cssSelector("a[href='/aulas/cache'] img")).click();
  }

  @Entao("devo clicar no curso de Varnish para poder assistir")
  public void devo_clicar_no_curso_de_Varnish_para_poder_assistir() {
    Configuracao.browser.findElement(By.cssSelector(".div-card-aulas:last-child")).click();
    Configuracao.fechar();
  }
}
