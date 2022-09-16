
package cliente;

import comum.Conexao;
import comum.Requisicao;
import comum.Resposta;
import java.io.IOException;
import java.net.Socket;

public class AppCliente {
    static Socket socket;
    
    public AppCliente() {
        try {
            socket = new Socket("localhost", 9600);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        Requisicao requisicao = new Requisicao('+', 4, 4);
        Resposta resposta = new Reposta();
        new AppCliente();
        
        Conexao.send(socket, requisicao);
        resposta = (Resposta)Conexao.receive(socket);
        
        System.out.println("O resultado da soma é" + resposta.getResultado());
    }
}
