package controller;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import model.Car;
import model.CarroEsportivo;
import view.EntradaSaida;

public class Controladora {
    private static List<Car> carros = new ArrayList<>();
    private static List<CarroEsportivo> carrosEsportivos = new ArrayList<>();
    public static void exibeMenu() {
        String[] opcoesSelecionadas = {"Inserir Carro", "Listar Carros", "Sair"};
        int opcao = EntradaSaida.SolicitarOpcao(opcoesSelecionadas);
        switch (opcao) {
            case 0:
                String[] opcoesInserir = {"Inserir Carro", "Inserir Carro Esportivo"};
                int opcaoInserir = EntradaSaida.SolicitarOpcao(opcoesInserir);

                switch (opcaoInserir) {
                    case 0:
                        inserirCarro();
                        break;
                    case 1:
                        inserirCarroEsportivo();
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                listarCarros();
                break;
            case 2:
                System.exit(0);
                break;
            default:
                break;
        }
    }
    private static void inserirCarro() {
        Car carro = new Car();
        carro.setModel(EntradaSaida.SolicitarModelo());
        carro.setColor(EntradaSaida.SolicitarCor());
        carros.add(carro);
        JOptionPane.showMessageDialog(null, "Carro comum adicionado com sucesso!");
    }

    private static void inserirCarroEsportivo() {
        CarroEsportivo carroEsportivo = new CarroEsportivo();
        carroEsportivo.setModel(EntradaSaida.SolicitarModelo());
        carroEsportivo.setColor(EntradaSaida.SolicitarCor());
        carroEsportivo.setMotorEsportivo(EntradaSaida.SolicitarMotorEsportivo());
        carroEsportivo.setVelocidadeMaxima(EntradaSaida.SolicitarVelocidadeMaxima());
        carrosEsportivos.add(carroEsportivo);
        JOptionPane.showMessageDialog(null, "Carro esportivo adicionado com sucesso!");
    }

    private static void listarCarros() {
        StringBuilder listaDeCarros = new StringBuilder();
        
        if (carros.isEmpty() && carrosEsportivos.isEmpty()) {
            listaDeCarros.append("Nenhum carro foi cadastrado ainda.");
        } else {
            for (Car carro : carros) {
                listaDeCarros.append("Carro: Modelo: ").append(carro.getModel()).append(", Cor: ").append(carro.getColor()).append("\n");
            }

            for (CarroEsportivo carroEsportivo : carrosEsportivos) {
                listaDeCarros.append("Carro Esportivo: Modelo: ").append(carroEsportivo.getModel())
                        .append(", Cor: ").append(carroEsportivo.getColor())
                        .append(", Motor: ").append(carroEsportivo.getMotorEsportivo())
                        .append(", Velocidade Máxima: ").append(carroEsportivo.getVelocidadeMaxima()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, listaDeCarros.toString());
    }

}