package controller;

import model.Car;
import model.Fabric;
import view.InputOutput;

public class Controller {
    Fabric fabric = new Fabric();

    public void startApp() {
        while (true) {
            int option = InputOutput.showOptions(new String[] {"Adicionar carros", "Listar carros" ,"Vender carros", "Sair"});

            switch (option) {
                case 0:
                    int quantity = InputOutput.askCarsQuantity();
                    while (quantity <= 0) {
                        InputOutput.showErrorMessage("Quantidade inválida. Tente novamente.");
                        quantity = InputOutput.askCarsQuantity();
                    }

                    for (int i = 0; i < quantity; i++) {
                        Car car = new Car();
                        car.setModel(InputOutput.askCarModel());
                        car.setColor(InputOutput.askCarColor());

                        fabric.addCar(car);
                    }
                    break;
                case 1:
                    if (fabric.getCars().isEmpty()) {
                        InputOutput.showErrorMessage("Nenhum carro foi cadastrado ainda.");
                        break;
                    }
                    String output = "";
                    for (Car car : fabric.getCars()) {
                        output += InputOutput.generateInfoCars(car);
                    }
                    InputOutput.showInfoCars(output);
                    break;
                case 2:
                    if (fabric.getCars().isEmpty()) {
                        InputOutput.showErrorMessage("Nenhum carro foi cadastrado ainda.");
                        break;
                    }

                    String[] options = new String[fabric.getCars().size() + 1];
                    options[0] = "Escolha o carro que deseja vender";
                    for (int i = 0; i < fabric.getCars().size(); i++) {
                        Car car = fabric.getCars().get(i);
                        options[i + 1] = car.getModel() + " - " + car.getColor();
                    }
                    int index = InputOutput.showOptions(options);

                    if (index != 0) {
                        fabric.removeCar(index - 1);
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
