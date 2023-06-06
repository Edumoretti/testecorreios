#language: pt
#encoding: utf-8

@buscacep @regressivo
Funcionalidade: Busca por CEP

  Cenario: Realizar busca por CEP enexistente
    Dado que eu acesso o site
    E procure pelo CEP "80700000"
    Quando clicar em buscar
    Então validar a mensagem "Dados não encontrado"


  Cenario: Realizar busca por CEP existente
    Dado que eu acesso o site
    E procure pelo CEP "01013001"
    Quando clicar em buscar
    Então validar a mensagem "Rua Quinze de Novembro - lado ímpar" esta sendo exibida
      E validar localidade "São Paulo/SP"

  Cenario: Realizar busca por numero de rastreamento
    Dado que eu acesso o site
    E procuro pelo rastreamento "RSS987654321BR"
    Quando clicar em buscar numero de rastreamento
    Então validar o erro "O CNPJ informado está inválido" esta sendo exibido