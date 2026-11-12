package lab1;

import java.util.Scanner;

public class Task5Time {
    public static void run(Scanner scan) {
        System.out.print("Введіть кількість секунд: ");

        if (!scan.hasNextLong()) {
            System.out.println(
                    "Помилка! Введіть ціле невід'ємне число секунд."
            );
            scan.next();
            return;
        }

        long totalSeconds = scan.nextLong();

        if (totalSeconds < 0) {
            System.out.println(
                    "Кількість секунд не може бути від'ємною."
            );
            return;
        }

        long hours = totalSeconds / 3600;
        long minutes = (totalSeconds % 3600) / 60;
        long seconds = totalSeconds % 60;

        System.out.printf(
                "Час: %02d:%02d:%02d%n",
                hours, minutes, seconds
        );
    }
}
