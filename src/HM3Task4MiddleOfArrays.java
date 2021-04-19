import java.util.Arrays;
import java.util.Scanner;

public class HM3Task4MiddleOfArrays {
    public static void main(String[] args) {
        System.out.println("Программа сравнивает среднее значение двух массивов.");

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
            double[] arrayOfNumbers1 = new double[sizeOfArray], arrayOfNumbers2  = new double[sizeOfArray];
            for (int i = 0; i < sizeOfArray; i++){
                arrayOfNumbers1[i] = Math.random() * 50;
                arrayOfNumbers2[i] = Math.random() * 50;
            }
            System.out.println("Первый массив: " + Arrays.toString(arrayOfNumbers1));
            System.out.println("Второй массив: " + Arrays.toString(arrayOfNumbers2));

            //ищем middle
            double middleNumber1 = 0, middleNumber2 = 0;;
            for (int i = 0; i < sizeOfArray; i++){
                middleNumber1 += arrayOfNumbers1[i];
                middleNumber2 += arrayOfNumbers2[i];
            }
            double middle1 = middleNumber1 / arrayOfNumbers2.length;
            double middle2 = middleNumber2 / arrayOfNumbers2.length;

            //сравниваем
            if (middle1 > middle2){
                System.out.println("Среднее значение элементов первого массива оказались больше.");
            } else if (middle1 < middle2){
                System.out.println("Среднее значение элементов второго массива оказались больше.");
            } else {
                System.out.println("Средние значения элементов двух массивов оказались равны.");
            }

            Scanner output = new Scanner(System.in);
            System.out.println("Хотите попробовать еще? Если да, то нажмите 1, если нет, то нажмите 0.");
            int flag1 = output.nextInt();
            flag = (flag1 == 1);
        }
    }

}
