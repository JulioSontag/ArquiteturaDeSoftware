public class CafeBuilder implements Builder {
    private final String tipo;
    private boolean temAcucar = false;
    private boolean temLeite = false;
    private boolean temCanela = false;
    private boolean temChantilly = false;

    public CafeBuilder(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Builder comAcucar() {
        this.temAcucar = true;
        return this;
    }

    @Override
    public Builder comLeite() {
        this.temLeite = true;
        return this;
    }

    @Override
    public Builder comCanela() {
        this.temCanela = true;
        return this;
    }

    @Override
    public Builder comChantilly() {
        this.temChantilly = true;
        return this;
    }


    @Override
    public Cafe build() {
        return new Cafe(tipo, temAcucar,temLeite, temCanela, temChantilly);
    }
}