/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidormatematico2;

import java.io.IOException;
import java.net.DatagramPacket; 
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ClienteUDP {
    public static void main(String[] args) {
        System.out.println("Cliente UDP");
        DatagramSocket socket = null;
        Scanner scanner = new Scanner(System.in);
        //String mensagem = "msg do cliente";
        
        System.out.print("Entre com a operacao: ");
        String entrada = scanner.next();
        System.out.println(entrada);
        
        byte[] m = entrada.getBytes();
        int tamanho = entrada.length();
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
