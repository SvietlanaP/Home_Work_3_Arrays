import java.util.Arrays;

public class HM3Task7NameOfPeople {
    public static void main(String[] args) {
        System.out.println("Программа сортирует массив имен.");
        String[] arrayName = {"Wika", "Kolya", "Olya", "Mary", "Dima", "Ivan", "Sveta", "Lena", "Grisha", "Rita"};
        System.out.println("Исходный массив: " + Arrays.toString(arrayName));
        Arrays.sort(arrayName);
        System.out.println("Отсортированный массив: " + Arrays.toString(arrayName));
    }
}
