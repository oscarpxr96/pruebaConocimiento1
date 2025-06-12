Feature: abrir una pagina web

Background:
  Given "Oscar" abre el sitio web de pruebas

  @succesful
  Scenario: abrir con el navegador chrome la pagina web chrome
    And desea validar la funcion de la carta de elementos
    When selecciona aleatoriamente alguna de las subfunciones
    Then visualiraza en la cabecera el nombre de la opcion elegida
