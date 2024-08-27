package model;

public class CarroEsportivo extends CarroBase {
    private String motorEsportivo;
    private int velocidadeMaxima;

    public String getMotorEsportivo() {
        return this.motorEsportivo;
    }

    public void setMotorEsportivo(String motorEsportivo) {
        this.motorEsportivo = motorEsportivo;
    }

    public int getVelocidadeMaxima() {
        return this.velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModel() {
        return this.modelo;
    }

    public void setModel(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return this.cor;
    }

    public void setColor(String cor) {
        this.cor = cor;
    }
}
