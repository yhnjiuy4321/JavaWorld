public class Gym {

  Pokemon fight(Pokemon pokemon1, Pokemon pokemon2) {

    Pokemon winner = pokemon1;
    if (pokemon1.level < pokemon2.level) {
      winner = pokemon2;
    } else if (pokemon1.level > pokemon2.level) {
      winner = pokemon1;

    } else {
      if (pokemon1.cp < pokemon2.cp) {
        winner = pokemon2;
      } else if (pokemon1.cp > pokemon2.cp) {
        winner = pokemon1;
      }
    }
    return winner;
  }
}
