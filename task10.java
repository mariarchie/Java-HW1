// You are given two strings word1 and word2. Merge the strings by adding letters 
// in alternating order, starting with word1. 
// If a string is longer than the other, append the additional 
// letters onto the end of the merged string.


public class task10 {
    public static void main(String[] args) {
    System.out.println(merge("a2gthb", "dgf"));
    }
    
    public static String merge(String world1, String world2) {
        int i = 0;
        StringBuilder merged = new StringBuilder();
        while (i < world1.length() || i < world2.length()) {
            if (i < world1.length())
                merged.append(world1.charAt(i));
            if (i < world2.length())
                merged.append(world2.charAt(i));
            i++;
        }
        return merged.toString();
    }
}

