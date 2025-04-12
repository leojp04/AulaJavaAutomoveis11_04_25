package br.com.fiap.biblioteca.view;

import br.com.fiap.biblioteca.Cor; // Importa a classe Cor corretamente

public class Carro {

    // Atributos privados (encapsulados)
    private String modelo;
    private int quantidadeLugares;
    private int quantidadePortas;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor; // Objeto do tipo Cor
    private String placa;
    private float motor = 1;

    // ===== Getters =====

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public double getComprimento() {
        return comprimento;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public Cor getCor() {
        return cor;
    }

    public String getPlaca() {
        return placa;
    }

    public float getMotor() {
        return motor;
    }

    // ===== Setters =====

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }
}
