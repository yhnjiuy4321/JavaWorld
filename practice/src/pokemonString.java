public class pokemonString {
    String name;
    int hp;
    int cp;
    int candy;
    int level;

    // 假?添加构造函?
    public pokemonString(String name, int hp, int cp, int candy, int level) {
        this.name = name;
        this.hp = hp;
        this.cp = cp;
        this.candy = candy;
        this.level = level;
    }

    // 添加?取名字的方法
    public String getName() {
        return name;
    }
}
