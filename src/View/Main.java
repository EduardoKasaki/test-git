
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;


public class Main {
    public static void main(String[] args) {
        
        
        Servico servico = new Servico(1, "barba", 30);
        Cliente cliente = new Cliente(1, "EDU", "Flora Junior", "04580-454");
        Usuario usuario = new Usuario(2, "Barbeiro", "123456");
        
        System.out.println(usuario);
        System.out.println(cliente);
        
        Agendamento agendamento = new Agendamento(2, cliente, servico, 30, "27/12/1997 09:00");
        System.out.println("");
    } 
}
