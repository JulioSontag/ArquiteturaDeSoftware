import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Produto> itens = new ArrayList<>();
        itens.add(new Livro("O Senhor dos Anéis", 50.0));
        itens.add(new Eletronico("Notebook Gamer", 5000.0, 2.5));
        itens.add(new Eletronico("Mouse sem fio", 150.0, 0.2));
        itens.add(new Livro("Clean Code", 80.0));

        System.out.println("Calculando Frete Total\n");
        CarrinhoVisitor calculadorDeFrete = new Frete();

        double freteTotal = 0;
        for (Produto item : itens) {
            freteTotal += item.accept(calculadorDeFrete);
        }
        System.out.println("\n-------------------------------------------");
        System.out.println("Custo total do frete: R$ " + String.format("%.2f", freteTotal));
    }
}