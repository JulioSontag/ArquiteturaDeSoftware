public interface CarrinhoVisitor {
    double visit(Livro livro);
    double visit(Eletronico eletronico);
}