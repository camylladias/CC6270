package servidorudp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

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

            }catch (SocketException e) {
            System.out.println("Socket: " + e.getMessage());
            }catch (IOException e) {
            System.out.println("IO: " + e.getMessage());
            }
        }
    
        public String executarOperacao(String operacao) {
            float resultado = 0; 
            String mensagem = "";
            var string = operacao.split(":");
            System.out.print(string);
            
            if(operacao.contains("soma")){
                resultado = Float.parseFloat(string[1]) + Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }

            if(operacao.contains("subtrai")){
                resultado = Float.parseFloat(string[1]) - Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }

            if(operacao.contains("divide")){
                resultado = Integer.parseInt(string[1]) / Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }

            if(operacao.contains("multiplica")){
                resultado = Float.parseFloat(string[1]) * Float.parseFloat(string[2]);
                return mensagem=String.valueOf(resultado);
            }

            return mensagem=String.valueOf(resultado);
    }
 }