public class Main {
    public static void main(String[] args) {
        long[] sales = new long[]{5, 4, 500, 900};
        SalesManager salesManager = new SalesManager(sales);
        long max = salesManager.max();
        System.out.println("Наибольшая продажа: " + max);
    }
}