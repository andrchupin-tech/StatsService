package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    StatsService service = new StatsService();
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouldCalculateSum() {
        long expected = 180;
        long actual = service.sum(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverage() {
        long expected = 15;
        long actual = service.average(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        int expected = 8;
        int actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMinMonth() {
        int expected = 9;
        int actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsBelowAverage() {
        int expected = 5;
        int actual = service.monthsBelowAverage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthsAboveAverage() {
        int expected = 5;
        int actual = service.monthsAboveAverage(sales);
        Assertions.assertEquals(expected, actual);
    }
}