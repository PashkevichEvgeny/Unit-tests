package Seminar4.message;

import org.assertj.core.api.FactoryBasedNavigableIterableAssert;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Scanner;

class NotificationServiceTest {

    /**
     Задание 4.5
     Вам нужно написать тест с использованием моков для сервиса отправки сообщений.
     Условие:
     У вас есть класс MessageService с методом public void sendMessage(String message, String recipient),
     который отправляет сообщение получателю.
     Вам необходимо проверить правильность работы класса NotificationService,
     который использует MessageService для отправки уведомлений.
     */

    @Test
    void notificationServiceTest(){
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Hello", "Somebody");
        verify(messageService, times(1)).sendMessage("Hello", "Somebody");
    }
}