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
        return cp;//���G�p��A���n�^��


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
    // �s�W�G�]�m�_�i�ڪ��W�r
    public void setName(String name) {
        this.name = name;
    }

    // �s�W�GŪ���_�i�ڪ��W�r
    public String getName() {
        return this.name;
    }


}

