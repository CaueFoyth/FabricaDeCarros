package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import model.Car;

public class InputOutput {

    // Exibe uma mensagem de boas-vindas ao usuário
    public static void showMenu() {
        JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de fabrica de carros!\n", "Menu", JOptionPane.INFORMATION_MESSAGE);
    }

    // Exibe um menu de opções e retorna o índice da opção selecionada
    public static int showOptions(String[] options) {
        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, "Escolha uma opção", JOptionPane.OK_CANCEL_OPTION);

        return menu.getSelectedIndex();
    }

    // Solicita ao usuário a quantidade de carros a serem inseridos
    public static int askCarsQuantity() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos carros deseja inserir? ", "Quantidade de carros", JOptionPane.QUESTION_MESSAGE));
    }   

    // Solicita ao usuário o modelo do carro
    public static String askCarModel() {
        return JOptionPane.showInputDialog(null, "Modelo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
    }

    // Solicita ao usuário a cor do carro
    public static String askCarColor() {
        return JOptionPane.showInputDialog(null, "Cor: ", "Cor do carro", JOptionPane.QUESTION_MESSAGE);
    }

    // Gera uma string com as informações do carro
    public static String generateInfoCars(Car car) {
        StringBuilder separator = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            separator.append("-");
        }
        return "Modelo: " + car.getModel() + " | Cor: " + car.getColor() + "\n" + separator.toString() + "\n";
    }

    // Exibe as informações dos carros cadastrados
    public static void showInfoCars(String info) {
        JOptionPane.showMessageDialog(null, info, "Carros cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }

    // Exibe uma mensagem de erro
    public static void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}