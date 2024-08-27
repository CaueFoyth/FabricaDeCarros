package view;

import javax.swing.JOptionPane;


public class EntradaSaida {
    public static String SolicitarModelo(){
        return JOptionPane.showInputDialog(null, "Informe o modelo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
    }

    public static String SolicitarModeloEsportivo(){
        return JOptionPane.showInputDialog(null, "Informe o modelo esportivo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
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