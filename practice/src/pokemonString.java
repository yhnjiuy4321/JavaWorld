public class pokemonString {
    String name;
    int hp;
    int cp;
    int candy;
    int level;

    // ��?�K�[�۳y��?
    public pokemonString(String name, int hp, int cp, int candy, int level) {
        this.name = name;
        this.hp = hp;
        this.cp = cp;
        this.candy = candy;
        this.level = level;
    }

    // �K�[?���W�r����k
    public String getName() {
        return name;
    }
}
