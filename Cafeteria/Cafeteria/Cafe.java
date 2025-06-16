public class Cafe {
    private final  String tipo;
    private final boolean acucar;
    private final boolean leite;
    private final boolean canela;
    private final boolean chantilly;

    public Cafe(String tipo, boolean acucar, boolean leite, boolean canela, boolean chantilly) {
        this.tipo = tipo;
        this.acucar = acucar;
        this.leite = leite;
        this.canela = canela;
        this.chantilly = chantilly;
    }


    public String getTipo() {
        return tipo;
    }

    public boolean isAcucar() {
        return acucar;
    }

    public boolean isLeite() {
        return leite;
    }

    public boolean isCanela() {
        return canela;
    }

    public boolean isChantilly() {
        return chantilly;
    }


    @Override
    public String toString() {
        return String.format(
                "Cafe %n" +
                        "  Tipo: %s,%n" +
                        "  Acucar: %b,%n" +
                        "  Leite: %b,%n" +
                        "  Canela: %b,%n" +
                        "  Chantilly: %b%n",

                tipo, acucar, leite, canela, chantilly
        );
    }

}

