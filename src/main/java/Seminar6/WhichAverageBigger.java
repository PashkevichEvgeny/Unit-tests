package Seminar6;

import java.util.List;

public class WhichAverageBigger {

    /**
     * a. Рассчитывает среднее значение каждого списка.
     * b. Сравнивает эти средние значения и выводит соответствующее сообщение:
     * - "Первый список имеет большее среднее значение", если среднее значение первого списка больше.
     * - "Второй список имеет большее среднее значение", если среднее значение второго списка больше.
     * - "Средние значения равны", если средние значения списков равны.
     */

    public static String whichListBigger(List<Integer> firstList, List<Integer> secondList) {
        int average1 = getAverage(firstList);
        int average2 = getAverage(secondList);
        if (average1 > average2) {
            return "Первый список имеет большее среднее значение";
        } else if (average1 < average2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
    private static int getSum(List<Integer> array) {
        int sum = 0;
        for (int n: array) sum += n;
        return sum;
    }
    private static int getAverage(List<Integer> array) {
        if (array.isEmpty()) return 0;
        return getSum(array) / array.size();
    }
}
