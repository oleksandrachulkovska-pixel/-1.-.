package lab1;

import java.util.Scanner;

public class Task4Power {
    public static void run(Scanner scan) {
        System.out.print("Введіть число a: ");

        if (!scan.hasNextDouble()) {
            System.out.println("Помилка! Потрібно ввести число.");
            scan.next();
            return;
        }

        double a = scan.nextDouble();

        if (!Double.isFinite(a)) {
            System.out.println("Потрібно ввести скінченне число.");
            return;
        }

        double a2 = a * a;
        double a3 = a2 * a;
        double a6 = a3 * a3;

        System.out.printf("a у шостому степені: %.2f%n", a6);
    }
}
