public class ProxyCofre implements Cofre {

        private CofreReal cofreReal;
        private String senhaCorreta;

        public ProxyCofre(String senhaCorreta) {
            this.cofreReal = new CofreReal();
            this.senhaCorreta = senhaCorreta;
        }

        @Override
        public void abrir(String senhaFornecida) {
            System.out.println("PROXY: Validando a senha...");
            if (this.senhaCorreta.equals(senhaFornecida)) {
                System.out.println("PROXY: Senha correta. Acesso liberado.");
                this.cofreReal.abrir(senhaFornecida);
            } else {

                System.out.println("PROXY: Senha incorreta! Acesso negado.");
        }
    }
}
