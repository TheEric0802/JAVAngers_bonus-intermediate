package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] numbers = {"Eins", "Zwei", "Drei", "Vier", "Fünf", "Sechs", "Sieben", "Acht", "Neun", "Zehn"};

        System.out.println(getDigitName(5, numbers));

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("#");
            }
            if (i % 5 == 0) {
                System.out.print("$");
            }
            System.out.println(i);
        }

        String[] words = new String[0];
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("type a word to save in array, exit program with 'stop': ");
            String word = input.next();

            if (word.equals("stop")) {
                break;
            }

            String[] newWords = new String[words.length + 1];
            System.arraycopy(words, 0, newWords, 0, words.length);
            newWords[newWords.length - 1] = word;
            words = newWords;

            System.out.println("your saved words are: ");

            for (String w : words) {
                System.out.println(w);
            }
        }
    }

    public static String getDigitName(int digit, String[] numbers) {
        return numbers[digit -1];
    }
}