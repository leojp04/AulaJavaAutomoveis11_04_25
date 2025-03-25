import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Criar o objeto responsável por ler os dados digitados no teclado
        Scanner leitor = new Scanner(System.in);

        //Criar um objeto tenis com os valores digitados pelo usuário
        System.out.println("Digite o modelo do tenis");
        String modelo = leitor.next() + leitor.nextLine(); //Le a string com mais de 1 palavra

        System.out.println("Digite a cor");
        String cor = leitor.next() + leitor.nextLine();

        System.out.println("Digite o tamanho do tenis");
        int tamanho = leitor.nextInt();

        System.out.println("Digite o valor");
        double valor = leitor.nextDouble();

        System.out.println("Está disponível? true/false");
        boolean disponivel = leitor.nextBoolean();

        //Criar o objeto Tenis
        Tenis tenis1 = new Tenis();
        //Colocar os valores lidos dentro do objeto
        tenis1.modelo = modelo;
        tenis1.cor = cor;
        tenis1.disponivel = disponivel;
        tenis1.tamanho = tamanho;
        tenis1.preco = valor;

        //Exibir os valores que estão dentro do objeto
        System.out.println("Modelo: " + tenis1.modelo);
        System.out.println("Cor: " + tenis1.cor);
        System.out.println("Disponível: " + tenis1.disponivel);
        System.out.println("Tamanho: " + tenis1.tamanho);
        System.out.println("Preço: " + tenis1.preco);

    }
}
