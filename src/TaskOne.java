import java.util.Scanner;

// TODO: Напишите программу, которая принимает два числа от пользователя
//  и выводит их сумму и среднее значение
public class TaskOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] arrayNumb = new double[2];
        String resultSTR = "", result;
        double summa = 0;

        // Проверка на ввод числа и заполнение массива введенными числами
        for (int i = 0; i < arrayNumb.length; i++) {
            do {
                System.out.print("Введите число: ");
                result = scan.nextLine();
                try {
                    arrayNumb[i] = Double.parseDouble(result);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число");
                }
            } while (true);
        }
        System.out.println();

        // Составляем общую результирующую строку и высчитываем сумму элементов массива
        for (int i = 0; i < arrayNumb.length; i++) {
            resultSTR += arrayNumb[i];
            summa += arrayNumb[i];

            if (i < arrayNumb.length - 1) {
                resultSTR += " и ";
            }
        }

        System.out.println("Сумма чисел " + resultSTR + ": " + summa);
        System.out.println("Среднее значение чисел " + resultSTR + ": " + summa / arrayNumb.length);
    }
}
