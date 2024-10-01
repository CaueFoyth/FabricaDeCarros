package view;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import model.Car;

public class InputOutput {

    public static void showMenu() {
        JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de fabrica de carros!\n", "Menu", JOptionPane.INFORMATION_MESSAGE);
    }

    public static int showOptions(String[] options) {
        JComboBox<String> menu = new JComboBox<>(options);
        JOptionPane.showConfirmDialog(null, menu, "Escolha uma opção", JOptionPane.OK_CANCEL_OPTION);

        return menu.getSelectedIndex();
    }

    public static int askCarsQuantity() {
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos carros deseja inserir? ", "Quantidade de carros", JOptionPane.QUESTION_MESSAGE));
    }   

    public static String askCarModel() {
        return JOptionPane.showInputDialog(null, "Modelo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
    }
    public static String askCarColor() {
        return JOptionPane.showInputDialog(null, "Cor: ", "Cor do carro", JOptionPane.QUESTION_MESSAGE);
    }

    public static String generateInfoCars(Car car) {
        return "Modelo: " + car.getModel() + " | Cor: " + car.getColor() + "\n" + "-".repeat(30) + "\n";
    }
    public static void showInfoCars(String info) {
        JOptionPane.showMessageDialog(null, info, "Carros cadastrados", JOptionPane.INFORMATION_MESSAGE);
    }
    public static void showErrorMessage(String message) {
        JOptionPane.showMessageDialog(null, message, "Erro", JOptionPane.ERROR_MESSAGE);
    }
}
