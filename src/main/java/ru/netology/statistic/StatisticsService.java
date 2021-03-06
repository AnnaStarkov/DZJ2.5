package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param purchases - array of incomes
     * @return - index of first max value
     */
//    public long findMax(long[] incomes) {
//        long current_max_index = 0;
//        long current_max = incomes[0];
//        for (long income : incomes)
//            if (current_max < income) {
//                current_max = income;
//            }
//        return current_max;
//    }

//    public long findMin(long[] incomes) {
//        long current_min_index = 0;
//        long current_min = incomes[0];
//        for (long income : incomes)
//            if (current_min > income)
//                current_min = income;
//        return current_min;
//    }

//    public long maxFirst(long[] purchases) {
//        long max = purchases[0];
//        long index = 0;
//        for (int i = 0; i < purchases.length; i++) {
//            if (purchases[i] > max) {
//                max = purchases[i];
//                index = i;
//            }
//        }
//        return index;
//    }

    public long max(long[] purchases) {
        long max = purchases[0];
        long index = 0;
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] >= max) {
                max = purchases[i];
                index = i;
            }
        }
        return index;
    }
}
