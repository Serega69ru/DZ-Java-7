package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int MaxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; // запомним его как минимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sum(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale = totalSale + sales[i];
        }
        return totalSale;
    }

    public long averageSale(long[] sales) {
        long totalSale = sum(sales);
        long averageSale = totalSale / sales.length;
        return averageSale;
    }

    public int LessAverageSale(long[] sales) {
        int LessMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSale(sales)) {
                LessMonth += 1;
            }
        }
        return LessMonth;
    }

    public int MoreAverageSale(long[] sales) {
        int MoreMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSale(sales)) {
                MoreMonth += 1;
            }
        }
        return MoreMonth;
    }
}
