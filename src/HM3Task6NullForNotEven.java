import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HM3Task6NullForNotEven {
    public static void main(String[] args) {
        System.out.println("Программа заменяет в массиве числа с нечетным индексом на 0.");

        boolean flag = true;
        while (flag == true){
            //указываем размер массива
            Scanner in = new Scanner(System.in);
            System.out.println("Укажите, какого размера создать массив.");
            int sizeOfArray = in.nextInt();
            if (sizeOfArray <=0) {
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
            for (int i = 0; i < sizeOfArray; i++){
                arrayOfNumbers[i] = rand.nextInt(100);
            }
            System.out.println("Исходный массив: " + Arrays.toString(arrayOfNumbers));

            //заменяем элементы с нечетным индексом на 0. Элемент с индексом ноль не трогаем
            for (int i = 1; i < arrayOfNumbers.length; i +=2){
                arrayOfNumbers[i] = 0;
            }
            System.out.println("Итоговый массив: " + Arrays.toString(arrayOfNumbers));


            Scanner output = new Scanner(System.in);
            System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
            int flag1 = output.nextInt();
            flag = (flag1 == 1);
        }
    }
}
