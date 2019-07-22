Feature: consultar todas las compras

  Scenario:Consultar compras
    When consulto las compras del cliente
      | userName | valorCompra | fechaCompra | articuloComprado | id |
      | duban    | 9000        | 1970-01-14  | portatil         | 2  |
    Then deberia mirar todas las compras
      | userName | valorCompra | fechaCompra | articuloComprado | id |
      | santiago | 2000        | 1970-01-13  | play             | 1  |
      | duban    | 9000        | 1970-01-14  | portatil         | 2  |
      | pepe     | 500         | 1970-01-20  | carro            | 3  |