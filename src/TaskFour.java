import java.util.Scanner;

public class TaskFour {
    // TODO: Напишите программу, которая выводит таблицу умножения для числа, введенного пользователем.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String result = "", resultSTR = "";
        int number;
        // Цикл выполняется до тех пор, пока не будет введено целое число
        do {
            System.out.print("Введите целое число: ");
            result = scan.nextLine();
            try {
                number = Integer.parseInt(result);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Вы ввели не верные данные");
            }
        } while (true);

        for (int i = 1; i <= 10; i++) {
            resultSTR += number + " * " + i + " = " + number * i + "\n";
        }

        System.out.println(resultSTR);
    }
}
