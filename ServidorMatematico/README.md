# Exercício 1 - Servidor Matemático
**Integrantes:**
* Camylla Lima Dias RA 222170052
* Patrícia Helena   RA 221200421
* Gustavo Velecico  RA 221200447

## Protocolo
Para criar o servidor-cliente foi utilizado  o protocolo UDP (User Datagram Protocol permite que a aplicação envie um datagrama encapsulado num pacote IPv4 ou IPv6) onde realizamos a conexão e as comunicações necessárias entre cliente e servidor. Os dados são recebidos via input do usuário após rodar a aplicação ```ClienteUDP```, o objeto ```DatagramPacket pacoteMensagem``` é responsável por passar ao ```socket.send``` os bytes da mensagem, tamanho, endereço e porta para que o ```ServidorUDP``` (requisição é recebida através de ```socket.receive```) faça o tratamento dos dados, neste caso a string operação matemática. O tratamento e retorno da operação é feita através do método ```executarOperacao```. Mais uma vez o DatagramPacket é instanciado para enviar o resultado da operação no _Servidor_ para o _Cliente_.

_***obs:*** operações disponíveis -> ```soma, subtrai, divide e multiplica```_<br><br>




## Como executar o programa 
**1.** Abra ambos os projetos **ServidorUDP** e **ClienteUDP** no **NetBeans**<br>
**2.** Selecione o arquivo ```ServidorUDP.java```, clique em _Clean and Build Project_ e em seguida clique em _Run Project_<br>
**3.** Selecione o arquivo ```ClienteUDP.java```, clique em _Clean and Build Project_ e em seguida clique em _Run Project_<br>
**4.** Informe a operação no _Output_ de **ClienteUDP** no formato ```operacao:inteiro:inteiro``` por exemplo ```soma:35:7```<br>
**5.** Fim! :nerd_face: :tada:<br><br>


## Output
<sup>**Cliente**</sup><br>
![](https://github.com/camylladias/CC6270/blob/main/img/clienteudp.png?raw=true)<br>
<br>
<sup>**Servidor**</sup><br>
![](https://github.com/camylladias/CC6270/blob/main/img/servidorudp.png?raw=true)
