public class Main {
    public static void main(String[] args) {

        int sBalance = 135;
        int refill = 1500;
        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100 * 1;
        } else {
            bonus = 0;
        }
        int balance = sBalance + refill + bonus;
        System.out.println("Ваш баланс:" + balance);
    }
}
