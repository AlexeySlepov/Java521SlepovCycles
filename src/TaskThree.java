import java.util.Scanner;

public class TaskThree {
    //TODO: Напишите программу, которая вычисляет факториал числа, введенного пользователем.
    static int factorial = 1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "";
        int number;
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

        factorial(number);

        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    static void factorial(int numb) {
        for (int i = 1; i <= numb; i++) {
            factorial *= i;
        }
    }
}
