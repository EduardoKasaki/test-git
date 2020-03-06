
package Controller;

import Controller.Helper.LoginHelper;
import Model.Usuario;
import View.Login;

public class LoginController {
    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
        
    }
    
    public void entrarNoSistema(){
        //Pegar digitos do "USUARIO" digitado.
       Usuario usuario = helper.obterModelo();
        
        
        //Pesquisar usuário no banco.
        //se Autenticado > Redirecionar para o menu
        //se não > Mostrar mensagem de erro de autenticação
    }
    
    public void fizTarefa(){
        
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei fiz tarefa");
    }
}
