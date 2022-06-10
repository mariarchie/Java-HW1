
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

public class task8 {
    static char[] textGlobal;
    static List<Integer> signIndexesGlobal;
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> signIndexes = new ArrayList<>();
        String text = "2? + 3? = ??";
        char[] textChar = text.replace(" ", "").toCharArray();

        for (int i = 0; i < textChar.length; i++) {
            if (textChar[i] == '+' || textChar[i] == '=') {
                textChar[i] = '-';
            }
            if (textChar[i] == '?') {
                signIndexes.add(i);
            }
        }
    
        textGlobal = textChar;
        signIndexesGlobal = signIndexes;
        combWithRep(new int[signIndexes.size()], 0, 10);
    }

    public static void combWithRep (int[] comb, int index, int K) {
        if (index == comb.length) {  
            checkComb(comb);
            return;
        }
        for (int i = 0; i < K; i++) {
            comb[index] = i;
            combWithRep(comb, index+1, K);
        }
    }
    public static void checkComb (int[] comb) {
        for (int i = 0; i < comb.length; i++) {
            textGlobal [signIndexesGlobal.get(i)] = Character.forDigit(comb[i], 10);
        }
        String [] numbers = String.valueOf(textGlobal).split("-");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int c = Integer.parseInt(numbers[2]);

        if (a + b == c) {
            System.out.printf("%d + %d = %d", a, b, c);
            System.out.println();
        }
    }
}
