package generalPractices.codewars.kyu7;

/*
Create a function that returns the name of the winner in a fight between two fighters.

Each fighter takes turns attacking the other and whoever kills the other first is victorious.
Death is defined as having health <= 0.
Each fighter will be a Fighter object/instance.
Both health and damagePerAttack will be integers larger than 0. You can mutate the Fighter objects.
Your function also receives a third argument, a string, with the name of the fighter that attacks first.
 */
public class TwoFightersOneWinner {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        if (firstAttacker.equals(fighter1.name)) {
            while (true) {
                fighter2.health -= fighter1.damagePerAttack;
                if (fighter2.health <= 0)
                    return fighter1.name;
                fighter1.health -= fighter2.damagePerAttack;
                if (fighter1.health <= 0)
                    return fighter2.name;
            }
        } else return declareWinner(fighter2, fighter1, firstAttacker);


    }
}


