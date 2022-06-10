// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом (возвращает boolean значение)

public class task6 {
    public static void main(String[] args) {
        System.out.println(polind("aabaa"));
    }
    public static boolean polind(String s) {
     
        for (int i = 0;i < s.length()/2;++i){
            if (s.charAt(i) != s.charAt((s.length()-1)-i)) {
                return false;
            }
        }
        return true;
    }
}
