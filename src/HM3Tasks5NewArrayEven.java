import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HM3Tasks5NewArrayEven {
    public static void main(String[] args) {
        System.out.println("Программа создает массив целых чисел, а потом его четные элементы выводит отдельным массивом.");

        boolean flag = true;
        while (flag == true){
            //указываем размер массива
            Scanner in = new Scanner(System.in);
            System.out.println("Укажите, какого размера создать массив, но не меньше 5 и не больше 11.");
            int sizeOfArray = in.nextInt();
            if (sizeOfArray < 5 || sizeOfArray > 11) {
                System.out.println("Размер массива не соответствует условию.");
                Scanner in1 = new Scanner(System.in);
                System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
                int dop = in1.nextInt();
                if (dop == 1) {
                    Scanner in2 = new Scanner(System.in);
                    System.out.println("Укажите, какого размера создать массив, но не меньше 5 и не больше 11.");
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


            //считаем количество четных элементов
            int sizeNew = 0;
            for (int i = 0; i <arrayOfNumbers.length; i++){
                if (arrayOfNumbers[i]%2 == 0){
                    sizeNew++;
                }
            }

            //создаем массив из четных чисел
            int[] arrayEven = new int[sizeNew];
            int index = 0;
            for (int i = 0; i < arrayOfNumbers.length; i++){
                if (arrayOfNumbers[i]%2 == 0){
                    arrayEven[index] = arrayOfNumbers[i];
                    index++;
                }
            }
            System.out.println("Новый массив: " + Arrays.toString(arrayEven));

            Scanner output = new Scanner(System.in);
            System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
            int flag1 = output.nextInt();
            flag = (flag1 == 1);
        }
    }
}
