#author: Carolina Rincon
#language: es

Característica: Registrar un usuario

  Yo como Carolina
  Quiero realizar el registro de un usuario
  Para poder acceder a la pagina de Utest

  Antecedentes:
    Dado "carolina" abre el sitio web de uTest

  @successful
  Escenario: Registro usuario
    Cuando diligencia la informacion personal
    Y verifica si diligencia o no la informacion de ubicacion
    Y diligencia la informacion de los dispositivos a usar
    Y crea la contraseña
    Entonces se redirigira a la pagina de bienvenida