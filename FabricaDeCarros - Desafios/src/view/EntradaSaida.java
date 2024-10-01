package view;

import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class EntradaSaida {

    public static int SolicitarOpcao(String[] opcoesSelecionadas) {
        String[] opcoes = opcoesSelecionadas;
        JComboBox<String> menu = new JComboBox<>(opcoes);

        JOptionPane.showConfirmDialog(null, menu, "Seleciona a opção desejada", JOptionPane.OK_CANCEL_OPTION);

        return menu.getSelectedIndex();
    }

    public static String SolicitarModelo(){
        return JOptionPane.showInputDialog(null, "Informe o modelo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
    }

    public static String SolicitarCor(){
        return JOptionPane.showInputDialog(null, "Informe a cor: ", "Cor do carro", JOptionPane.QUESTION_MESSAGE);
    }

    public static String SolicitarMotorEsportivo(){
        return JOptionPane.showInputDialog(null, "Informe o motor: ", "Motor Esportivo", JOptionPane.QUESTION_MESSAGE);
    }

    public static int SolicitarVelocidadeMaxima(){
        return Integer.parseInt(JOptionPane.showInputDialog(null, "Velocidade Máxima: ", "Velocidade Máxima", JOptionPane.QUESTION_MESSAGE));
    }
}