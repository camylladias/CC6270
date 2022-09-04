import java.io.IOException;
import java.net.DatagramPacket; 
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

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

        }catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
        }catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
        }finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}