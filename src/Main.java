public class Main {

    public static void main(String[] args) {
        int balance = 48;
        int amount = 68423;
        boolean adding = amount >= 1000;

        int percent;
        if ( adding ) {
            percent = 1;
        } else {
            percent = 0;
        }

        int bonus = amount / 100 * percent + balance;

        System.out.println(bonus);
    }
}