// // Попробовать сгенерировать все перестановки длины N из K чисел с повторениями. 
// // Пример: N = 2, K = 3 ответ "00 01 02 10 11 12 20 21 22"

public class task3 {
    public static void main(String[] args) {
        collections(2, 5, "");

    }
    public static void collections (int N, int K, String digits) {
        for (int i = 0; i<K; i++) {
            for (int j = 0; j<K; j++){
            digits = digits + i + j + " ";    
            }
        }
        System.out.println(digits);
    }
}