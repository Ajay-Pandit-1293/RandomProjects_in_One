package GamesAsProject;

import java.util.Scanner;

public class Game2 {
    public static void main(String[] args) {
        int secretCode = 1293;
        int target = (int)(Math.random() * 1000);
        int attempts = 5;
        boolean guessed = false;

        Scanner sc = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("Guess the number (" + attempts + " attempts left): ");
            int num = sc.nextInt();

            if (num < target) {
                System.out.println("Na Na Na mitter, tera number chhota hai! Bada daal.");
            } else if (num > target) {
                System.out.println("Kuch jyada bada daal diya mitter! Thoda chhota daal.");
            } else {
                System.out.println("Bohot badhiya mere dost! Tune number guess kar liya 🎉 Dawat pakki 😄");
                guessed = true;
                break;
            }

            attempts--;

            if (attempts == 0) {
                System.out.println("Want 5 more attempts? Enter secret code:");
                int code = sc.nextInt();
                if (code == secretCode) {
                    attempts = 5;
                    System.out.println("Code sahi hai! 5 aur chances mil gaye 😎");
                } else {
                    System.out.println("Galat code! Game khatam bhai 😆");
                    break;
                }
            }
        }

        if (!guessed) {
            System.out.println("Number tha: " + target + " 😜");
        }

        sc.close();
    }
}
