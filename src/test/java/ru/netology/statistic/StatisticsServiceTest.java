package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistic.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

//    @Test
//    void findMax() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 12;
//
//        long actual = service.findMax(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }

//    @Test
//    void findMin() {
//        StatisticsService service = new StatisticsService();
//
//        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 3;
//
//        long actual = service.findMin(incomesInBillions);
//
//        assertEquals(expected, actual);
//    }

//    @org.junit.jupiter.api.Test
//    void maxFirst() {
//        StatisticsService service = new StatisticsService();
//        long[] purchases = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
//        long expected = 0;
//
//        // вызываем целевой метод:
//        long actual = service.maxFirst(purchases);
//
//        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }
    @org.junit.jupiter.api.Test
    void max() {
        StatisticsService service = new StatisticsService();
        long[] purchases = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 10;

        // вызываем целевой метод:
        long actual = service.max(purchases);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
