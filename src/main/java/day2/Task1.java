package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Пожалуйста введите количество этажей в здании: ");
        int x = scanner.nextInt();

        if (x > 0 && x <= 4){
            System.out.println("Малоэтажный дом");
        }
        else if (x > 4 && x <= 8){
            System.out.println("Среднеэтажный дом");
        }
        else if (x >= 9) {
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Error..");
        }
    }
}
