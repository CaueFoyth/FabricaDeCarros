import controller.Controller;

// Classe principal do aplicativo
public class App {
    // Método principal que inicia a aplicação
    public static void main(String[] args) throws Exception {
        // Cria uma instância do controlador
        Controller controller = new Controller();
        // Inicia a aplicação chamando o método startApp do controlador
        controller.startApp();
    }
}