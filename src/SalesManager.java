import java.util.Arrays;

public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public static double salesMinMax(int[] sales) { // метод расчета среднего
        System.out.println("Программа расчета обрезанного среднего");
        System.out.println("Данные массива: " + "\n" + Arrays.toString(sales)); //вывод исходных данных
        int max = sales[0];
        int min = sales[0];
        long sum = 0;
        for (int i = 0; i < sales.length; i++) { //цикл for
            sum = sum + sales[i];
            if (sales[i] > max)  //проверка по условию, поиск мах значения массива
                max = sales[i];
            if (sales[i] < min)  //проверка по условию, поиск мин значения массива
                min = sales[i];
        }
        return ((double) sum - max - min) / (sales.length - 2); // расчет среднего
    }
}
