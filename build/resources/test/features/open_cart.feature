#language:en
#Autor: Jhonatan Paternina Rojas

@stories
Feature: OpenCart
  Como usuario de opencart
  Quiero ingresar a la página web
  Para consultar las ordenes de ventas.

  @VerificarFiltroPorId
  Scenario Outline: Verificar que al ingresar a ordenes de ventas el filtro por ID funcione correctamente
    Given que Jhonatan quiere ingresar a la pagina web opencart
      | username   | password   |
      | <username> | <password> |

    When el ingresa a la opcion ordenes de ventas
      | salesOptions   |
      | <salesOptions> |

    And realiza el filtro por el ID de la orden
      | orderId   |
      | <orderId> |

    And selecciona la opcion ver orden

    Then el verifica el ID de la orden consultada
      | verifyOderId   |
      | <verifyOderId> |
    Examples:
      | username | password | salesOptions | orderId | verifyOderId   |
      | Demo     | demo     | Orders       | 16630   | Order (#16630) |

  @VerificarTotal
  Scenario Outline: Verificar que el valor total de un producto corresponda a la cantidad, por el valor de la unidad

    Given que Jhonatan quiere ingresar a la pagina web opencart
      | username   | password   |
      | <username> | <password> |

    When el ingresa a la opcion ordenes de ventas
      | salesOptions   |
      | <salesOptions> |

    And realiza el filtro por el ID de la orden
      | orderId   |
      | <orderId> |

    And selecciona la opcion ver orden

    Then el verifica el valor total del producto de la orden consultada
      | verifyOderId   |
      | <verifyOderId> |
    Examples:
      | username | password | salesOptions | orderId | verifyOderId   |
      | Demo     | demo     | Orders       | 16630   | Order (#16630) |


  @CasoNoExitoso
  Scenario Outline: Verificar que el usuario no pueda editar el campo divisa

    Given que Jhonatan quiere ingresar a la pagina web opencart
      | username   | password   |
      | <username> | <password> |

    When el ingresa a la opcion ordenes de ventas
      | salesOptions   |
      | <salesOptions> |

    And realiza el filtro por el ID de la orden
      | orderId   |
      | <orderId> |

    And selecciona la opcion ver ordenn
      | currency   |
      | <currency> |

    Then el verifica la alerta de error mostrada por el sistema
      | errorMssage   |
      | <errorMssage> |
    Examples:
      | username | password | salesOptions | orderId | currency | errorMssage                                               |
      | Demo     | demo     | Orders       | 16630   | Euro     | Warning: You do not have permission to access the API!\n× |