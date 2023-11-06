package Seminar4.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class BookServiceTest {
    /**
     Домашнее задание 2
     У вас есть класс BookService,
     который использует интерфейс BookRepository для получения информации о книгах из базы данных.
     Ваша задача написать unit-тесты для BookService, используя Mockito для создания мок-объекта BookRepository.
     */
    @Test
    void bookServiceTest(){
        BookRepository mockBookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(mockBookRepository);
        List<Book> book = new ArrayList<>();
        book.add(new Book("1", "Book1", "Author1"));
        book.add(new Book("2", "Book2", "Author2"));
        when(mockBookRepository.findById("1")).thenReturn(book.get(0));
        when(mockBookRepository.findById("2")).thenReturn(book.get(1));
        when(mockBookRepository.findAll()).thenReturn(book);
        assertThat(bookService.findBookById("1")).isEqualTo(book.get(0));
        assertThat(bookService.findBookById("2")).isEqualTo(book.get(1));
        assertThat(bookService.findAllBooks()).isEqualTo(book);
    }

}