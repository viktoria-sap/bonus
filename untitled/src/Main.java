public class Main {
    public static void main(String[] args) {
        int initialAmount = 100;
        long bonus;
        long addedAmount = 1100;
        if (addedAmount < 1000) {
            bonus = 0;
        } else {
            bonus = addedAmount / 100;
        }
        System.out.println(bonus);

        long finalAmount = initialAmount + addedAmount + bonus;
        System.out.println(finalAmount);

    }
}
