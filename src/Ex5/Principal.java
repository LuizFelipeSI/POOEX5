package Ex5;

public class Principal {

    public static void main(String[] args) {

        Produto sofa = new Produto(1, "sofá", 2050);
        Produto cadeira = new Produto(2, "cadeira", 500);
        Produto carro = new Produto(3, "carro", 30000);
        Produto escada = new Produto(2, "cadeira", 500);

        GerenciadorDeProdutos.adicionarProduto(sofa);
        GerenciadorDeProdutos.adicionarProduto(cadeira);
        GerenciadorDeProdutos.adicionarProduto(cadeira);
        GerenciadorDeProdutos.adicionarProduto(carro);
        GerenciadorDeProdutos.adicionarProduto(escada);
        GerenciadorDeProdutos.listarProduto();
        GerenciadorDeProdutos.removerProduto(1);
        GerenciadorDeProdutos.listarProduto();


    }
}
