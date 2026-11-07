package ru.netology.stats;

public class StatsService {

    // 1. Сумма всех продаж
    public long sum(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total += sale;
        }
        return total;
    }

    // 2. Средняя сумма продаж в месяц
    public long average(long[] sales) {
        long total = sum(sales);
        return total / sales.length;
    }

    // 3. Номер месяца с максимальными продажами (пик)
    public int maxSales(long[] sales) {
        int maxMonth = 0; 
        for (int i = 0; i < sales.length; i++) {
            // Используем >=, чтобы найти ПОСЛЕДНИЙ месяц с максимальными продажами
            if (sales[i] >= sales[maxMonth]) { 
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // 4. Номер месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            // Используем <=, чтобы найти ПОСЛЕДНИЙ месяц с минимальными продажами
            if (sales[i] <= sales[minMonth]) { 
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    // 5. Количество месяцев, где продажи ниже среднего
    public int monthsBelowAverage(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }

    // 6. Количество месяцев, где продажи выше среднего
    public int monthsAboveAverage(long[] sales) {
        long avg = average(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count++;
            }
        }
        return count;
    }
}