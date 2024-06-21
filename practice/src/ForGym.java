public class ForGym {
    public static void main(String[] args) {

        pokemon p1 = new pokemon();
        p1.hp = 100;
        p1.cp = 100;
        p1.candy = 100;
        p1.level = 1;
        p1.setName("Pikachu");

        pokemon p2 = new pokemon();
        p2.hp = 100;
        p2.cp = 100;
        p2.candy = 100;
        p2.level = 2;
        p2.setName("Charmander");

        gym fcuGym = new gym();
        pokemon winner = fcuGym.fight(p1, p2);

        System.out.println("winner is "+winner.getName());

    }
}
