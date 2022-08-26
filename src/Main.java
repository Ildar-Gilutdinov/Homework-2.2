public class Main {

    public static void main(String[] args) {
        int[] sales = {10, 30, 40, 50, 70};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Значение расчёта обрезанного среднего: " + salesManager.salesMinMax(sales));
    }

}
