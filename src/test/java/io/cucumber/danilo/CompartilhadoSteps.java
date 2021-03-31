package io.cucumber.danilo;

import io.cucumber.danilo.servicos.Configuracao;
import io.cucumber.java.pt.Dado;

public class CompartilhadoSteps {
  @Dado("que estou no site torne se um programador")
  public void que_estou_no_site_torne_se_um_programador() {
    Configuracao.abrir("https://www.torneseumprogramador.com.br");
  }
}
