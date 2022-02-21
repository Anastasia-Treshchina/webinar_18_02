package ru.netology.statistic;


public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes
     * @return - index of first max value
     */
    public long findMax(long[] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }

    public long findMin(long[] incomes) {
        long currentMin = incomes[0];
        for (long income : incomes) {
            if (currentMin > income) {
                currentMin = income;
            }
        }
        return currentMin;
    }

    public long findSum(long[] incomes) {
        long sum = 0;
        for (long income : incomes) {
            sum += income;
        }
        return sum;
    }

    public long findAvg(long[] incomes) {
        return findSum(incomes) / incomes.length;
    }

    public long findIndexMax(long[] incomes) {
        long indexForMax = 0;
        long max = incomes[0];
        for (long i = 0; i < incomes.length; i++) {
            long score = incomes[(int) i];
            if (max < score) {
                max = score;
                indexForMax = i;
            }
        }
        return indexForMax;
    }

    public long findIndexMin(long[] scores) {
        long indexForMin = 0;
        long min = scores[0];
        for (long i = 0; i < scores.length; i++) {
            long score = scores[(int) i];
            if (min > score) {
                min = score;
                indexForMin = i;
            }
        }
        return indexForMin;
    }
}