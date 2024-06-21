public class POPKEMAN {
    public static void main(String[] args) {

        pokemon aaa=new pokemon();

        aaa.hp=100;
        aaa.cp=100;
        aaa.candy=50;
        aaa.level=1;

        aaa.powerup();
        aaa.evolve();

       /*
        while (aaa.candy<0){

            System.out.println("candy is not enough,please charge");
            return;
        }
*/
/*
        System.out.println(aaa.hp);
        System.out.println(aaa.cp);
        System.out.println(aaa.candy);
        System.out.println(aaa.level);
*/
        pokemon bbb=new pokemon();
        bbb.hp=100;
        bbb.cp=100;
        bbb.candy=21;
        bbb.level=1;


        bbb.powerup();
        bbb.evolve();


    }


}
