public class gym {
    pokemon fight(pokemon p1, pokemon p2) {
        pokemon winner = p1;
        if (p1.level < p2.level) {
            winner = p2;
        } else if (p1.level > p2.level) {
            winner = p1;
        } else {
            if (p1.cp < p2.cp) {
                winner = p2;
            } else if (p1.cp>p2.cp){
                winner = p1;
            }
            else {

            }


        }
return winner;

    }

}








