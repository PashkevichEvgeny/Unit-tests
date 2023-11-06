package Seminar4.hotel;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class BookingServiceTest {

    /**
     * Задание 4.4
    Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
    Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId),
    который обычно проверяет, доступен ли номер в отеле.
    Вам необходимо проверить правильность работы класса BookingService, который
    использует HotelService для бронирования номера, если он доступен.
     **/

    @Test
    void bookingServiceTest(){
        HotelService mockHotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(mockHotelService);
        when(mockHotelService.isRoomAvailable(1)).thenReturn(true);
        when(mockHotelService.isRoomAvailable(2)).thenReturn(false);
        boolean room = bookingService.bookRoom(1);
        boolean room2 = bookingService.bookRoom(2);
        assertThat(room).isTrue();
        assertThat(room2).isFalse();

    }

}