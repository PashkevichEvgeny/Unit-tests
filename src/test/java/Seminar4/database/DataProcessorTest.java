package Seminar4.database;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DataProcessorTest {
    /** Задание 4.6
       Вам требуется протестировать класс, который обрабатывает запросы к базе данных.
       Условие: У вас есть класс Database с методом public List<String> query(String sql),
       который выполняет SQL запрос и возвращает результат.
       Вам необходимо проверить правильность работы класса DataProcessor, который использует Database для
       выполнения запроса и обработки результатов.
     */

    @Test
    void dataProcessorTest(){
        Database fakeDatabase = mock(Database.class);
        DataProcessor dataProcessor = new DataProcessor(fakeDatabase);
        List<String> res = dataProcessor.processData("SelectAll");
        assertEquals(res, fakeDatabase.query("SelectAll"));
    }

}