// Define o pacote onde a classe está localizada (organização em pastas)
package br.com.fiap.veiculos.model;
// Declara a classe Livro como pública (pode ser acessada de qualquer lugar)
public class Livro {

    // ===== Atributos (características do objeto) =====

    // Armazena o título do livro (acesso privado - só dentro da classe)
    private String titulo;

    // Armazena a quantidade de páginas do livro (acesso privado)
    private int paginas;

    // Armazena se o livro está disponível para empréstimo ou não (acesso privado)
    private boolean disponivel;

    // ===== Método =====

    // Marca o livro como "emprestado", ou seja, altera o estado para indisponível
    void emprestar() {
        disponivel = false;
    }

    // ===== Getters e Setters =====

    // Retorna (lê) o valor atual do título do livro
    public String getTitulo() {
        return titulo;
    }

    // Altera (escreve) o valor do título do livro
    public void setTitulo(String titulo) {
        // Aqui temos dois "titulo": o da classe e o parâmetro recebido
        // Para evitar confusão, usamos "this.titulo" para deixar claro que queremos
        // acessar o atributo do objeto (aquele declarado lá em cima na classe)

        // this.titulo → atributo do objeto
        // titulo → valor recebido como argumento (parâmetro)
        // Então essa linha diz: "coloque o valor do parâmetro no atributo do objeto"
        this.titulo = titulo;
    }

    // Retorna (lê) a quantidade de páginas do livro
    public int getPaginas() {
        return paginas;
    }

    // Altera (escreve) a quantidade de páginas do livro
    public void setPaginas(int paginas) {
        // Mesma ideia aqui: usamos "this" para indicar o atributo da classe
        this.paginas = paginas;
    }

    // Retorna se o livro está disponível (true) ou não (false)
    public boolean isDisponivel() {
        return disponivel;
    }

    // Altera o valor de disponibilidade do livro
    public void setDisponivel(boolean disponivel) {
        // Aqui também: "this.disponivel" é o atributo, "disponivel" é o parâmetro
        this.disponivel = disponivel;
    }
}


// Os modificadores de acesso em Java controlam quem pode acessar atributos e métodos de uma classe.
// No diagrama de classes UML, esses modificadores são representados por símbolos:

// - (private)    → Acesso restrito à própria classe.
// ~ (default)    → Acesso permitido apenas dentro do mesmo pacote. Não tem palavra-chave explícita em Java.
// # (protected)  → Acesso permitido dentro do mesmo pacote e também por subclasses, mesmo em outros pacotes.
// + (public)     → Acesso permitido de qualquer lugar.

// Exemplo representado no diagrama da classe "Celular":

/*
    Classe: Celular

    - fabricante : String       // private → só a classe Celular pode acessar
    ~ modelo : String           // default → qualquer classe no mesmo pacote pode acessar
    # anoFabricacao : int       // protected → classes no mesmo pacote ou subclasses podem acessar
    + versao : float            // public → qualquer classe pode acessar

    - tocar() : int             // private → só a classe Celular pode chamar esse método
    ~ receberSms() : boolean    // default → método acessível no mesmo pacote
    # tocarDespertador() : void // protected → acessível no pacote ou por herança
    + exibirUltimaLigacao() : Ligacao // public → acessível de qualquer lugar
*/
