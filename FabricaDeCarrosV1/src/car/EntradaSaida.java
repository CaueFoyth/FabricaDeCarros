package car;

import javax.swing.JOptionPane;


public class EntradaSaida {
    public static String SolicitarModelo(){
        return JOptionPane.showInputDialog(null, "Informe o modelo: ", "Modelo do carro", JOptionPane.QUESTION_MESSAGE);
    }

    public static String SolicitarCor(){
        return JOptionPane.showInputDialog(null, "Informe a cor: ", "Cor do carro", JOptionPane.QUESTION_MESSAGE);
    }
}