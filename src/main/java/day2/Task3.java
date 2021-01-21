package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Введите число: ");
        int b = scanner.nextInt();

        if (a >= b){
            System.out.println("Некорректный ввод");
        }

        while (a<b){
            a++;
            if (a % 5 == 0 && a % 10 != 0 && a != b){
                System.out.print(a + " ");
            }
        }

    }
}
