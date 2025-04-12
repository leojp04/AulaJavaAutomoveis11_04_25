package br.com.fiap.biblioteca.view;

import br.com.fiap.biblioteca.Cor;

public class Lancha {

    private String modelo;
    private int quantidadeDeLugares;
    private double comprimento;
    private int anoFabricacao;
    private Cor cor;
    private  int getQuantidadeDeMotores;

    public String getModelo() {
        return modelo;
    }

    public int getQuantidadeDeLugares() {
        return quantidadeDeLugares;
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

    public int getGetQuantidadeDeMotores() {
        return getQuantidadeDeMotores;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeDeLugares(int quantidadeDeLugares) {
        this.quantidadeDeLugares = quantidadeDeLugares;
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

    public void setGetQuantidadeDeMotores(int getQuantidadeDeMotores) {
        this.getQuantidadeDeMotores = getQuantidadeDeMotores;
    }
}
