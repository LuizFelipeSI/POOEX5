package Ex5;

import java.util.ArrayList;

public class
GerenciadorDeProdutos {

    static ArrayList<String> produtos = new ArrayList<String>();

    public static void adicionarProduto(Object obj) {
        if (produtos.isEmpty()) {
            produtos.add(obj.toString());
            System.out.println("Produto adicionado com sucesso");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                if (produtos.contains(obj.toString())) {
                    System.out.println("Produto já cadastrado");
                    break;
                } else {
                    produtos.add(obj.toString());
                    System.out.println("Produto adicionado com sucesso");
                    break;
                }
            }
        }
    }

    public static void removerProduto(int id) {
        for (int i = 0; i < produtos.size(); i++) {
            String produto = produtos.get(i);
            if (produtos.get(i).startsWith("id: " + id)) {
                produtos.remove(produto);
                break;
            }
        }
    }

    public static void listarProduto() {
        if (produtos.size() > 0) {
            for (String produto : produtos) {
                System.out.println(produto);
            }
        } else {
            System.out.println("Não há produtos cadastrados");
        }
    }
}

