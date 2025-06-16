public class Main {
    public static void main(String[] args) {

        Builder builderEspresso = new CafeBuilder("Espresso");
        Cafe cafeEspresso = builderEspresso.build();
        System.out.println(cafeEspresso);

        Cafe cappuccino = new CafeBuilder("Cappuccino")
                .comAcucar()
                .comLeite()
                .comCanela()
                .comChantilly()
                .build();
        System.out.println(cappuccino);
    }
}