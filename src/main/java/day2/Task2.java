package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Введите число: ");
        int b = scanner.nextInt();

        if (a<b) {
            for (int i = a; i < b; i++) {
                if (i > a && i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Ошибка ввода!");
            System.out.println("Первое число не может быть больше второго!");
        }
    }
}
