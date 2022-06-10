// Given an integer number n, 
// return the difference between the product of its digits and the sum of its digits.

public class task5 {
    public static void main(String[] args) {
        difference(44219); 
    }
    public static void difference(int n) {
        int prod = 1;
        int sum = 0;
        int digits = n;
        while (digits > 0) {
            int res = digits % 10;
            prod = prod * res;
            sum = sum + res;
            digits = digits/10;
        }
        int diff = prod - sum;
        System.out.println(diff);

    }
}
