package ru.netology.stats;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] array = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

    @Test
    public void shouldGetTotalSum() {
        StatsService service = new StatsService();
        int expected = 180;
        long actual = service.totalSumOfAllSales(array);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAvgSum() {
        StatsService service = new StatsService();
        int expected = 15;
        long actual = service.avgSumOfAllSales(array);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxSalesMonth() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSalesMonthNumber(array);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetMinSalesMonth() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSalesMonthNumber(array);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetSalesMonthUnderAvgSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesMonthNumberUnderAvgSales(array);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldGetSalesMonthOverAvgSales() {
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesMonthNumberOverAvgSales(array);

        assertEquals(expected, actual);
    }
}