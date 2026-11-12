package lab1;

import java.util.Scanner;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== ЛАБОРАТОРНА РОБОТА № 1 =====");
            System.out.println("Варіант 25");
            System.out.println("1. Обчислення формули");
            System.out.println("2. Площа квадрата");
            System.out.println("3. Довжина вектора");
            System.out.println("4. Обчислення степеня");
            System.out.println("5. Переведення секунд у час");
            System.out.println("0. Вихід");
            System.out.print("Виберіть завдання: ");

            if (!scan.hasNextInt()) {
                System.out.println("Помилка! Введіть номер пункту.");
                scan.next();
                continue;
            }

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    Task1Formula.run(scan);
                    break;
                case 2:
                    Task2Square.run(scan);
                    break;
                case 3:
                    Task3Vector.run(scan);
                    break;
                case 4:
                    Task4Power.run(scan);
                    break;
                case 5:
                    Task5Time.run(scan);
                    break;
                case 0:
                    System.out.println("Програму завершено.");
                    scan.close();
                    return;
                default:
                    System.out.println(
                            "Такого пункту немає. Спробуйте ще раз."
                    );
            }
        }
    }
}
