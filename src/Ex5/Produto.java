package Ex5;

public class Produto {

    private int id;
    private String nome;
    private double preco;

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return "id: " + getId() + "\nnome: " + getNome() + "\npreço: " + String.format("%.2f",getPreco()) + "\n";
    }
}
