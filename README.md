# CC6270
Disciplina Sistemas Operacionais - Exercício  Servidor Matemático

## Descrição do exercicio

O exercico consiste na criação de um servidor-cliente que executa 4 operações matematicas (adilção, subtração, multiplicação e divisão). Para isso foi usado o protocolo udp.

## Tratamento de Strings

Para o servidor conseguir intender a requesição do cliente foi necessario tratar as strings de input do servidor.

```
public String executarOperacao(String operacao) {
            float resultado = 0; 
            String mensagem = "";
            var string = operacao.split(":");
            System.out.print(string);

```

## Realização das operações

O servidor reconhece a string que foi inserida pelo cliente e se essa string conter as palavras soma,subtrai,divide ou multiplica e 2 números o servidor irá encontrar a condição que foi enviada, e realizara a operação em questão.

## Soma

```
if(operacao.contains("soma")){
                resultado = Float.parseFloat(string[1]) + Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }


```

## Subtração

```
 if(operacao.contains("subtrai")){
                resultado = Float.parseFloat(string[1]) - Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }


```


## Divisão

```
if(operacao.contains("divide")){
                resultado = Integer.parseInt(string[1]) / Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }

```


## Multiplicação

```
            if(operacao.contains("multiplica")){
                resultado = Float.parseFloat(string[1]) * Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }


```
