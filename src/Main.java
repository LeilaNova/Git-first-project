public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{5, 4, 500, 900};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        System.out.println("Наибольшая продажа: " + max);
    }
}