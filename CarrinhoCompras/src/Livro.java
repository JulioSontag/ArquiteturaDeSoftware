public class Livro implements Produto {
    private String nome;
    private double preco;

    public Livro(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }
    @Override
    public double accept(CarrinhoVisitor visitor) {
        return visitor.visit(this);
    }
}