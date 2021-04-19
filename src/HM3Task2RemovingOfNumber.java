import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HM3Task2RemovingOfNumber {
    public static void main(String[] args) {
        System.out.println("Программа удаляет введенное Вами число (при его наличии) в массиве.");

        boolean flag = true;
        while (flag == true){
            //создаем массив чисел
            int n = 5; // количество чисел массива
            int[] arrayOfNumbers = new int[n];
            Random rand = new Random();
            for (int i = 0; i < n; i++){
                arrayOfNumbers[i] = rand.nextInt(50);
            }
            System.out.println(Arrays.toString(arrayOfNumbers));
            Scanner numbInput = new Scanner(System.in);
            System.out.println("Введите число, которое удалить в массиве:");
            int numb = numbInput.nextInt();

            //считаем количество элементов, которые надо удалить
            Arrays.sort(arrayOfNumbers);
            int pos = Arrays.binarySearch(arrayOfNumbers, numb);
            if (pos < 0){
                System.out.println("Число " + numb + " в массиве не содержится.");
            } else {
                int countingDel = 0;
                for (int i = 0; i < arrayOfNumbers.length; i++){
                    if (numb == arrayOfNumbers[i]){
                        countingDel++;
                    }
                }

                int[] arrayNew = new int[arrayOfNumbers.length - countingDel];
                int j = 0;
                for (int i = 0; i < arrayOfNumbers.length; i++){
                    if (numb != arrayOfNumbers[i]){
                        arrayNew[j] =arrayOfNumbers[i];
                        j++;
                    }
                }
                System.out.println(Arrays.toString(arrayNew));
            }

            Scanner in = new Scanner(System.in);
            System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
            int flag1 = in.nextInt();
            flag = (flag1 == 1);
        }
    }
}
