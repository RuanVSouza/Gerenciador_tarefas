
##  Gerenciador de tarefas 
Sistema feito com spring para gerenciar tarefas do cotidiano de forma simples e rapida


## Tecnologias utilizadas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)![Spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)![MySQL](https://img.shields.io/badge/mysql-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white) ![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=postman&logoColor=white)

## Documentação da API

#### Retorna todos os itens

```http
  GET/tarefas
```


#### Retorna um item

```http
  GET/tarefas/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

#### Atualizar um item

```http
  PUT/tarefas/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |

## PARAMETRO BODY 

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `raw`      | `JSON` |Sucesso se retornar um status code 200 |



{  
    
    "nome": "*atualização que deseja*"
    "descricao": "*atualização que deseja*"
    "comeco": "*atualização que deseja*"
    "termino": "*atualização que deseja*"
    "status": "*atualização que deseja*"  
}

#### CRIAR UM ITEM

#### PARAMETRO BODY 

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `raw`      | `JSON` |Sucesso se retornar um status code 201 |


{  
    
    "nome": "*nome da atividade*"
    "descricao": "*descrição da atividade*"
    "comeco": "*quando a atividade começará*"
    "termino": "*quando a atividade deve terminar *"
    "status": "*status da atividade*"  
}

#### DELETAR UM ITEM

```http
  GET/tarefas/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `string` | **Obrigatório**. O ID do item que você quer |


## Aprendizados

Criação de CRUD e banco de dados H2

## Melhorias

Irei implantar um banco de dados persistente com o HeidiSQL futuramente e criar um front com Angular

