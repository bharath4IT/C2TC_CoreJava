public class ReversePalindrome {
    public static void main(String args[]) {
        String str = "WOW";
        String reverse = " ";
        int length = str.length();
        for (int i = 0; i < length; i++) {
            reverse = str.charAt(i) + reverse;
        }
        // System.out.println(reverse);
        if (str.equals(reverse)) {
            System.out.println("is a palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}