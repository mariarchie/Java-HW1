// Напишите метод, который сжимает строку. 
// Пример: вход aaaabbbcdd, результат - a4b3cd2

public class task7 {
    public static void main(String[] args) {
        System.out.println(logger("aabaaffffasftttt"));
    }
    public static String logger(String s) {
        String res = "";
        int count = 1;
        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == s.charAt(i-1)) {
                count+=1;
            }
            else {
                res += s.charAt(i-1)+Integer.toString(count);
                count = 1;
            }
        }
        res += s.charAt(s.length()-1) + Integer.toString(count);
        return res;
    }
}
