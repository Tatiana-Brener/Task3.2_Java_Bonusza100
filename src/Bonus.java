public class Bonus {
    public static void main(String[] args) {
        int account = 500;
        int bonus;
        int refill = 2000;
        if (refill > 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }

        System.out.println(bonus);

    }

}
