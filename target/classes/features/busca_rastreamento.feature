#language: pt
#encoding: utf-8

@buscacep
Funcionalidade: Busca por numero de rastreamento

  Cenario: Realizar busca por numero de rastreamento
    Dado que eu acesso o site
    E procuro pelo rastreamento "RSS987654321BR"
    Quando clicar em buscar numero de rastreamento
    Então validar o erro "O CNPJ informado está inválido" esta sendo exibido


