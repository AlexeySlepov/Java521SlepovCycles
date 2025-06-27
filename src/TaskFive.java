import java.util.Scanner;

public class TaskFive {
    // TODO: Напишите программу, которая выводит числа от N до 1 в обратном порядке.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        int number = 0;
        // Цикл выполняется до тех пор, пока не будет введено целое число
        do {
            System.out.print("Введите положительное целое число: ");
            result = scan.nextLine();
            try {
                number = Integer.parseInt(result);
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Вы ввели не положительное целое число");
                }
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не верные данные");
            }
        } while (true);

        for (; number > 0; number--) {
            System.out.println(number);
        }
    }
}
