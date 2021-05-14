public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int ticketPrice = 2500;
        int forOneMile = 20;
        int mileAmount = 300;
        int bonus;
        bonus = ticketPrice + (forOneMile * mileAmount);
        System.out.println("Ваш бонус = " + bonus);
    }
}
