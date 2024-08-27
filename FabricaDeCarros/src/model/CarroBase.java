package model;

public abstract class CarroBase implements Contract {
    protected String modelo;
    protected String cor;
    protected int anoFabricacao;
    protected String potenciaMotor;

    protected void acelerar() {
        System.out.println("Acelerando");
    }
}
