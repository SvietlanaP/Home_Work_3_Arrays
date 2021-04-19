import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HM3Tasks3MinMaxMiddle {
    public static void main(String[] args) {
        System.out.println("Программа выводит, максимальное, минимальное и среднее значение.");

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
            double[] arrayOfNumbers = new double[sizeOfArray];
//          Random rand = new Random();
            for (int i = 0; i < sizeOfArray; i++){
                 arrayOfNumbers[i] = Math.random();
            }
            System.out.println(Arrays.toString(arrayOfNumbers));

            //ищем max, min, middle
//            Arrays.sort(arrayOfNumbers);
//            double maxNumber = arrayOfNumbers[sizeOfArray-1];
//            System.out.println("Максимально число равно " + maxNumber);
//            double minNumber = arrayOfNumbers[0];
//            System.out.println("Минимальное число равно " + minNumber);
            double maxNumber = arrayOfNumbers[0], minNumber = arrayOfNumbers[0];
            for (int i =1; i < sizeOfArray; i++){
                maxNumber = Math.max(maxNumber, arrayOfNumbers[i]);
                minNumber = Math.min(minNumber, arrayOfNumbers[i]);
            }
            System.out.println("Максимально число равно " + maxNumber);
            System.out.println("Минимальное число равно " + minNumber);
            double middleNumber = 0;
            for (int i = 0; i < arrayOfNumbers.length; i++){
                middleNumber+= arrayOfNumbers[i];
            }
            double middle = middleNumber / arrayOfNumbers.length;
            System.out.println("Среднее число равно " + middle);

            Scanner output = new Scanner(System.in);
            System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
            int flag1 = output.nextInt();
            flag = (flag1 == 1);
        }
    }
}
