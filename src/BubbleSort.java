import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 4}; // исходный массив чисел
        System.out.println("Исходный массив: " + Arrays.toString(arr));

        try {
            FileWriter writer = new FileWriter("log.txt");
            writer.write("Исходный массив: " + Arrays.toString(arr) + "\n");

            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                // запись текущего состояния массива в лог-файл
                writer.write("После итерации " + (i + 1) + ": " + Arrays.toString(arr) + "\n");
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}