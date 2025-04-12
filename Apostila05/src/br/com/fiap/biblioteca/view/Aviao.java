package br.com.fiap.biblioteca.view;

import br.com.fiap.biblioteca.Cor;

public class Aviao {
    private String modelo;
    private int quantidadeLugares;
    private String prefico;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;
    private int getQuantidaDeTurbinas;

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugares;
    }

    public String getPrefico() {
        return prefico;
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

    public int getGetQuantidaDeTurbinas() {
        return getQuantidaDeTurbinas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public void setPrefico(String prefico) {
        this.prefico = prefico;
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

    public void setGetQuantidaDeTurbinas(int getQuantidaDeTurbinas) {
        this.getQuantidaDeTurbinas = getQuantidaDeTurbinas;
    }
}
