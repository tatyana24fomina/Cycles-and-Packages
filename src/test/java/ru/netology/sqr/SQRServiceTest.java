package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    public void shouldSqrNumbers() {
        SQRService service = new SQRService();

        // подготавливаем данные:
        int expected = 3;

        int actual = service.sqrNumbers(200, 300);
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}
