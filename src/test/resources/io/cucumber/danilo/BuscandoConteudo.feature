# language: pt
# @ignore
Funcionalidade: Buscando dados no site Torne se um Programador
  O objetivo deste teste é fazer uma busca no site 
  pelos termos TDD e BDD

  Cenario: Entrar no site e buscar termo TDD
    Dado que estou no site torne se um programador
    E digito no campo busca a palavra "TDD"
    Então eu devo ver o resultado na busca

  Cenario: Entrar no site e buscar termo BDD
    Dado que estou no site torne se um programador
    E digito no campo busca a palavra "BDD"
    Então eu devo ver o resultado na busca