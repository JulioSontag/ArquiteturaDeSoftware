public class Frete implements CarrinhoVisitor {

    @Override
    public double visit(Livro livro) {
        System.out.println("Calculando frete para Livro: R$ 5.00");
        return 5.0;
    }

    @Override
    public double visit(Eletronico eletronico) {
        double frete = eletronico.getPesoKg() * 3.5;
        System.out.println("Calculando frete para Eletrônico (peso: " + eletronico.getPesoKg() + "kg): R$ " + String.format("%.2f", frete));
        return frete;
    }
}