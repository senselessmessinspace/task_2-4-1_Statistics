package ru.netology.stats;

public class StatsService {

    public long totalSumOfAllSales (long[] array) {
        long summ = 0;
        for (long element:array) {
            summ = summ + element;
        }

        return summ;
    }
// тут надо бы подумать, что возвращать - инт или дабл
    public long avgSumOfAllSales (long[] array) {
        return totalSumOfAllSales(array)/array.length;
    }

    public int maxSalesMonthNumber (long[] array) {
        int maxSalesMonth = 0;
        int SalesMonth = 0;
        for (long element:array) {
            if ( element >= array[maxSalesMonth]) {
                maxSalesMonth = SalesMonth;
            }
            SalesMonth++;
        }

        return maxSalesMonth+1;
    }

    public int minSalesMonthNumber (long[] array) {
        int minSalesMonth = 0;
        int SalesMonth = 0;
        for (long element:array) {
            if ( element <= array[minSalesMonth]) {
                minSalesMonth = SalesMonth;
            }
            SalesMonth++;
        }

        return minSalesMonth+1;
    }

    public int salesMonthNumberUnderAvgSales (long[] array) {
        int SalesMonthAmount = 0;
        int avgSales = avgSumOfAllSales(array);
        for (long element:array) {
            if ( element < avgSales) {
                SalesMonthAmount++;
            }
        }

        return SalesMonthAmount;
    }

    public int salesMonthNumberOverAvgSales (long[] array) {
        //Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
        int SalesMonthAmount = 0;
        long avgSales = avgSumOfAllSales(array);
        for (long element:array) {
            if ( element > avgSales) {
                SalesMonthAmount++;
            }
        }

        return SalesMonthAmount;
    }
}
