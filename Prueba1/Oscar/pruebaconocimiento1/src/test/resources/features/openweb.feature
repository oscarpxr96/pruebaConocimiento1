Feature: abrir una pagina web

  @succesful
  Scenario: abrir con el navegador chrome la pagina web chrome
    Given "Oscar" abre el sitio web de pruebas
    When ingresa al navegador chrome
    Then visualiraza el titulo de la pagina "Cucumber"
