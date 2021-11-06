package ru.netology.sqr;

public class SQRService {
    public int sqrNumbers (int minBorder, int maxBorder) {

        int numbers = 0;

        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (sqr >= minBorder) {
                if (sqr <= maxBorder) {
                    numbers++;
                }
            }
        }

        return numbers;
    }
}