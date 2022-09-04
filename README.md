# Exercício 1 - Servidor Matemático
**Integrantes:**
* Camylla Lima Dias RA 222170052
* Patrícia Helena   RA 221200421
* Gustavo Velecico  RA 221200447

## Protocolo
Para criar o servidor-cliente foi utilizado  o protocolo UDP (User Datagram Protocol) para realizar a conexão e as comunicações necessarias entre cliente e servidor.

- Servidor

```
public class ServidorUDP {
    public static void main(String[] args) {
        System.out.println("Servidor UDP online");
        ServidorUDP servidor = new ServidorUDP();
        String mensagem = "";

        DatagramSocket socket = null;
        try {
        socket = new DatagramSocket(7890);
        byte[] buffer = new byte[1000];
        byte[] resposta = new byte [1000];
        while (true) {
            DatagramPacket requisicao =
            new DatagramPacket(buffer, buffer.length);
            socket.receive(requisicao);
            String req = new String(requisicao.getData());
            mensagem = servidor.executarOperacao(req);
            System.out.println("Recebi requisicao: "
            + req );
            resposta = mensagem.getBytes();
                DatagramPacket solucao = new DatagramPacket 
                        (resposta , resposta.length , requisicao.getAddress(),requisicao.getPort());
                System.out.println();
                socket.send(solucao);
                System.out.println("Resposta enviada para: "+ requisicao.getAddress().toString() + "\n");

            }

```



- Cliente

```

public class ClienteUDP {    
    public static void main(String[] args) {
        System.out.println("Cliente UDP");
        Scanner sc = new Scanner(System.in);
        DatagramSocket socket = null;
        
        System.out.print("Informe a operacao (op:n1:n2): ");
        String mensagem = sc.nextLine();

        
        byte[] m = mensagem.getBytes();
        int tamanho = mensagem.length();
        try {
            InetAddress endereco =
                InetAddress.getByName("localhost");
        int porta = 7890;

        DatagramPacket pacoteMensagem =
            new DatagramPacket(m, tamanho, endereco, porta);
            socket = new DatagramSocket();
            socket.send(pacoteMensagem);
            byte[] buffer = new byte[1000];

            DatagramPacket resposta =
                new DatagramPacket(buffer, buffer.length);
            socket.receive(resposta);

            System.out.println("resposta do servidor: "
                + new String(resposta.getData()));

```

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

- Soma

```
if(operacao.contains("soma")){
                resultado = Float.parseFloat(string[1]) + Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }


```

- Subtração

```
 if(operacao.contains("subtrai")){
                resultado = Float.parseFloat(string[1]) - Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }


```


- Divisão

```
if(operacao.contains("divide")){
                resultado = Integer.parseInt(string[1]) / Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }

```


- Multiplicação

```
            if(operacao.contains("multiplica")){
                resultado = Float.parseFloat(string[1]) * Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }


```



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

