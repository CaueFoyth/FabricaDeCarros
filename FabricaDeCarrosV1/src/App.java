import car.*;

public class App {
    public static void main(String[] args) throws Exception {
        car.Car carro1 = new car.Car();

        carro1.model = EntradaSaida.SolicitarModelo();
        carro1.color = EntradaSaida.SolicitarCor();

        System.out.println("Modelo: "+carro1.model+" | Cor: "+carro1.color);
    }
} 