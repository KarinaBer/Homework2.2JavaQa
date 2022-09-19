public class main {

    public static void main(String[] args) {

        int initialAccount = 100;
        int refill = 1100;
        int finalScore = initialAccount + refill;

        int bonus;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        System.out.println(bonus);
        System.out.println(bonus + finalScore);
    }
}
