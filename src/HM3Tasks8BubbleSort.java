import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HM3Tasks8BubbleSort {
    public static void main(String[] args) {
        System.out.println("Программа сортирует созданный массив методом пузырька.");

        boolean flag = true;
        while (flag == true){
            //указываем размер массива
            Scanner in = new Scanner(System.in);
            System.out.println("Укажите, какого размера создать массив.");
            int sizeOfArray = in.nextInt();
            if (sizeOfArray <= 1) {
                System.out.println("Размер массива должен быть больше 1.");
                Scanner in1 = new Scanner(System.in);
                System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
                int dop = in1.nextInt();
                if (dop == 1) {
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("Укажите, какого размера создать массив.");
                    sizeOfArray = in2.nextInt();
                } else{
                    break;
                }
            }

            //создаем массив
            Random rand = new Random();
            int[] arrayOfNumbers = new int[sizeOfArray];
            for (int i = 0; i < arrayOfNumbers.length; i++){
                arrayOfNumbers[i] = rand.nextInt(50);
            }
            System.out.println("Исходный массив: " + Arrays.toString(arrayOfNumbers));


            //sort
            for (int i = arrayOfNumbers.length-1; i > 0; i--){
                for (int j = 0; j < i; j++){
                    if (arrayOfNumbers[j] > arrayOfNumbers[j+1]){
                        int temp = arrayOfNumbers[j];
                        arrayOfNumbers[j] = arrayOfNumbers[j+1];
                        arrayOfNumbers[j+1] = temp;
                    }
                }
            }
            System.out.println("Отсортированный массив: " + Arrays.toString(arrayOfNumbers));

            Scanner output = new Scanner(System.in);
            System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
            int flag1 = output.nextInt();
            flag = (flag1 == 1);
        }
    }
}
