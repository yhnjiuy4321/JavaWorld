public class pokemon {
    String name;
    int hp, cp, candy, level;

    int powerup() {
        if (candy<5){
            System.out.println("candy is not enough,please charge");

        }
        else {
            candy = candy - 5;
            cp = cp + 5;
        }
        return cp;//結果如何，都要回傳


    }

    int evolve() {


        if (candy<20){
            System.out.println("candy is not enough,please charge");

        }
        else {
            candy -= 20;
            cp = cp + 10;
            level = level + 1;
        }
        return level;


    }
    // 新增：設置寶可夢的名字
    public void setName(String name) {
        this.name = name;
    }

    // 新增：讀取寶可夢的名字
    public String getName() {
        return this.name;
    }


}

