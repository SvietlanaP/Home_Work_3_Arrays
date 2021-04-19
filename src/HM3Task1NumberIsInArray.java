import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HM3Task1NumberIsInArray {
    public static void main(String[] args) {
        System.out.println("Программа проверяет есть ли введенное Вами число в массиве.");

        boolean flag = true;
        while (flag == true){
            //создаем массив чисел
            int n = 100; // количество чисел массива
            int[] arrayOfNumbers = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++){
                arrayOfNumbers[i] = rand.nextInt(50);
            }

            Scanner numbInput = new Scanner(System.in);
            System.out.println("Введите число, которое найти в массиве:");
            int numb = numbInput.nextInt();

            Arrays.sort(arrayOfNumbers);
            int pos = Arrays.binarySearch(arrayOfNumbers, numb);
            if (pos < 0){
                System.out.println("Число " + numb + " в массиве не содержится.");
            } else {
                System.out.println("Число " + numb + " в массиве содержится на позиции.");
            }

            Scanner in = new Scanner(System.in);
            System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
            int flag1 = in.nextInt();
            flag = (flag1 == 1);
        }
    }
}
