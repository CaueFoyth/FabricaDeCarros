import car.*;

public class App {
    public static void main(String[] args) {
        Car Fusca = new Car();

        Fusca.setModel(EntradaSaida.SolicitarModelo());
        Fusca.setColor(EntradaSaida.SolicitarCor());

        System.out.println("Modelo: "+Fusca.getModel()+" | Cor: "+Fusca.getColor());

        CarroEsportivo FuscaEsportivo = new CarroEsportivo();
        FuscaEsportivo.setModel(EntradaSaida.SolicitarModelo());
        FuscaEsportivo.setColor(EntradaSaida.SolicitarCor());
        FuscaEsportivo.setMotorEsportivo(EntradaSaida.SolicitarMotorEsportivo());
        FuscaEsportivo.setVelocidadeMaxima(EntradaSaida.SolicitarVelocidadeMaxima());

        System.out.println("Modelo: "+FuscaEsportivo.getModel()+" | Cor: "+FuscaEsportivo.getColor()+" | Motor: "+FuscaEsportivo.getMotorEsportivo()+" | Velocidade Máxima: "+FuscaEsportivo.getVelocidadeMaxima());
    }
}
