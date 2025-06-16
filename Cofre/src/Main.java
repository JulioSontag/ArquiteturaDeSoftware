public class Main {
    public static void main(String[] args) {

        Cofre portaDoCofre = new ProxyCofre("senha123");

        System.out.println("Tentativa 1: Senha Errada");
        portaDoCofre.abrir("senha122");

        System.out.println("\n");

        System.out.println("Tentativa 2: Senha Correta");
        portaDoCofre.abrir("senha123");
    }
}