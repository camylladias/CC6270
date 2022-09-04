# Exercício 1 - Servidor Matemático
**Integrantes:**
* Camylla Lima Dias RA 222170052
* Patrícia Helena   RA 221200421
* Gustavo Velecico  RA 221200447

## Protocolo
Para criar o servidor-cliente foi utilizado  o protocolo UDP (User Datagram Protocol) para realizar a conexão e as comunicações necessárias entre cliente e servidor.




## Tratamento de Strings

Para o servidor conseguir entender a requisição do cliente foi necessário tratar as strings de input do cliente na aplicação do servidor.



## Realização das operações

O servidor reconhece a string que foi inserida pelo cliente e se essa string conter as palavras soma, subtrai, divide ou multiplica e 2 números. 
Então o servidor irá encontrar a condição que foi enviada, e realizara a operação em questão.




## Como executar o programa 
**1.** Abra ambos os projetos **ServidorUDP** e **ClienteUDP** no **NetBeans**<br>
**2.** Selecione o arquivo ```ServidorUDP.java```, clique em _Clean and Build Project_ e em seguida clique em _Run Project_<br>
**3.** Selecione o arquivo ```ClienteUDP.java```, clique em _Clean and Build Project_ e em seguida clique em _Run Project_<br>
**4.** Informe a operação no _Output_ de **ClienteUDP** no formato ```operacao:inteiro:inteiro``` por exemplo ```soma:35:7```<br>
**5.** Fim! :nerd_face: :tada:<br><br>
_obs: operações disponíveis: ```soma, subtrai, divide e multiplica```_<br><br>

## Output
<sup>**Cliente**</sup><br>
![](https://github.com/camylladias/CC6270/blob/main/img/clienteudp.png?raw=true)<br>
<br>
<sup>**Servidor**</sup><br>
![](https://github.com/camylladias/CC6270/blob/main/img/servidorudp.png?raw=true)
