package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    public void testAllSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sumAllSales(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testaverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSale(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testMaxMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.maxMonthSale(sales);
        long expected = 8;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testMinMonthSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.minMonthSale(sales);
        long expected = 9;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testLessAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.lessAveregeMonthSale(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void testAboveAverageSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.aboveAveregeMonthSale(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);


    }
    //форматированный вариант 

}