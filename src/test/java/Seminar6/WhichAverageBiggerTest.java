package Seminar6;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static Seminar6.WhichAverageBigger.whichListBigger;

class WhichAverageBiggerTest {

    @Test
    void whichListBiggerTest() {
        List<Integer> emptyList = new ArrayList<>();
        List<Integer> listLess = new ArrayList<>();
        List<Integer> listEqualLess = new ArrayList<>();
        List<Integer> listBigger = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listLess.add(i);
            listEqualLess.add(i);
            listBigger.add(i + 1);
        }

        assert (whichListBigger(emptyList, emptyList).equals("Средние значения равны"));
        assert (whichListBigger(listLess, listEqualLess).equals("Средние значения равны"));
        assert (whichListBigger(listBigger, listLess)).equals("Первый список имеет большее среднее значение");
        assert (whichListBigger(listLess, listBigger)).equals("Второй список имеет большее среднее значение");

    }
}