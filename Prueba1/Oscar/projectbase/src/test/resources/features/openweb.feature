#author: Carolina Rincon
#language: es

Característica: Abrir una pagina web

  Yo como Carolina
  Quiero realizar una prueba a la carta de elementos y las subFunciones
  Para comprobar la robustez y control de errores de la aplicacion o pagina web

  Antecedentes:
    Dado "carolina" abre el sitio web de pruebas

  @successful
  Escenario: validacion en la funcion del ID Card Elements
    Y desea validar la funcion de la carta de elementos
    Cuando selecciona aleatoriamente alguna de las subfunciones
    Entonces visualizara en la cabecera el nombre de la opción elegida