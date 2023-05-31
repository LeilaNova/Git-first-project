public class Main {
    public static void main(String[] args) {
        int[] sales = new int[]{5, 4, 500, 900};
        SalesManager salesManager = new SalesManager(sales);
        int max = salesManager.max();
        int min = salesManager.min();
        int average = salesManager.average();
        System.out.println("Наибольшая продажа: " + max);
        System.out.println("Наименьшая продажа: " + min);
        System.out.println("Среднее значение: " + average);
    }
}