import java.util.Arrays;

// // Попробовать сгенерировать все перестановки длины N из K чисел с повторениями. 
// // Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"

public class task3 {
    public static void main(String[] args) {
        int N = 2;
        collections(new int[N], 0, 3);
    }
    public static void collections (int[] array, int index, int K) {
        if (index == array.length){
            System.out.println(Arrays.toString(array));
            return;
        }
        for (int i = 0; i < K; i++) {
            array[index] = i;
            collections(array, index+1, K);
        }
    }
}