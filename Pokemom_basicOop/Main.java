public class Main {
  public static void main(String[] args) {

    //建立一隻Pokemon
    Pokemon A = new Pokemon();
    A.name = "Pikachu";
    A.hp = 100;
    A.cp = 100;
    A.candy = 100;
    A.level = 1;

    Pokemon B = new Pokemon();
    B.name = "Psyduck";
    B.hp = 100;
    B.cp = 100;
    B.candy = 100;
    B.level = 2;

    Gym fcuGym = new Gym();

    //第一次比賽
    Pokemon winner=fcuGym.fight(A, B);//winner是一個新物件

    System.out.println("Winner is "+winner.name);
    A.powerup();
    A.evolve();
    System.out.println("A's level is "+A.level);
    System.out.println("A's cp is "+A.cp);
    System.out.println("B's level is "+B.level);
    System.out.println("B's cp is "+B.cp);

    //第二次比賽
    Pokemon winner2=fcuGym.fight(A, B);

    System.out.println("Winner is "+winner2.name);
    /*


    Pokemon winner=fcuGym.fight(A, B)
    -->winner是一個新的物件，不是A或B，所以就算A或B的屬性改變，winner的屬性不會改變
    所以要再改變A或B後(powerup()或evolve())設一新物件--->Pokemon winner2=fcuGym.fight(A, B)



    */
  }
}