import car.*;

public class App {
    public static void main(String[] args) throws Exception {
        Car carro1 = new Car();

        carro1.setModel(EntradaSaida.SolicitarModelo());
        carro1.setColor(EntradaSaida.SolicitarCor());

        System.out.println("Modelo: "+carro1.getModel()+" | Cor: "+carro1.getColor());
    }
}