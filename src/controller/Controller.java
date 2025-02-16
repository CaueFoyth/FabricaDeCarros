package controller;

import model.Car;
import model.Fabric;
import view.InputOutput;

public class Controller {
    // Instância da classe Fabric que gerencia os carros
    Fabric fabric = new Fabric();

    // Método que inicia a aplicação
    public void startApp() {
        while (true) {
            // Exibe o menu de opções e obtém a opção selecionada pelo usuário
            int option = InputOutput.showOptions(new String[] {"Adicionar carros", "Listar carros" ,"Vender carros", "Sair"});

            switch (option) {
                case 0:
                    // Solicita a quantidade de carros a serem adicionados
                    int quantity = InputOutput.askCarsQuantity();
                    while (quantity <= 0) {
                        // Exibe uma mensagem de erro se a quantidade for inválida
                        InputOutput.showErrorMessage("Quantidade inválida. Tente novamente.");
                        quantity = InputOutput.askCarsQuantity();
                    }

                    // Adiciona os carros à lista
                    for (int i = 0; i < quantity; i++) {
                        Car car = new Car();
                        car.setModel(InputOutput.askCarModel());
                        car.setColor(InputOutput.askCarColor());

                        fabric.addCar(car);
                    }
                    break;
                case 1:
                    // Verifica se há carros cadastrados
                    if (fabric.getCars().isEmpty()) {
                        InputOutput.showErrorMessage("Nenhum carro foi cadastrado ainda.");
                        break;
                    }
                    // Gera e exibe as informações dos carros cadastrados
                    String output = "";
                    for (Car car : fabric.getCars()) {
                        output += InputOutput.generateInfoCars(car);
                    }
                    InputOutput.showInfoCars(output);
                    break;
                case 2:
                    // Verifica se há carros cadastrados
                    if (fabric.getCars().isEmpty()) {
                        InputOutput.showErrorMessage("Nenhum carro foi cadastrado ainda.");
                        break;
                    }

                    // Exibe as opções de carros para venda
                    String[] options = new String[fabric.getCars().size() + 1];
                    options[0] = "Escolha o carro que deseja vender";
                    for (int i = 0; i < fabric.getCars().size(); i++) {
                        Car car = fabric.getCars().get(i);
                        options[i + 1] = car.getModel() + " - " + car.getColor();
                    }
                    int index = InputOutput.showOptions(options);

                    // Remove o carro selecionado da lista
                    if (index != 0) {
                        fabric.removeCar(index - 1);
                    }
                    break;
                case 3:
                    // Encerra a aplicação
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}