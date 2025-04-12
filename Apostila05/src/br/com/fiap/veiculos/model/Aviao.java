package br.com.fiap.veiculos.model;

public class Aviao {
    private String modelo;
    private int quantidadeLugares;
    private String prefixo;
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

    public String getPrefixo() {
        return prefixo;
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

    public int getQuantidaDeTurbinas() {
        return getQuantidaDeTurbinas;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setQuantidadeLugares(int quantidadeLugares) {
        this.quantidadeLugares = quantidadeLugares;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
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

    public void setQuantidaDeTurbinas(int getQuantidaDeTurbinas) {
        this.getQuantidaDeTurbinas = getQuantidaDeTurbinas;
    }
}
