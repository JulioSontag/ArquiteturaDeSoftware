public class Eletronico implements Produto {
    private String nome;
    private double preco;
    private double pesoKg;

    public Eletronico(String nome, double preco, double pesoKg) {
        this.nome = nome;
        this.preco = preco;
        this.pesoKg = pesoKg;
    }

    public double getPreco() {
        return preco;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    @Override
    public double accept(CarrinhoVisitor visitor) {
        return visitor.visit(this);
    }
}