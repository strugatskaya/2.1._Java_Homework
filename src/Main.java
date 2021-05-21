public class Main {
    public static void main(String[] args) {
        int ticketPrice = 35_870;
        int oneMileCost = 20;
        int totalMilesBonuses = (int) ticketPrice / oneMileCost;
        System.out.println(totalMilesBonuses);
    }
}

