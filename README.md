# java-santander-2023-api
Java RESTful API desenvolvido como projeto final do Santander Java BootCamp 2023.

## Diagrama de classes

```mermaid
classDiagram
  class Orgao {
    - name: String
    - atividades: Atividade[]
    - informe: Informe
  }
  class Atividade {
    - nome: String
    - descricao: String
    - objetivo: String
    - responsavel: String
    - participantes: String
    - local: String
  }
  class Informe {
    - titulo: String
    - descricao: String
  }

  Orgao "1" *-- "N" Atividade
  Orgao "1" *-- "1" Informe
```
