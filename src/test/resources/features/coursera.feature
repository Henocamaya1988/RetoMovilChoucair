  Feature:Automatizacion de aplicacion coursera,
    como usuario, quiero autenticarme en la aplicacion para poder registrarme en un curso.

    Scenario Outline:Autenticacación en aplicacion coursera
      Given que Henoc quiere ingrear la aplicacion coursera
      When  inicia sesion con las credencias "<email>" "<password>"
      And   busca  el  curso "<nombrecurso>" para inscribirse
      Then  debe valiar que se muestre el  "<mensaje>" con el nombre del curso seleccionado

      Examples:
      |email                      |password     |nombrecurso                      |mensaje|
      |ing.henoc.amaya@hotmail.com|2403**Esterno|Introduccion al Analisis de Datos|Filtrar|


