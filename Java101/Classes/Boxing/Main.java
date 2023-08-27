package Classes.Boxing;

public class Main {
    public static void main(String[] args) {
        Fighter fighter = new Fighter("Muhammed Ali", 10, 120, 100, 100);
        Fighter fighter2 = new Fighter("Bruce Lee", 20, 85, 85, 0);

        Match match = new Match(fighter, fighter2, 80, 150);

        match.run();
    }
}
