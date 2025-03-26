package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        String[] numbers = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

        System.out.println(getDigitName(5, numbers));

    }

    public static String getDigitName(int digit, String[] numbers) {
        return numbers[digit -1];
    }
}