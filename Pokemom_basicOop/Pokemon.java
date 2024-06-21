public class Pokemon {
  // define 屬性： hp, cp, candy, level
  String name;
  int hp;
  int cp;
  int candy;
  int level;

  // define 方法
  // 方法一： int powerup()
  // 減少5顆糖果 cp會增加5
  // 回傳cp值
  int powerup() {
    if (candy < 5) {
      System.out.println("Candy不夠強化");
    } else {
      candy = candy - 5;
      cp += 5;
    }
    return cp;
  }

  //方法二： int evolve()
  // 減少20顆糖果, cp會增加10, level會增加1
  // 回傳level值
  int evolve() {
    if (candy < 20) {
      System.out.println("Candy不夠進化");
    } else {
      candy -= 20;
      cp += 10;
      level++;

    }
    return level;
  }

}
