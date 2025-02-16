package model;

public class Car {
    private String modelo;
    private String cor;

    // Define o modelo do carro
    public void setModel(String modelo) {
        this.modelo = modelo;
    }

    // Define a cor do carro
    public void setColor(String cor) {
        this.cor = cor;
    }

    // Retorna o modelo do carro
    public String getModel() {
        return this.modelo;
    }

    // Retorna a cor do carro
    public String getColor() {
        return this.cor;
    }
}