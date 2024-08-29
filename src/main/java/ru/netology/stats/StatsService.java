package ru.netology.stats;

public class StatsService {
// long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public long sumAllSales(long[] sales) {

        long allSales = 0;
        for (long sale : sales) {
            allSales += sale;
        }

        return allSales;
    }

    public long averageSale(long[] sales) {
        long averege = sumAllSales(sales) / 12;
        return averege;
    }

    public int maxMonthSale(long[] sales) {

        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonthSale(long[] sales) {

        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[minMonth] >= sales[i]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessAveregeMonthSale(long[] sales) {

        int i = 0;
        long averege = averageSale(sales);
        for (long sale : sales) {
            if (sale < averege) {
                i++;
            }
        }
        return i;
    }

    public int aboveAveregeMonthSale(long[] sales) {

        int i = 0;
        long averege = averageSale(sales);
        for (long sale : sales) {
            if (sale > averege) {
                i++;
            }
        }
        return i;
    }


}


