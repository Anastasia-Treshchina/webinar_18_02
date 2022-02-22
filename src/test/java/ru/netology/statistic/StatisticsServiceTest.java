package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void shouldFindMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 3;
        long actual = service.findMin(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindSum() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 85;
        long actual = service.findSum(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAvg() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 7;
        long actual = service.findAvg(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindIndexMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 1;
        long actual = service.findIndexMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindIndexMin() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 5;
        long actual = service.findIndexMin(incomesInBillions);
        assertEquals(expected, actual);
    }
}