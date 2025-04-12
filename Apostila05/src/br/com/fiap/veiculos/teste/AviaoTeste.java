package br.com.fiap.veiculos.teste;

import br.com.fiap.veiculos.model.Aviao;
import br.com.fiap.veiculos.model.Cor;

public class AviaoTeste {

    public static void main(String[] args) {
        //Instanciar um Avião
        Aviao bombardier = new Aviao();

        // Colocar informações no avião
        bombardier.setModelo("Global 7500");              // Define o modelo
        bombardier.setQuantidadeLugares(19);              // Define a quantidade de lugares
        bombardier.setPrefixo("N750GX");                  // Define o prefixo
        bombardier.setComprimento(33.88);                 // Define o comprimento (em metros)
        bombardier.setAnoFabricacao(2018);                // Define o ano de fabricação

        Cor cor = new Cor();                              // Cria um objeto do tipo Cor
        cor.alterarCor(255, 255, 255,"Branco");          // Altera os atributos da cor (RGB e nome)
        bombardier.setCor(cor);                           // Define a cor do avião

        bombardier.setQuantidaDeTurbinas(2);              // Define a quantidade de turbinas

        // Exibir as informações do avião
        System.out.println(bombardier.getModelo());               // Retorna diretamente uma String
        System.out.println(bombardier.getQuantidadeLugares());    // Retorna diretamente um int
        System.out.println(bombardier.getPrefixo());              // Retorna diretamente uma String
        System.out.println(bombardier.getComprimento());          // Retorna diretamente um double
        System.out.println(bombardier.getAnoFabricacao());        // Retorna diretamente um int

        // AQUI É DIFERENTE:
        // getCor() retorna um OBJETO do tipo Cor
        // getNome() é chamado nesse objeto Cor para pegar o nome da cor
        // Ou seja: primeiro pega o objeto Cor, depois pega o atributo nome
        // qualquer dúvida vai na classe cor lá está o nome que estão usando.
        System.out.println(bombardier.getCor().getNome());

        System.out.println(bombardier.getQuantidaDeTurbinas());   // Retorna diretamente um int
    }
    }