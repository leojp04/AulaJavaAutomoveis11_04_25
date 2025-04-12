package br.com.fiap.veiculos.model;

// Classe que representa uma cor no padrão RGB com nome
public class Cor {

    // ===== Atributos privados =====
    private String nome; // nome da cor (ex: "Vermelho", "Azul")
    private int r;       // valor de vermelho (0 a 255)
    private int g;       // valor de verde (0 a 255)
    private int b;       // valor de azul (0 a 255)

    // ===== Método para alterar toda a cor de uma vez =====
    public void alterarCor(int r, int g, int b, String nome) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.nome = nome;
    }

    // ===== Getters e Setters =====

    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Valor R (vermelho)
    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    // Valor G (verde)
    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    // Valor B (azul)
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
